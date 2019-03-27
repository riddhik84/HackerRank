import java.util.*;
//07:05:45AM
//07:05:45PM

public class TimeConversion {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String input24 = input.substring(0, input.length()-2);
		
		String[] input_values = input24.split(":");
		int hour = Integer.parseInt(input_values[0]);
		//System.out.println(hour);
		int minute = Integer.parseInt(input_values[1]);
		int seconds = Integer.parseInt(input_values[2]);
		
		if(input.contains("PM")){
			if(hour != 12){
				int hour24 = hour + 12;
				//System.out.println(hour + " " + hour24);
				input24 = input24.replace(input_values[0], hour24+"");
				System.out.println(input24);
			} else if (hour == 12){
				System.out.println(input24);
			}
		} else if(input.contains("AM")){
			if(hour == 12){
				input24 = input24.replaceFirst("12","00");
			}
			System.out.println(input24);
		}
	}
}