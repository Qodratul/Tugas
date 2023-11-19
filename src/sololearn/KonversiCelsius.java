package sololearn;

import java.util.Scanner;

public class Latihan18 {
	static double fahr(double c){
        double f = 1.8 * c + 32;
        return f;
    }
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Celcius:");
        double c = sc.nextDouble(); 

        System.out.println("Fahrenheit:"+fahr(c));
    }
}
