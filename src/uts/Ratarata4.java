package uts;

import java.util.Scanner;
public class Ratarata4 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan data: ");
		int data1 = sc.nextInt();
		
		System.out.print("Masukkan data: ");
		int data2 = sc.nextInt();
		
		System.out.print("Masukkan data: ");
		int data3 = sc.nextInt();
		
		float r = (data1 + data2 + data3) / 3f;
	
		System.out.print(r);
	}
}