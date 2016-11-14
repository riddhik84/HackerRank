package com.hackerrank.challenges.algorithms;

import java.util.Scanner;

public class Kangaroo {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        //System.out.println(x1 + " " + v1 + " " + x2 + " " + v2);
        boolean match = false;
        int z1 = x1;
        int z2 = x2;
        int jumps = 0;
        
        while(match != true){
        	z1 = z1 + v1;
        	z2 = z2 + v2;
        	
        	if(z1 == z2){
        		match = true;
        		break;
        	} else {
        		jumps++;
        	}
        	
        	if(jumps > 10000){
        		if(match == false){
        			break;
        		}
        	}
        }
        
        if(match == true){
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }
	}//MethodEnd

}//classEnd