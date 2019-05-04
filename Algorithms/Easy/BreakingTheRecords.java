import java.util.Scanner;

public class BreakingTheRecords {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int totalGames = sc.nextInt();
		int minScoreRecordBroken = 0;
		int maxScoreRecordBroken = 0;
		
		if(totalGames > 1){
			int minScore = 0;
			int maxScore = 0;
			
			int current = sc.nextInt();
			maxScore = current;
			minScore = current;
			
			for(int i = 1; i < totalGames; i++){
				current = sc.nextInt();
				
				if (current < minScore){
					minScore = current;
					minScoreRecordBroken++;
				} 
				if (current > maxScore){
					maxScore = current;
					maxScoreRecordBroken++;
				} 
			}
		} 			
		System.out.println(maxScoreRecordBroken + " " + minScoreRecordBroken);
		
		sc.close();
	}
}