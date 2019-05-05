import java.util.Scanner;
import java.util.HashMap;

public class MigratoryBirds {
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		int arrayCount = scanner.nextInt();
		
		HashMap<Integer, Integer> birdCounterMap = new HashMap<Integer, Integer>();
		int maxValue = 0;
		int minKey = Integer.MAX_VALUE;
		
		for(int i = 0; i < arrayCount; i++){
			int count = scanner.nextInt();
			
			if(birdCounterMap.containsKey(count)){
				int value = birdCounterMap.get(count);
				value = ++value;
				birdCounterMap.put(count, value);
				
				if(maxValue < value){					
					maxValue = value;
					minKey = count;
					System.out.println("maxValue: " + maxValue);
				}
				if(maxValue == value && minKey > count){
					System.out.println("minKey: " + minKey);
					minKey = count;
				}
			} else {
				birdCounterMap.put(count, 1);
			}
		}
		System.out.println(minKey);
		
		scanner.close();
	}
}