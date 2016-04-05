package com.hackerrank.challenges.algorithms;

import java.util.*;

public class Staircase {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		int blanks = N - 1;
		int prints = N - blanks;
		
		for(int i = 0; i < N; i++){
			for(int j =0; j < blanks; j++){
				System.out.print(" ");
			}
			blanks--;
			for(int k = 0; k < prints; k++){
				System.out.print("#");
			}
			prints++;
			System.out.print("\n");
		}
	}
}