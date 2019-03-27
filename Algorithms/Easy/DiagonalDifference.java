import java.io.*;
import java.util.*;
import java.math.*;

public class DiagonalDifference {
    static int diagonalDifference(int[][] arr) {
		int difference = 0;
		int left_sum = 0;
		int right_sum = 0;
		int len = arr[0].length;
		//System.out.println(len);

		for(int i = 0, j = 0; i < len; i++, j++){
			left_sum = left_sum + arr[i][j];
		}
		//System.out.println(left_sum);
		for(int i = 0, j = len-1; i < len; i++, j--){
			right_sum = right_sum + arr[i][j];
		}
		//System.out.println(right_sum);
	
		difference = Math.abs(left_sum - right_sum);
		return difference;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
		int matrix = sc.nextInt();
		int[][] input = new int[matrix][matrix];
		for(int i = 0; i < matrix; i++){
			for(int j = 0; j < matrix; j++){
				input[i][j] = sc.nextInt();
			}
		}
		System.out.println(diagonalDifference(input));
		sc.close();
    }
}