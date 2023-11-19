package quiz;

import  java.util.Scanner;

public class PerhitunganProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Modal = ");
		int modal = sc.nextInt();
		System.out.print("Keuntungan = ");
		int keuntungan = sc.nextInt();
        int profit = modal + (modal * keuntungan);
		
         System.out.print("Profit = "+profit);
	}
}