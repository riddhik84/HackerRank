package com.hackerrank.challenges.java;

import java.util.Scanner;

//Problem Statement: https://www.hackerrank.com/challenges/java-string-reverse

public class JavaStringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String original = sc.next();
		StringBuilder tmp = new StringBuilder(original);
		String reverse = tmp.reverse() + "";
		
		if(original.equals(reverse)){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
