package com.hackerrank.challenges.algorithms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.next();
		
		SimpleDateFormat date12hFormat = new SimpleDateFormat("hh:mm:ssaa");
		SimpleDateFormat date24hFormat = new SimpleDateFormat("HH:mm:ss");
		
		try {
			System.out.println(date24hFormat.format(date12hFormat.parse(time)));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
