package com.hackerrank.challenges.java;

import java.util.Scanner;

public class Loops2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i = 0; i < x; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			//System.out.println("a: " + a + " b: " + b + " n: " + n);
			int sum = 0;
			sum = a + (((int) Math.pow(2.0, 0) * b));
			System.out.print(sum + " ");

			for(int j = 0,k = 1; j < n-1; j++,k++){
				sum = sum +  (((int) Math.pow(2.0, k) * b));
				System.out.print(sum + " ");
			}
			System.out.println("");
		}
	}

}
