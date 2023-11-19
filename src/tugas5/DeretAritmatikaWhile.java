import java.util.Scanner;

public class DeretAritmatikaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan batas aritmatika: ");
		int n = sc.nextInt();
		System.out.print("Masukkan bilangan awal: ");
		int a = sc.nextInt();
		System.out.print("Masukkan bilangan selisih/beda: ");
		int b = sc.nextInt();
		int i = 0;
		
			while (i < n) {
				int hasil = a + (i * b);
				i++;
				System.out.println("suku ke-"+ (i) +": "+hasil);	
			}
		
	}
}
			