
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int len = s.length();
        long div = n/len;
        long rem = n%len;
        System.out.println(len + " " + div + " " + rem);
        
        long total_counter = 0;
        int a_counter = 0;
        char[] arr = s.toCharArray();
        for(char ch : arr){
            if(ch == 'a'){
                a_counter++;
            }
        }
        total_counter = a_counter * div;
        
        for(int i = 0; i < rem; i++){
            if(arr[i] == 'a'){
                total_counter++;
            }
        }

        return total_counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
