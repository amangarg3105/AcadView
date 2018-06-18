package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	public static void main(String args[]) {
		File f = new File("F:/Demo.txt");
		try {
			FileOutputStream fout = new FileOutputStream(f);
			fout.write(65);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

/*public class ReadFileExample {

	public static void main(String[] args) {

		File file = new File("F:/Demo.txt");
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(file);

			System.out.println("Total file size to read : " + fis.available());
            fis.read();
            System.out.println(fis.available());
			int content;
			while ((content = fis.read()) != -1) {
				// convert to char and display it
				System.out.print((char) content);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
*/