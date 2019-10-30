import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DesignerPDFViewer {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
       HashMap<Character, Integer> mapping = new HashMap<>();
       int start = 97;
       for(int i = 0; i < h.length; i++){
           mapping.put((char)start, h[i]);
           start++;
       }

       int max = 0;
       for(int i = 0; i < word.length(); i++){
           int value = mapping.get(word.charAt(i));
           if(max < value){
               max = value;
           }
       }

       int mm2 = word.length() * max;
       return mm2;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
