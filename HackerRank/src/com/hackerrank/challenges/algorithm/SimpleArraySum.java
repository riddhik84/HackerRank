package com.hackerrank.challenges.algorithm;

import java.util.Scanner;

public class SimpleArraySum {
	
	public static void main(String[] args) {
		int sum = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            //System.out.println(arr[arr_i]);
            sum = sum + arr[arr_i];
        }
        
        System.out.println(sum);
    }

}
