package com.hackerrank.challenges.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulDaysatTheMovies {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int startVal = sc.nextInt();
		int endVal = sc.nextInt();
		int divVal = sc.nextInt();
		
		ArrayList<Integer> beautifulDays = new ArrayList<>();

		for(int x = startVal; x <= endVal; x++){
			int revVal = reverse(x);		
			double calculatedVal = (double) Math.abs(x - revVal)/divVal;
			//System.out.println("calculatedVal:" + calculatedVal);
			
			if(Math.floor(calculatedVal) == calculatedVal){
				//System.out.println("Math.floor(calculatedVal):" + Math.floor(calculatedVal));
				beautifulDays.add(x);
			}
		}
		
//		for(int y : beautifulDays){
//			System.out.print(y + " ");
//		}
		
		System.out.println(beautifulDays.size());
	}
	
	static int reverse(int val){
		int reverse = 0;
		
		StringBuilder tmp = new StringBuilder(val + "");
		tmp.reverse();
		reverse = Integer.parseInt(tmp+"");
		//System.out.println(reverse);
		
		return reverse;
	}
}
