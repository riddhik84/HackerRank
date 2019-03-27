import java.util.*;
import java.io.*;

public class SimpleArraySum {
	static int simpleArraySum(int[] ar) {
		int sum = 0;
		for (int i : ar){
			sum = sum + i;
		}
        return sum;
    }

    public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int[] array = new int[total];
		for(int i = 0; i < total; i++){
			array[i] = sc.nextInt();
		}
		System.out.println(simpleArraySum(array));
		sc.close();
		
    }
}