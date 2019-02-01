package com.hackerrank.challenges.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class CircularArrayRotation {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int totalElements = sc.nextInt();
		ArrayList<Integer> inputArr = new ArrayList<>();
		
		int rotations = sc.nextInt();
		int questions = sc.nextInt();
		
		for (int i = 0; i < totalElements; i++){
			inputArr.add(sc.nextInt());
			//System.out.println(inputArr.get(i));
		}
		
		for (int j =0; j < rotations; j++){
			int last = inputArr.get(inputArr.size() - 1);
			inputArr.remove(inputArr.size() - 1);
			inputArr.add(0, last);
		}
		
		for(int k = 0; k < questions; k++){
			System.out.println(inputArr.get(sc.nextInt()));
		}
	}

}
