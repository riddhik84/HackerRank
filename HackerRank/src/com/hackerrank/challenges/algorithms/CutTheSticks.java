package com.hackerrank.challenges.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < n; i++){
			arr.add(in.nextInt());
		}

		boolean done = false;
		System.out.println(n);

		while(done != true){
			int minval = 0;
			if(arr.size() > 0){
				Collections.sort(arr);
				minval = arr.get(0);
				//System.out.println("minval: " +minval);

				ArrayList<Integer> arr_tmp = new ArrayList<>();
				for(int i = 0; i < arr.size(); i++){
					int val = arr.get(i) - minval;
					//System.out.println("val: " +val);
					if(val != 0){
						arr_tmp.add(val);
					}
				}

				if(arr_tmp.size() > 0){
					System.out.println(arr_tmp.size());
					done = false;
					arr = arr_tmp;
					//arr_tmp.removeAll(arr_tmp);
				} else {
					done = true;
				}
			}
		}
	}

}
