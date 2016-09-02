package com.java.challenges;

import java.util.Scanner;

public class OutputFormatting {
	
	public static void main(String args[])
	{
		 Scanner in = new Scanner(System.in);
			String[] lineStrings = new String[3];
			String[] line = new String[2];
			int i = 0;
			
			while (in.hasNext())
			{
				lineStrings[i] = in.nextLine().toString();
				i++;
			}
			
			System.out.println("================================");
			for(byte b = 0; b < lineStrings.length; b++)
			{
				line = lineStrings[b].split(" ");
				System.out.printf("%-14s %03d", line[0], Integer.parseInt(line[1]));
		        System.out.println("");
				
			}
			System.out.println("================================");
	}

}
