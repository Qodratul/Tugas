import java.util.Scanner;

public class DeretAritmatikaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan batas aritmatika: ");
		int n = sc.nextInt();
		System.out.print("Masukkan bilangan awal: ");
		int a = sc.nextInt();
		System.out.print("Masukkan bilangan selisih/beda: ");
		int b = sc.nextInt();
		
			for (int i = 0; i < n; i++) {
				int hasil = a + (i * b);
				System.out.println("suku ke-"+ (i + 1) +": "+hasil);	
			}	
	}
}
			