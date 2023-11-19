import static java.lang.System.out; 
import java.util.Scanner;

public class SistemBensinWhile {
	public static void main(String[] args) {
		float liter, pilihan;
		double harga1, harga2, harga3;
	
        Scanner sc = new Scanner(System.in);

        out.println("Pilih Jenis BBM");
        out.println("1.Bensin");
        out.println("2.Solar");
        out.println("3.Pertamax");
        out.print("Masukkan Pilihan: ");
        pilihan = sc.nextFloat();

        if (pilihan == 1) {
            out.println("1.Bensin");
            out.print("Berapa liter: ");
            liter = sc.nextFloat();
            harga1 = liter * 7000;
            int i = 0;
            while (i <= harga1) {
                out.println(i);
                i = i + 1;
            }
            out.println("Harga: Rp" + harga1);
        }
        if (pilihan == 2) {
            out.println("2.Solar");
            out.print("Berapa liter: ");
            liter = sc.nextFloat();
            harga2 = liter * 6000;
            int i = 0;
            while (i <= harga2) {
                out.println(i);
                i = i + 1;
            }
            out.println("Harga: Rp"+harga2);
        } 
		if (pilihan == 3) {
            out.println("3.Pertamax");
            out.print("Berapa liter:");
            liter = sc.nextFloat();
            harga3 = liter * 9000;
            int i = 0;
            while (i <= harga3) {
                out.println(i);
                i = i + 1;
            }
            out.println("Harga: Rp" + harga3);
        }

    }

}
