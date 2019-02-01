package com.hackerrank.challenges.algorithms;

import java.util.Scanner;

public class CompareTheTriplets {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
	    int a0 = in.nextInt();
	    int a1 = in.nextInt();
	    int a2 = in.nextInt();
	    int b0 = in.nextInt();
	    int b1 = in.nextInt();
	    int b2 = in.nextInt();
	    
	    int aPoints  = 0;
	    int bPoints = 0;
	    
	    if(a0 > b0){
	    	aPoints++;
	    } else if (b0 > a0){
	    	bPoints++;
	    }
	    
	    if(a1 > b1){
	    	aPoints++;
	    } else if (b1 > a1){
	    	bPoints++;
	    }
	    
	    if(a2 > b2){
	    	aPoints++;
	    } else if (b2 > a2){
	    	bPoints++;
	    }
	    
	    System.out.println(aPoints + " " + bPoints);
	    
	}
	

}
