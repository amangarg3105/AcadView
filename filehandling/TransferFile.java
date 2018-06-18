package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TransferFile {
	public static void transfer() throws IOException {
		File f = new File("F:/a.txt");
		File tranferfile = new File("F:/b.txt");
		FileInputStream fin = new FileInputStream(f);
		FileOutputStream fout = new FileOutputStream(tranferfile);
		
	 try {
		  int c;
		  while( (c = fin.read()) != -1) {
			  fout.write((char)c);
			  
		  }
	 } catch (Exception e) {
		System.out.println("Error Boom");
	}  finally {
		  fin.close();
		  fout.close();
	}
	
	}
	
	public static void main(String[] args) {
		

	}

}
