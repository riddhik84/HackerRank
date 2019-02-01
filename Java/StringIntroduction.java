package com.hackerrank.challenges.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringIntroduction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		System.out.println(A.length() + B.length());
		
//		if(A.charAt(0) > B.charAt(0)){
//			System.out.println("Yes");
//		} else if(A.charAt(0) < B.charAt(0)){
//			System.out.println("No");
//		} if(A.charAt(0) == B.charAt(0)){
//			System.out.println("No");
//		}
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add(A);
		ar.add(B);
		Collections.sort(ar);
		if(ar.get(0).equals(A)){
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		
		String ACap = A.substring(0, 1).toUpperCase() + A.substring(1);
		String BCap = B.substring(0, 1).toUpperCase() + B.substring(1);
		System.out.println(ACap + " " + BCap);
	}

}
