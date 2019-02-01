package com.hackerrank.challenges.java;

//Problem Statement: https://www.hackerrank.com/challenges/valid-username-checker

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxUsernameChecker {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.next());

		for(int i = 0; i < testCases; i++){
			String username = in.next();
			String pattern = "^[aA-zZ]\\w{7,29}$";

			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(username);
			if(m.find()){
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
}
