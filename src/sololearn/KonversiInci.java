package sololearn;

import java.util.Scanner;

public class KonversiInci {
	static double convert(double f){
		
        double i = f*12.0;
        System.out.println("Inches:"+i);
        return i;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Feet:");
        double num = sc.nextDouble(); 

        convert(num);
    }
}
