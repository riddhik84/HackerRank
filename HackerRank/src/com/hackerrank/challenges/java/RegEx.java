package com.hackerrank.challenges.java;

import java.util.Scanner;

public class RegEx {

	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String IP = in.next();
			System.out.println(IP.matches(new myRegex().pattern));
		}

	}
}

class myRegex
{
	String pattern = 
			"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
					"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
					"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
					"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
}
