package com.hackerrank.challenges.algorithms;

import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {
		AVeryBigSum b = new AVeryBigSum();	
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int arr_i=0; arr_i < n; arr_i++){
			arr[arr_i] = in.nextInt();
			System.out.println(arr[arr_i]);
		}
		
		System.out.println(b.getSum(arr));
	}
	
	long getSum(int[] inputs)
	{
		long sum = 0l;
		long[] inputData = new long[inputs.length];
		for(int i =0; i < inputData.length; i++)
		{
			inputData[i] = inputs[i];
		}
		
		for(int i = 0; i < inputData.length; i++)
		{
			sum = sum + inputData[i];
		}
		
		return sum;
	}
}
