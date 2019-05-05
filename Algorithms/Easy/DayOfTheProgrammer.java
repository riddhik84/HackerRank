import java.util.Scanner;

public class DayOfTheProgrammer{
	public static final int PROGRAMMER_DAY = 256;
	
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int febDays = februaryDays(year);
		int[] monthDays = {31,febDays,31,30,31,30,31,31,30,31,30,31};
		int daysLeft = 0;
		int i  = 0;
		
		for(i = 0; PROGRAMMER_DAY - daysLeft > 31; i++){
			daysLeft = daysLeft + monthDays[i];
		}
		System.out.println(PROGRAMMER_DAY - daysLeft + ".0" + ++i + "." +year);
		
	}
	
	public static boolean isLeapYear(int year){
		if(year >= 1700 && year <=1917){
			if((year % 4) == 0){
				return true;
			} else {
				return false;
			}
		} else if(year == 1918){
			return false;
		} else if(year >= 1919){
			if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	public static int februaryDays(int year){
		if(isLeapYear(year)){
			return 29;
		} else {
			if(year == 1918){
				return 15;
			} else {
				return 28;
			}
		}
	}
}