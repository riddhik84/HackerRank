import java.util.Scanner;

public class BonAppetit{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();
		int k = scanner.nextInt();
		
		int actualTotalBill = 0;
		int annasSkippedItemBill = 0;
		
		for(int i = 0; i < total; i++){
			int amount = scanner.nextInt();
			actualTotalBill = actualTotalBill + amount;
			if(i == k){
				annasSkippedItemBill = amount;
			}
		}
		
		int chargeToAnna = scanner.nextInt();
		int annasBill = (actualTotalBill - annasSkippedItemBill)/2;
		
		if(chargeToAnna != annasBill){
			System.out.println(chargeToAnna - annasBill);
		} else {
			System.out.println("Bon Appetit");
		}
	}
}