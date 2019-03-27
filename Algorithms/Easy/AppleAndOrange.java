import java.util.*;

public class AppleandOrange {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int startpoint = sc.nextInt();
        int endpoint = sc.nextInt();
        int appleTree = sc.nextInt();
        int orangeTree = sc.nextInt();
        int apples = sc.nextInt();
        int oranges = sc.nextInt();
        int[] appleDistance = new int[apples];
        int[] orangeDistance = new int[oranges];
        
        for(int i = 0; i < apples; i++){
            appleDistance[i] = sc.nextInt();
        }
        for(int j = 0; j < oranges; j++){
            orangeDistance[j] = sc.nextInt();
        }
        
        int appleCounter = 0;
        int orangeCounter = 0;
        
        for(int a: appleDistance){
            int tmp = a + appleTree;
            if(tmp >= startpoint && tmp <= endpoint){
                appleCounter++;
            }
        }
        
        for(int o: orangeDistance){
            int tmp = o + orangeTree;
            if(tmp >= startpoint && tmp <= endpoint){
                orangeCounter++;
            }
        }
        
        System.out.println(appleCounter);
        System.out.println(orangeCounter);
    }
}