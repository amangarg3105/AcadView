package recursion;

public class PrintCodes {

	public static void decode(String s,String output) {
		if(s.length() == 0) {
			System.out.println(output);
			return;
		}
		String s1 = s.substring(0,1);
		int n = Integer.parseInt(s1);
		if(n != 0) {
			char c = (char) ('a' + n - 1);
			decode(s.substring(1),output+c);
		}
		if(s.length() <= 1) {
			return;
		}
		String s2 = s.substring(0,2);
		int n1 = Integer.parseInt(s2);
		if(n1!= 0) {
			char c = (char) ('a' + n1- 1);
			decode(s.substring(2),output+c);
		}
	}
	
	public static void main(String[] args) {

decode("123","");

	}

}
