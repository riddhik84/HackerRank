package com.hackerrank.challenges.java;

//Problem Statement: https://www.hackerrank.com/challenges/java-string-tokens/problem
// Hint: [A-Za-z !,?._'@]+

import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		//String regx = "\\s+|!\\s*|,\\s*|\\?\\s*|\\.\\s*|_|'|@";
		String regx = "[\\s!,?._'@]+";
		String s_temp = s.trim();

		if(s_temp.length() > 0){
			String[] tockens = s_temp.trim().split(regx);
			System.out.println(tockens.length);

			for(String tocken : tockens){
				System.out.println(tocken.trim());
			}
		} else {
			System.out.println(s_temp.length());
		}
		scan.close();
	}

}
