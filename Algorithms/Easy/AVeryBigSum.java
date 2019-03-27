import java.util.*;
import java.io.*;

public class AVeryBigSum {
    static long aVeryBigSum(long[] ar) {
		long bigsum = 0;
		for (long l : ar){
			bigsum = bigsum + l;
		}
		return bigsum;
    }

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		long[] input = new long[total];
		for(int i = 0; i < total; i++){
			input[i] = sc.nextInt();
		}
		System.out.println(aVeryBigSum(input));
		sc.close();
    }
}