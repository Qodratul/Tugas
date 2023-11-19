package tugas6;

import java.io.File;
import static java.lang.System.out;
import java.util.Scanner;

public class MenghapusFile {
	public static void main(String[] args) {
		
		File evidence = new File("cookedBooks.txt");

		Scanner sc = new Scanner(System.in);
		char reply;
		
		do {
		out.print("Delete evidence? (y/n) ");
		reply =
		sc.findWithinHorizon(".",0).charAt(0);
		} while (reply != 'y' && reply != 'n');
		if (reply == 'y') {
		out.println("Okay, here goes...");
			//noinspection ResultOfMethodCallIgnored
			evidence.delete();
		out.println("The evidence has been deleted.");
		} else {
		out.println("Sorry, buddy. Just asking.");
		}
	}
}