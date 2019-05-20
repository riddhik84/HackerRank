import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlass2DArray {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] array) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        int i_counter = 0;
        int j_counter = 0;

        int i_start = 0;
        int j_start = 0;

        while(i_start <=array.length - 3){
            while(j_start <= array.length - 3){
                int total_counter = 1;
                for(int i = i_start; i_counter < 3; i++, i_counter++){
                    for(int j = j_start; j_counter < 3; j++, j_counter++){
                        System.out.println("array[i][j]:" + array[i][j]);
                        if(total_counter == 4 || total_counter == 6){
                            total_counter++;
                            continue;
                        }
                        System.out.println("Total counter:" + total_counter);
                        sum = sum + array[i][j];
                        total_counter++;
                    }
                    j_counter = 0;
                }
                i_counter = 0;

                System.out.println("Sum:" + sum);
                if(max < sum){
                    max = sum;
                    System.out.println("Max:" + max);
                }
                sum = 0;
                j_start++;
                System.out.println("i_start:" + i_start + " j_start: " + j_start);
            }
            j_start = 0;
            i_start++;
            System.out.println("i_start:" + i_start + " j_start: " + j_start);
        }
        return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
