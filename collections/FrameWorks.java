package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class FrameWorks {

	public static void listFunctions() {
		ArrayList<Integer> list1 = new ArrayList<>();

		/*
		 * List list = new ArrayList<>();
		 * 
		 * HashMap<Integer, Character> map = new HashMap<>(); map.put(1,'a');
		 * map.put(1,'b');
		 */

		/*
		 * for(Map.Entry<Integer, Character> entry : map.entrySet()) {
		 * 
		 * }
		 */

		// ArrayList<Integer> list2 = new ArrayList<>(5);
		//
		// ArrayList<Integer> list3 = new ArrayList<>(list2);

		// list1.add(1);
		// list1.add(2);
		// list1.add(3);
		// list1.add(3);
		// list1.add(2,4);

		for (int i = 0; i <= 10; i++) {
			list1.add(i);
		}

		// For Each

		Integer integer = 10;
		int i = integer;

		ListIterator<Integer> iterator = list1.listIterator();

		while (iterator.hasNext()) {

			int value = iterator.next();

			if (value % 2 != 0) {
				iterator.remove();
			}
			/* System.out.print(value + " "); */
		}

		System.out.println(list1);

		// list2.addAll(list1);
		// System.out.println(list1);
		// System.out.println(list2);
		// System.out.println(list1.indexOf(3));

	}
     public static void vectorHandling() {
    	 
    	 Vector v = new Vector();
    	 
    	 v.add(1);
    	 v.add("String");
    	 
  //  	 System.out.println(v.capacity());
    	 
    	 //v.ensureCapacity(15);
    	 
    //	 v.trimToSize();
    	 
    	 
    	 
    	  
    	/* Set s = new HashSet();
    	 s.add(1);
    	 s.add(2);
    	 s.add('a');
    	 s.add(4);*/
    	 
    	/* Set s = new LinkedHashSet();
    	 s.add(1);
    	 s.add(2);
    	 s.add('a');
    	 s.add(4);*/
    	 
    /*	Set s = new TreeSet();
    	
    	 s.add(1);
    	 s.add(4);
    	 s.add(2);*/
    	 
    	 
    	 //System.out.println(s);
    //	System.out.println(s); 
    //	 System.out.println(v.capacity());
    	 
     }
     
     public static HashMap<Character, Integer> countFequency(String str) {
    	 HashMap<Character, Integer> map = new HashMap<>();
    	 for(int i  = 0; i < str.length(); i++ ) {
    		 if(map.containsKey(str.charAt(i))) {
    			 int value = map.get(str.charAt(i));
    			 value++;
    			 map.put(str.charAt(i),value);
    		 } else {
    			 map.put(str.charAt(i), 1);
    		 }
    	 }
    	 return map;
     }
	public static void main(String[] args) {

		 HashMap<Character, Integer> map = (countFequency("aabccada"));
		 
		/* TreeMap tree = new TreeMap();
		 LinkedHashMap linked = new LinkedHashMap();
		 tree.put(1, '3');*/
		
	for(	Map.Entry<Character,Integer> e : map.entrySet()) {
		System.out.println(e.getKey() + " ------ >" + e.getValue());
		System.out.println();
	}
	
	Set<Integer> a = new HashSet<Integer>();
	a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
	Set<Integer> b = new HashSet<Integer>();
	b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
	
		//listFunctions();
	//	vectorHandling();

		/*Set<Integer> a = new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
		Set<Integer> b = new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

		// To find union
		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.print("Union of the two Set");
		System.out.println(union);

		 To find intersection
		Set<Integer> intersection = new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.print("Intersection of the two Set");
		System.out.println(intersection);

		// To find the symmetric difference
		Set<Integer> difference = new HashSet<Integer>(a);
		difference.removeAll(b);
		System.out.print("Difference of the two Set");
		System.out.println(difference);*/
	Set<Integer> intersection = new TreeSet<Integer>(a);
	intersection.retainAll(b);
	System.out.print("Intersection of the two Set");
	System.out.println(intersection);
	}

}
