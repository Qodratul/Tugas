package sololearn;

import  java.util.Scanner;

public class Latihan9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Input Color: ");
        String color = sc.nextLine();
        
        int bn;
        
        switch (color) {
            case "red":
                bn = 1;
                break;
            case "green":
                bn = 2;
                break;
            case "black":
                bn = 3;
                break;
            default:
                System.out.println("Invalid color. Please insert color red, green, or black.");
                return; 
        }
        System.out.println("BoxNumber#"+bn);
    }
}
