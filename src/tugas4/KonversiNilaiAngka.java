import static java.lang.System.out; 
import java.util.Scanner;

public class KonversiNilaiAngka {
	public static void main (String abc[]) {

		Scanner sc = new Scanner(System.in);

		out.print("Masukkan nilai: ");
        double nilai = sc.nextDouble();
		
			if (nilai >= 0 &&  nilai <= 100) {
				} if (nilai >= 80 &&  nilai <= 100) {
					out.println("Nilai = A");
					} else if (nilai >= 70 &&  nilai <= 79.99) {
						out.println("Nilai = B");
					} else if (nilai >= 60 &&  nilai <= 69.99) {
						out.println("Nilai = C");
					} else if (nilai >= 50 &&  nilai <= 59.99) {
						out.println("Nilai = D");
					} else if (nilai >= 0 &&  nilai <= 49.99) {
						out.println("Nilai = E");
			} else {
				out.println("Nilai tidak valid.");
        }
    }
}