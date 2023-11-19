import java.util.Scanner;

public class PerhitunganBonus {
	public static void main (String abc[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Jumlah yang terjual:");
		int a = sc.nextInt();
		int bonus = 0;
		
		if (a > 2) {
			bonus = 1000000;
		} else if (a == 2) {
			bonus = 500000;
		} else {
			bonus = 0;
		}
		
		System.out.println("Bonus: Rp"+bonus);
	
	}
}