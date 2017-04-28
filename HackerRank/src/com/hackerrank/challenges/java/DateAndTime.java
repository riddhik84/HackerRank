package com.hackerrank.challenges.java;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateAndTime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		int day = in.nextInt();
		int year = in.nextInt();
		
		Month mon = Month.JANUARY;
		
		switch(month) {
			case 1: mon = Month.JANUARY; break;
			case 2: mon = Month.FEBRUARY; break;
			case 3: mon = Month.MARCH; break;
			case 4: mon = Month.APRIL; break;
			case 5: mon = Month.MAY; break;
			case 6: mon = Month.JUNE; break;
			case 7: mon = Month.JULY; break;
			case 8: mon = Month.AUGUST; break;
			case 9: mon = Month.SEPTEMBER; break;
			case 10: mon = Month.OCTOBER; break;
			case 11: mon = Month.NOVEMBER; break;
			case 12: mon = Month.DECEMBER;
			break;
		}

		LocalDate date = LocalDate.of(year, mon, day);
		System.out.print(date.getDayOfWeek());
	}

}
