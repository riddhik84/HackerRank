package com.hackerrank.challenges.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		try{
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			int div = num1/num2;
			System.out.println(div);
		} catch (InputMismatchException e){
			System.out.println("java.util.InputMismatchException");
		} catch (ArithmeticException e){
			System.out.println("java.lang.ArithmeticException: / by zero");
		} 
	}
	
}
