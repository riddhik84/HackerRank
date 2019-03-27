import java.util.*;
import java.io.*;

public class GradingStudents {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int mul5 = 0;
        for(int i = 0; i < total; i++){
            int num = sc.nextInt();
            mul5 = num;
            int tmp = -1;
            while(tmp != 0){
                tmp = ++mul5 % 5;
            }
            int diff = mul5 - num;
            //System.out.println(diff);
            if(diff < 3 && mul5 > 38){
                num = mul5;
            } 
            System.out.println(num);
        }
    }
}