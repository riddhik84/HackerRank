package com.hackerrank.challenges.algorithms;

import java.util.Scanner;

public class ViralAdvertising {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int totalDays = in.nextInt();
		
		int adStart = 5;
		int days = 1;
		int pplLiked = adStart;
		int l = 0;
		int totalPplLiked = 0;
		while(days <= totalDays){
			l = (int) Math.floor(pplLiked/2);
			totalPplLiked = totalPplLiked + l;
			
			l = l * 3;
			pplLiked = l;
			days++;
		}
		System.out.println(totalPplLiked);
	}

}
