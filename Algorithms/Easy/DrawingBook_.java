import java.util.Scanner;

public class DrawingBook_{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int p = scanner.nextInt();
		
		int front = Math.abs((p) / 2);
		if(n%2==0){
			n++;
		}
		int back = Math.abs((p - (n)) / 2);
		System.out.println(front < back ? front : back);
		
	}
}