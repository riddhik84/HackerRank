package com.hackerrank.challenges.java;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x%2 != 0){
			System.out.println("Weird");
		} else {
			if(x >=2 && x<=5){
				System.out.println("Not Weird");
			} else if(x >=6 && x<=20){
				System.out.println("Weird");
			} else {
				System.out.println("Not Weird");
			}
		}
	}

}
