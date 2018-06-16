package recursion;

import java.util.Scanner;

public class PrintKeyPad {
public static String getString(char number) {
	
	//Binary Search 
	// PrintCodes  
	//String of lenth k  

	//1234
	     //abc
	//lc
	//aw
	if(number == '2') {
		return "abc";
	} if(number == '3') {
		return "def";
	}
	
	return "";
	
}

public static void keyPadPrint(String number,String outputSofar) {
	  if(number.length() == 0) {
	//	  System.out.println(outputSofar);
		  return;
	  }
	     String ans = getString(number.charAt(0));
	     
	     for(int i = 0; i < ans.length();i++) {
	    	 
	    	 keyPadPrint(number.substring(1),outputSofar + ans.charAt(i));
	    	
	     }
}
	public static void main(String[] args) {
        keyPadPrint("23", "");
	}

}
