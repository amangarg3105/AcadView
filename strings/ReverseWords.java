package strings;

import java.util.Scanner;

public class ReverseWords {
 
	static int i;
	
	static {
		i =10;
		System.out.println();
	}
	public static String reverse(String str) {
		int i = 0;
		String word = "";
		String newStr = "";
		// I am aman
		while(i < str.length()) {
			if(str.charAt(i) == ' ') {
				if(newStr != ""  && word != "")
				newStr = word +" " + newStr;
				
				if(newStr == "" && word != "") {
					newStr = word;
				}
				word = "";
			} else {
				word = word + str.charAt(i);
			}
		i++;
		}
	if(newStr != ""  && word != "")
			newStr = word +" " + newStr;
			
			if(newStr == "" && word != "") {
				newStr = word;
			}
		
		return newStr;
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println(reverse(str));
	}
}
