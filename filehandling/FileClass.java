package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileClass {
	
	
	public static void exception() throws IOException    {
		
		throw new IOException();
		
		//throw 
	}
	
	public static int fact(int n) {
		if(n == 1 ) {
			return 1;
		}
	int	smallfact = fact(n-1);
	
	return n*smallfact;
	
	
	}
	
	
	public static void main(String[] args) throws IOException   {

  /*  File f = new File("C:/Files");
    f.mkdir();*/
   // System.out.println(f.isDirectory());
    File f = new File("F:/Demo.txt");
  //  f.
    /*f.createNewFile();*/
    
//    String [] files = f.list();
    
//    File files[] = f.listFiles();
//    
//    for(File fi : files) {
//   //  fi.
//    }
//    
////    for(String s : files) {
////    	System.out.println(s);
////    }
//    
//    
//    
// //  f.mkdirs();
//    System.out.println(f.exists());
//   // System.out.println(f.isDirectory());
//   //  f.createNewFile();
    FileReader in;
    in = new FileReader(f);
	try {
		
		   int current = in.read(); // 0
		   int counter = 0;

     while(current != -1) {  // while((current = in.read()) != -1)  -1 is specifying EOF
    	 if(current == 10) {
    		 counter++;
    	 } 
                /*   if(counter == 1) {
                	   System.out.print((char)current +"");
                   }*/
   // System.out.print((char)current +"");
		    	 current = in.read();
		     }
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 finally {
	in.close();
	}
    
	}
    
    
    
    
  
    //System.out.println(f.length());
//		int x = 5/0;
//		System.out.println(x);

	}


