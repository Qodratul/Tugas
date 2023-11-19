package uts;

import java.util.Scanner;

public class AnalisisDataArray {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[7];
		
		for (int i = 0; i < 7; i++){
		System.out.print("Input Data : ");
		arr[i] = sc.nextInt();
		}

        for (int j : arr) {
            if (j % 2 != 0) {
                System.out.println(j + " = Ganjil");
            } else if (j % 2 == 0) {
                System.out.println(j + " = Genap");
            }
        }
	}
}
		
		