package interfaces;
 


import java.util.Scanner;
 
public class DriverClass {

	
	public static void main(String[] args) {
		MyInterfaceImplementation i = new MyInterfaceImplementation();
		MyInterface m = new MyInterfaceImplementation();
		
		Scanner sc = new Scanner(System.in);
		int [] arr = {1,2,3,4};
	
		for(int elemenet : arr) {
			System.out.println(elemenet);
		}
		
		String s = sc.nextLine();
		i.sayGoodBye();
		Integer demo = 10;
		
		i.oldFunction();
		
		//MyInterface.i = 11;
		System.out.println(MyInterface.i + " " +/* AbstractClass.*/i);
		
		int power = (int) Math.pow(2,4);
		System.out.println(power);
		
	/*	String s = "123";*/
		
	int integer = 	Integer.parseInt(s);
	System.out.println(integer);
				
		
	}

}
