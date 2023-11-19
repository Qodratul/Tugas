import java.util.Scanner;

public class TotaldanRatarataDowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = sc.nextInt();
		int j = 0;
		int i = 0;

		do {
			System.out.print("Masukkan data ke-" + (i + 1) + ": ");
			int data = sc.nextInt();
			i++;
            j = j + data;
		} while (i < n);
		
		double r = (double) j / n;
		
        System.out.println("Total jumlah adalah: " + j);
		System.out.println("Rata-rata adalah: " + r);
    }
}
