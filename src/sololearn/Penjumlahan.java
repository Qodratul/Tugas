package sololearn;

import  java.util.Scanner;

public class Latihan11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Number: ");
		
        int N = sc.nextInt();
		
		if (N < 1) {
            System.out.println(N);
        } else {
            int sum = 0;
            int i = 1;

            while (i <= N) {
                sum += i;
                i++;
            }
             System.out.println("Answer:"+sum);
        }
    }
}
