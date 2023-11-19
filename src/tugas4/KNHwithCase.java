import static java.lang.System.out; 
import java.util.Scanner;

public class KNHwithCase {
	public static void main (String abc[]) {
		Scanner sc = new Scanner(System.in);

        out.print("Masukkan nilai dalam huruf: ");
        String nilai = sc.nextLine();
		
		switch (nilai) {
		case "A":
		out.println("Nilai = 4.0");
		break;
		case "B":
		out.println("Nilai = 3.0");
		break;
		case "C":
		out.println("Nilai = 2.0");
		break;
		case "D":
		out.println("Nilai = 1.0");
		break;
		case "E":
		out.println("Nilai = 0");
		break;
		default:
		out.println("Nilai tidak valid");
		break;
		}
	}
}