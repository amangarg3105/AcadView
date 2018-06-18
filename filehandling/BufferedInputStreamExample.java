package filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamExample {

	public static void main(String args[]) {

		try {

		//	FileInputStream fin = new FileInputStream("F:/Demo.txt");
			 FileOutputStream fout = new FileOutputStream("F:/Demo.txt");

		//	BufferedInputStream bin = new BufferedInputStream(fin);
			
			BufferedOutputStream bout = new BufferedOutputStream(fout);

			 for(int c = 65; c <= 88; c++) {
			 bout.write((char)c);
			 }
			 

			// Take byte Array
			 byte b1 = 89;
			 byte[] b = {89,90,91,92};
			 bout.write(b);
			/*bin.skip(4);

			boolean b = bin.markSupported();
			
			if(b == true) {
				bin.mark(bin.available());
			}
			int i;
			while ((i = bin.read()) != -1) {

				System.out.print((char) i);
			}
*/			// bout.flush();
			/*bin.close();
			fin.close();
			bin.reset();*/
		 bout.flush();
		//	 bout.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}