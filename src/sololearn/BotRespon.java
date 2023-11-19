package sololearn;

import java.util.Scanner;

public class Latihan16 {
   public static void bot(){
        Scanner sc = new Scanner(System.in);
		
        int user = sc.nextInt();
		
        if(user == 1){
            System.out.println("Order confirmed");
        } else if(user == 2){
            System.out.println("info@sololearn.com");
        } else {
            System.out.println("Try again");
        }
    }
   
    public static void main(String[] args) {
        bot();
    }
}
