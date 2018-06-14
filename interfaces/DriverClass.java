package interfaces;
 


import java.util.Scanner;
 
public class DriverClass {
	
	interface p {
		int i =10;
	}
	
	public static void main(String[] args) {
		MyInterfaceImplementation i = new MyInterfaceImplementation();
		MyInterface m = new MyInterfaceImplementation();
		
		MyInterface inter = new MyInterface() {   // class xyz implement MyInterface
			
			@Override
			public void sayHello() {
			System.out.println("My Interface say Hello");
				
			}
			
			@Override
			public void sayGoodBye() {
				// TODO Auto-generated method stub
				
			}
		};
		
		inter.sayHello();
		
		MyInterface2 interface2 = new MyInterface2() {
			
			@Override
			public void sayHello() {
		    System.out.println("My interface 2 say hello");
				
			}
		};
		
		interface2.sayHello();
		/*inter.sayHello();
		interface2.sayHello();
		*/
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
