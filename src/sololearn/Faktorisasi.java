package sololearn;

import  java.util.Scanner;

public class Latihan12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Number: ");
		
		int N = sc.nextInt();
        
		int a = 1;
        for(int x=1; x<=N; x++){
            a*=x;
        }
        System.out.println("Factorial:"+a);
    }
}
