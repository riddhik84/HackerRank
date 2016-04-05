package com.hackerrank.challenges.algorithms;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		int diff = 0;

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for(int a_i=0; a_i < n; a_i++){
			for(int a_j=0; a_j < n; a_j++){
				a[a_i][a_j] = in.nextInt();
				//System.out.println(a[a_i][a_j]);
			}
		}

		int start = 0;
		for(int x = 0; x < n; x++){
			sum1 = sum1 + a[x][start];
			start++;
		}
		//System.out.println(sum1);

		start = n - 1;
		for(int k = 0; k < n; k++){
			sum2 = sum2 + a[k][start];
			start--;
		}
		//System.out.println(sum2);

		diff = Math.abs(sum1 - sum2);
		System.out.println(diff);
	}
}
