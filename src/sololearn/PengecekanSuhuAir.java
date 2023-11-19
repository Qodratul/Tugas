package sololearn;

import  java.util.Scanner;

public class Latihan8 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Input Temperature: ");
           int temp = sc.nextInt();
		   
        if (temp < 100) {
			System.out.println("Not boiling");
        } else if (temp >= 100) {
			System.out.println("Boiling");
        } else { 
			System.out.println("error");
        }
	}
}