package com.hackerrank.challenges.algorithms;

import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int s = in.nextInt(); //house start
		int t = in.nextInt(); //house end
		int a = in.nextInt(); //apple tree
		int b = in.nextInt(); //orange tree
		int m = in.nextInt(); //apples fall
		int n = in.nextInt(); //oranges fall

		int[] apple = new int[m];
		for(int apple_i=0; apple_i < m; apple_i++){
			apple[apple_i] = in.nextInt();
		}

		int[] orange = new int[n];
		for(int orange_i=0; orange_i < n; orange_i++){
			orange[orange_i] = in.nextInt();
		}

		//Apple calculation
		int applesOnHome = 0;
		for(int apple_j : apple){
			int dist = a + apple_j;
			//System.out.println("apples dist: " +dist);

			if(dist >= s && dist <= t){
				applesOnHome++;
			}
		}

		//Apple calculation
		int orangesOnHome = 0;
		for(int orange_j : orange){
			int dist = b + orange_j;
			//System.out.println("oranges dist: " +dist);

			if(dist >= s && dist <= t){
				orangesOnHome++;
			}
		}

		System.out.println(applesOnHome);
		System.out.println(orangesOnHome);
	}

}
