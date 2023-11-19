package sololearn;

import  java.util.Scanner;

public class Latihan13 {
    public static void main(String[] args) {
	String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Drink Number:");
	   
        int num = sc.nextInt();
		
         if (num >= 0 && num < 6) {
            String d = menu[num];
            System.out.println(d);
        } else {
            System.out.println("Invalid Order");
        }
    }
}
