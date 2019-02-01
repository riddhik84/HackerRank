package com.hackerrank.challenges.java;

import java.util.ArrayList;
import java.util.Scanner;

public class StdInStdOut {
	
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		
		while(in.hasNext())
		{
			a.add(in.nextLine());
		}
		
		if(a.size() == 3)
		{
			System.out.println("String: " + a.get(2));
			System.out.println("Double: " + Double.parseDouble(a.get(1)));
			System.out.println("Int: " + Integer.parseInt(a.get(0)));
		}
	}
}
