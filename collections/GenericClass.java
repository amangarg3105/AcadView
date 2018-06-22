package collections;

import java.util.ArrayList;

class Demo<X> {
	X type;  //int type  // Integer Type
	
	public Demo(X type) {
		this.type = type;
	}
	
	X getType() {
		return type;
	}
	
	
}

public class GenericClass {
	
	public static void main(String[] args) {
		
		Demo<Integer> d = new Demo<>(1);
		
		System.out.println(d.getType());
		
		
		
		Demo<Character> c = new Demo<>('a');
		System.out.println(c.getType());
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
