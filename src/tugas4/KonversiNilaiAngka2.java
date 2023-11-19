 import java.util.Scanner;

public class KonversiNilaiAngka2 {
	public static void main (String abc[]) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        double nilai = sc.nextDouble();
		
		double indeks;
		
		switch ((int) nilai / 10) {
			case 10:
            case 9:
            case 8:
			indeks = 4.0;
            break;
            case 7:
			indeks = 3.0;
			break;
            case 6:
			indeks = 2.0;
            break;
			case 5:
            indeks = 1.0;
            break;
			default:
			indeks = 0;
			break;
		}
		System.out.print("Nilai: "+indeks);
    }
}

			