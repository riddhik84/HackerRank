import java.util.Scanner;

public class BirthdayChocolate {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int totalSquares = sc.nextInt();
		int[] barArray = new int[totalSquares];
		
		for(int i = 0; i < totalSquares; i++){
			barArray[i] = sc.nextInt();
		}
		
		int barSum = sc.nextInt();
		int barCount = sc.nextInt();
		int output = 0;
		
		if(barArray.length == 1 && barCount == 1){
			if(barArray[0] == barSum){
				System.out.println(1);
			}
		} else {
			for(int i = 0; i <= barArray.length - barCount; i++){
				int sum = 0;
				int counter = 0;
				//System.out.println("i: " + i);
				
				for(int j = i; counter < barCount; j++, counter++){
					sum = sum + barArray[j];
				}
				//System.out.println("sum: " + sum);
				if(sum == barSum){
					output++;
				}
			}
			System.out.println(output);
		}
		
		sc.close();
	}
}