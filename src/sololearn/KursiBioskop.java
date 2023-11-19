package sololearn;

import java.util.Scanner;

public class Latihan15 {
    
    public static void main(String[] args) {
        int[][] seats = {
        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
		
        Scanner sc = new Scanner(System.in);
        
		System.out.println("Seat Row:");
        int r = sc.nextInt();
		System.out.println("Seat Column:");
        int c = sc.nextInt();
		
        if(r >= 0 && r <seats.length && c >= 0 && c < seats[r].length){
            if(seats[r][c] == 0){
                System.out.println("Free");
            } else {
                System.out.println("Sold");
            }
        } else {
            System.out.println("Invalid");
        }
    }
}
