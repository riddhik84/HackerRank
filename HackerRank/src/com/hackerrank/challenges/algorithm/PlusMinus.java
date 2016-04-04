package com.hackerrank.challenges.algorithm;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		float plus = 0;
		float minus = 0;
		float zero = 0;

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int arr[] = new int[n];
		for(int arr_i=0; arr_i < n; arr_i++){
			arr[arr_i] = in.nextInt();
		}
		
		for(int i = 0; i < n; i++){
			//System.out.println(arr[i]);
			if(arr[i] > 0){
				plus++;
			}else if(arr[i] < 0){
				minus++;
			}else if(arr[i] == 0){
				zero++;
			}
		}
			
		float total = n;
		
		System.out.printf("%.6f \n", plus/total);
		System.out.printf("%.6f \n", minus/total);
		System.out.printf("%.6f", zero/total);
	}
}
