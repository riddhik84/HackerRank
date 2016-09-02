package com.hackerrank.challenges.algorithms;

import java.util.Scanner;

public class DivisibleSumPairs {

	public static void main(String... args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}

		int count = 0;
		int total = 0;
		int div = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				if(i < j){
					total = a[i] + a[j];
					div = total % k;
					if(div == 0){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
