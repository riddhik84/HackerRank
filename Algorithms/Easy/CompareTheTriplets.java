import java.util.*;
import java.io.*;

public class CompareTheTriplets {
	static final int TOTAL = 3;
	
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> output = new ArrayList<Integer>();
		int alicePoints = 0;
		int bobPoints = 0;
			for(int i = 0; i < TOTAL; i++){
				if(a.get(i) > b.get(i)){
					alicePoints++;
				} else if (a.get(i) < b.get(i)){
					bobPoints++;
				}
			}
		output.add(alicePoints);
		output.add(bobPoints);
		
		return output;
    }

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		List<Integer> alice = new ArrayList<Integer>();
		List<Integer> bob = new ArrayList<Integer>();
		for(int i = 0; i < TOTAL; i++){
			alice.add(sc.nextInt());
		}
		for(int j = 0; j < TOTAL; j++){
			bob.add(sc.nextInt());
		}
        List<Integer> output = new ArrayList<Integer>();
		output = compareTriplets(alice, bob);
		
		for(int val : output){
			System.out.print(val + " ");
		}
		sc.close();
    }
}