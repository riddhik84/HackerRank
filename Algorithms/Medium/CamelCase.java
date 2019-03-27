package com.hackerrank.challenges.algorithms;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/camelcase
 * @author rkakadia
 *
 */

public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		
		int count = 1;
		char[] tmp = s.toCharArray();
		for(int i = 0; i < tmp.length; i++){
			char cTemp = tmp[i];
			if(Character.isUpperCase(cTemp)){
				count++;
			}
		}
		System.out.println(count);
	}
}
