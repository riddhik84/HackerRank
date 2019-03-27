import java.io.*;
import java.util.*;

public class PlusMinus {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int n = arr.length;
        int plus, minus, zero;
        plus = minus = zero = 0;
        for (int i : arr){
            if(i > 0){
                plus++;
            } else if (i < 0){
                minus++;
            } else if(i == 0) {
                zero++;
            }
        }
        System.out.println(plus / (double)n);
        System.out.println(minus / (double)n);
        System.out.println(zero / (double)n);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}