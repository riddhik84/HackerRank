import java.io.*;
import java.util.*;

public class Staircase {
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int total = sc.nextInt();
			int spaces = total-1;
			
			for(int k = 0; k < total; k++){
				StringBuffer output = new StringBuffer();
			    for(int i = spaces; i > 0 ; i--){
					output.append(" ");
				}
				for(int j = 0; j < total - spaces; j++){
					output.append("#");
				}
				System.out.println(output);
				spaces--;
			}
			sc.close();
		}
}