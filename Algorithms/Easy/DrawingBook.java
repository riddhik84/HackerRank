import java.util.Scanner;

public class DrawingBook{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		int totalPages = scanner.nextInt();
		int pageToOpen = scanner.nextInt();
		
		if(pageToOpen == totalPages || pageToOpen == 1){
			System.out.println(0);
		} else if (totalPages%2 != 0 && pageToOpen - 1 == totalPages - 1) 
			System.out.println(0);
		else {
			int countFront = 0;
			int countBack = 0;
			
			for(int i = 1; i < totalPages;){
				if(i == pageToOpen || i-1 == pageToOpen){
					break;
				} else {
					++countFront;
					i = i + 2;
				}
			}
			
			for(int i = totalPages; i >= 1;){
				if(i == pageToOpen || i+1 == pageToOpen){
					break;
				} else {
					++countBack;
					i = i - 2;
				}
			}
			
			if(totalPages%2 != 0){
				--countBack;
			}
			
			System.out.println(countFront > countBack ? countBack : countFront);
		}
	}
}