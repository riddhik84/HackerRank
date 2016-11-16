package com.hackerrank.challenges.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SockMerchant {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();

		ArrayList<Integer> pairs = new ArrayList<>();
		for(int i = 0; i < total; i++){
			pairs.add(sc.nextInt());
		}

		Collections.sort(pairs);

		int matches = 0;

		for(int i = 0; i < pairs.size() - 1;) {
			//System.out.println(pairs.get(i));
			//System.out.println(pairs.get(++i));

			if(pairs.get(i) == pairs.get(++i)){
				i++;
				matches++;
			} 
		}

		//System.out.println("Pairs: " +matches);
		System.out.println(matches);

	}

}
