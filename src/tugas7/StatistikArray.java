package tugas7;

import java.util.Scanner;

public class StatistikArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int j = 0;
		
		System.out.print("Jumlah data : ");
		a = sc.nextInt();
		int[] arr = new int[a];
		
		for (int i = 0; i < a; i++){
		System.out.print("Input data ke-"+ (i+1) +" : ");
		arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a; i++) {
			j += arr[i];
         if(arr[i] % 2 != 0) {
            System.out.println(arr[i]+" = Ganjil");
         } else if(arr[i] % 2 == 0) {
            System.out.println(arr[i]+" = Genap");
			}
		}
		
		double r = (double) j / a;
		System.out.println("Total jumlah : "+j);
		System.out.print("Rata-rata : "+r);
		
	}
}