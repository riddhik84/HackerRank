package com.hackerrank.challenges.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Problem statement: https://www.hackerrank.com/challenges/java-string-compare

public class JavaSubstringComparisons {
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        ArrayList<String> arr = new ArrayList<String>();
        int len = s.length();
        char[] strChar = s.toCharArray();
        
        for(int i = 0; i < len - k + 1; i++){
        	int j = i;
        	int m = 0;
        	String tmp = ""; 

        	while(m < k){
        		tmp = tmp + strChar[j] + "";
        		j++;
        		m++;
        	}
        	//System.out.println(tmp);
        	arr.add(tmp);
        }
        
        Collections.sort(arr);
        smallest = arr.get(0);
        largest = arr.get(arr.size() - 1);
        //System.out.println(smallest + "\n" + largest);
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }

}
