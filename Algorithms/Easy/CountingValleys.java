import java.util.Scanner;

public class CountingValleys {
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		int steps = scanner.nextInt();
		char[] trips = (scanner.next()).toCharArray();
		int stepCounter = 0;
		int valleys = 0;
		
		for(int i = 0; i < trips.length; i++){
			if(trips[i] == 'U'){
				++stepCounter;
			} else if (trips[i] == 'D'){
				--stepCounter;
			}
			
			//System.out.print(stepCounter + " ");
			if(stepCounter == 0 && trips[i] == 'U'){
				++valleys;
			}
		}
		System.out.println(valleys);
	}
}

