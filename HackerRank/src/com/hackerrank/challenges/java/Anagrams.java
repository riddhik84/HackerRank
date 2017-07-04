package com.hackerrank.challenges.java;

import java.util.Arrays;

//Problem Statement: https://www.hackerrank.com/challenges/java-anagrams

import java.util.Scanner;

public class Anagrams {

	static boolean isAnagram(String a, String b) {
		if(a.length() != b.length()){
			return false;
		} else {
			char[] charA = a.toLowerCase().toCharArray();
			Arrays.sort(charA);

			char[] charB = b.toLowerCase().toCharArray();
			Arrays.sort(charB);

			String aNew = new String(charA);
			String bNew = new String(charB);

			//System.out.println(aNew + " " + bNew);
			if(aNew.equals(bNew)){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

}
