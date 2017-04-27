package com.hackerrank.challenges.java;

import java.util.Scanner;

/**
 * Challenge: https://www.hackerrank.com/challenges/java-static-initializer-block
 * @author rkakadia
 * Solution help: https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
 */

public class StaticInitializerBlock {
	static boolean flag = false;
	static int B = 0;
	static int H = 0;

	static {
		try{
			Scanner sc = new Scanner(System.in);
			B = sc.nextInt();
			H = sc.nextInt();
			if(B > 0 && H > 0){
				flag = true;
			} else {
				throw new Exception("Breadth and height must be positive");
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}
}
