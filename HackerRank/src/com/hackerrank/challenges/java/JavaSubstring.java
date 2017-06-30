package com.hackerrank.challenges.java;

import java.util.Scanner;

public class JavaSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		if(input != null && input.length() > end){
			String output = input.substring(start, end);
			System.out.println(output);
		} else {
			System.out.println(input);
		}
	}

}
