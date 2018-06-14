package Inheritence;

import java.util.Scanner;

public class Staticblock {
	
	static int n;
	static void print()
	{
		System.out.println("in static print");
	}
	
	static
	{
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		System.out.println("n= "+n);
		print();
	}

	public static void main(String[] args) {
		System.out.println("n= "+Staticblock.n);
		
		
		
		
			}

}
