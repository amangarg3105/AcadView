package collections;

import java.util.ArrayList;
import java.util.Comparator;

class Demo {
	//X type;  //int type  // Integer Type
	
	
	  //Generic Print Method
	
	public <T>  void print (T arr[])  {
		
	}
	  
	
	// Bounded Type Parameters
	public <T extends Comparable<T>> void sort(T arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				
				if(arr[i].compareTo(arr[j+1])  > 0) {
					//swap
				}
			}
		}
	}
/*	public Demo(X type) {
		this.type = type;
	}
	
	X getType() {
		return type;
	}*/
	
	
}

public class GenericClass {
	public static void main(String[] args) {
		
		Demo d = new Demo();
		
	//	System.out.println(d.getType());
		Integer i = 10;
		Integer j = 15;
		
		Integer arr[] = {5,1,4,3,2};
	//	d.sortArray(arr);
		d.print(arr);
		
		for(Integer element : arr) {
			System.out.print(element + " ");
		}
		
		
		/*Demo<Character> c = new Demo<>('a');
		System.out.println(c.getType());*/
		/*ArrayList al = new ArrayList();
		al.add("1");
		al.add("2");
		al.add(1); // Compiler Allow this
		
		String s1 = (String) al.get(0);
		String s2 = (String) al.get(1);
		String s3 = (String) al.get(2); // RunTime Exception
*/		
	     /*Demo<Integer> d  = new Demo<>(10);
	     System.out.println(d.getType());
	     
	     Demo<String> s = new Demo<>("String");
	     System.out.println(s.getType());*/
	}

}
