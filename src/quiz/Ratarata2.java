package quiz;

import  java.util.Scanner;

public class Ratarata2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Nilai a = ");
		int a = sc.nextInt();
		System.out.print("Nilai b = ");
		int b = sc.nextInt();
		System.out.print("Nilai c = ");
		int c = sc.nextInt();
        double r = (double) (a + b + c) / 3;
        System.out.println("Rata-rata = "+r);
	}
}