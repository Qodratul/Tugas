import static java.lang.System.out; 
import java.util.Scanner;

public class KonversiSuhu {
	public static void main (String abc[]) {
		double f,c,r,k;
		
		Scanner sc = new Scanner(System.in);
		
		out.print("Masukkan nilai suhu: ");
		int suhu = sc.nextInt();
		out.println("1.Farenheit");
		out.println("2.Celcius");
		out.println("3.Reamur");
		out.println("4.Kelvin");
		out.print("Masukkan skala suhu:");
		int a = sc.nextInt();
		
		f = suhu;
		c = suhu;
		r = suhu;
		k = suhu;
		
		if (a == 1) {
			c = (f - 32) * 5/9;
			r = (f - 32) * 4/9;
			k = (f - 32) * 5/9 + 273.15;
			
			} else if (a == 2) {
				r = c * 4/5;
				f = (c * 9/5) + 32;
				k = c + 273.15;
			} else if (a == 3) {
				c =  r * 4/5;
				f = (r * 9/4) + 32;
				k = (r / 0.8) + 273.15;	 
		} else {
			 c = k - 273.15;
			 r = (k - 273.15) * 0.8;
			 f = (k - 273.15) * 9/5 + 32;	
		}
			out.println("Farenheit: "+f);
			out.println("Celsius: "+c);
			out.println("Reamur: "+r);
			out.println("Kelvin: "+k);
	}
}	