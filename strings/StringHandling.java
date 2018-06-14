package strings;

public class StringHandling {

	public static void main(String[] args) {
	
		
		String s = "Hello";
	String s2 = null;
	String s3 = new String("Hello");
	/*	System.out.println(s.);*/
	/*	s.concat("World"); //Redun
		 s = s.concat("World");*/
	
   
		 
		System.out.println(s + " "  + s.length());
		
		String str = "My name is aman";
		StringBuffer buffer = new StringBuffer(); // 16 Character array initialized
		buffer.insert(0,"Java");
		StringBuffer buffer2 = new StringBuffer("Java");
		
		System.out.println("Buffer Length " +buffer2.length());
		System.out.println("Buffer Capacity " + buffer2.capacity());
		StringBuffer buffer3 = new StringBuffer(5);
		if(buffer != buffer2) {
			System.out.println("Not Equal");
		}
		buffer.setCharAt(0, 'L');
		System.out.println(buffer);
		
//		if(s == s2) {
//			System.out.println("Equal");
//		} 
		
		if(s.equals(s3)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		System.out.println(s2.length());
		
		
		/*else if (s == s3) {
			System.out.println("s and s3 are equal");
		} else if(s.equals(s3)) {
			System.out.println("s and s3 are not equal");
		}*/
	//	System.out.println(str.substring(-3));
		
		int a[] = {1,2,4,5};
		System.out.println(a[5]);
		

	}

}
