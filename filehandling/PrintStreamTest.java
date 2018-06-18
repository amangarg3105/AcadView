package filehandling;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {

	public static void main(String args[]) throws Exception {

		FileOutputStream fout = new FileOutputStream("F:/Demo.txt ");
		PrintStream pout = new PrintStream(fout);

		pout.println(20167);
		pout.println("Hello Java");
		pout.println("Welcome to Java");

		/*pout.close();
		fout.close();*/
		System.out.println("Success?");
	}
}