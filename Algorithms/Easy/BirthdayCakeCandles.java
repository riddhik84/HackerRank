import java.io.*;
import java.util.*;

public class BirthdayCakeCandles {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int max = 0;
        HashMap<Integer, Integer> candles = new HashMap<>();
        for(int i = 0; i < total; i++){
            int tmp = sc.nextInt();
            if(max < tmp){
                max = tmp;
            }
            if(candles.containsKey(tmp)){
                int counter = candles.get(tmp);
                candles.put(tmp, ++counter);
            } else {
                candles.put(tmp, 1);
            }
        }
        System.out.println(candles.get(max));
    }
}