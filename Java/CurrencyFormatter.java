package com.hackerrank.challenges.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		try {

			String us = NumberFormat.getCurrencyInstance(new Locale("en","US")).format(payment).toString();
			String india = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment).toString();
			String china = NumberFormat.getCurrencyInstance(new Locale("zh","CN")).format(payment).toString();
			String france =NumberFormat.getCurrencyInstance(new Locale("fr","FR")).format(payment).toString();

			System.out.println("US: " + us);
			System.out.println("India: " + india);
			System.out.println("China: " + china);
			System.out.println("France: " + france);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
