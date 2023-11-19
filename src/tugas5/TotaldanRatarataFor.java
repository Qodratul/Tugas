import java.util.Scanner;

public class TotaldanRatarataFor {
    public static void main(String[] args) {
        int j = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            int data = sc.nextInt();
            j = j + data;
        }
		
		double r = (double) j / n;
		
        System.out.println("Total jumlah adalah: " + j);
		System.out.println("Rata-rata adalah: " + r);
    }
}
