import static java.lang.System.out; 
import java.util.Scanner;

public class KonversiNilaiHuruf {
	public static void main (String abc[]) {
		Scanner sc = new Scanner(System.in);

		out.print("Masukkan nilai dalam huruf: ");
        String nilai = sc.nextLine();
		
        if (nilai.equals("A")) {
			out.println("Nilai = 4.0");
			} else if (nilai.equals("B")) {
				out.println ("Nilai = 3.0");
			} else if (nilai.equals("C")) {
				out.println ("Nilai = 2.0");
			} else if (nilai.equals("D")) {
				out.println ("Nilai = 1.0");
			} else if (nilai.equals("E")) {
				out.println ("Nilai = 0");
		} else {
            out.println("Nilai tidak valid.");
        }
    }
}