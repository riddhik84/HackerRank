import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
		Collections.sort(a); //sorting is required for below logic to work
		int max = 0;
		for(int i =0; i < a.size(); i++){
			ArrayList<Integer> input = new ArrayList<Integer>();
			input.add(a.get(i));
			for(int j=i+1; j < a.size(); j++){
				if((Math.abs(a.get(i) - a.get(j))) <=1){
					input.add(a.get(j));
				}
			}
			if(input.size() > max){
				max = input.size();
			}
			System.out.println(input);
		}
		if(max == 1){
			max = 0;
		}
		return max;
	}

}

public class PickingNumbers {
    public static void main(String[] args) throws IOException {
		Integer[] inputarray = {4, 6, 5, 3, 3, 1}; // 1, 3, 3, 4, 5, 6
		List<Integer> input = Arrays.asList(inputarray);
		
		int result = Result.pickingNumbers(input);
		System.out.println(result);
		
    }
}
