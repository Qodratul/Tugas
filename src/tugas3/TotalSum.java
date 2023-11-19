import static java.lang.System.out; 
import java.util.Scanner;

public class TotalSum {
	public static void main(String[] args) {
		int min,max,in,i,n,sum;
		
		Scanner sc = new Scanner(System.in);
		
		out.print("Nilai Min: ");
		min = sc.nextInt();
		out.print("Nilai Max: ");
		max = sc.nextInt();
		out.print("Nilai Interval: ");
		in = sc.nextInt();
		
		if ((min - max) % in == 0) {
			n = (min - max) / in;
			i = 1;
			sum = 0;
			while (i <= n) {
				sum = sum + min;
				min = min + in;
				i = i + 1;
			}
			out.println("Total sum: "+sum);
		} else {
			out.println("Sum tidak dapat di hitung");
		}
	}
}	