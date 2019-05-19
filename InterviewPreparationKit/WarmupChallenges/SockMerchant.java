import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    //Solution with O(n2) time and space complexity
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> sockMap = new HashMap<>();
		int pairs = 0;
        
        for(int sock : ar){
            if(sockMap.containsKey(sock)){
                int count = sockMap.get(sock);
                count += 1;
                sockMap.put(sock, count);
            } else {
                sockMap.put(sock, 1);
            }
        }
                
        for(Map.Entry<Integer, Integer> mapEntry : sockMap.entrySet()){
            int value = mapEntry.getValue();    
            int pairCount = value/2;
            System.out.println("pairCount: " + pairCount);

            pairs = pairs + pairCount;
            System.out.println("pairs: " + pairs);
        }
        
        return pairs;

    }
	
	//Solution with O(n) time and space complexity
	static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
		HashSet<Integer> sockSet = new HashSet<Integer>();
		
		for(int n : arr){
			if(sockSet.contains(n){
				pairs++;
				sockSet.remove(n);
			} else {
				sockSet.add(n);
			}
		}
		
		return pairs;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
