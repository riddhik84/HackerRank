package com.hackerrank.challenges.algorithms;

import java.util.Scanner;

public class AngryProfessor {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for(int i =0; i < T; i++){
			int S = in.nextInt();
			int Th = in.nextInt();
			int[] students = new int[S];
			for(int k =0; k < S; k++){
				students[k] = in.nextInt();
			}
			int onTime = 0;
			for(int x = 0; x <students.length; x++){
				if(students[x] <= 0){
					onTime++;
				}
			}
			
			if(Th > onTime){
				System.out.println("YES");
			}else
			{
				System.out.println("NO");
			}
		}		
	}	

}
