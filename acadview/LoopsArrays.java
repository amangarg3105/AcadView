package acadview;

public class LoopsArrays {
	
	static int[] arrayInexing(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = 2;
		}
		return array;
		
	}
	
	static int value (int  a) {
		
		a = 2;
		return a;
	}
  
	
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(int i = 0; i < 10 ; i++)
		System.out.println(i);*/
		
	int n = Integer.parseInt(args[0]);
	
	
/*	int i = 0;
	while(true) {
		System.out.println(i);
		i++;
	}
	do {
		System.out.println(i);
		i++;
	}while(i < 10);*/

 /*  ArrayList<Float> list = new ArrayList<>();
    list.add(1.3f);
    list.add(2.5f);
    list.add(3.3f);*/
   
   /* for(int j = 0; j < list.size();j++) {
            Float f = list.get(j);    	
    }
    
    
    for(Float item : list) { //  Float f = list.get(j);  
    	
    }*/
    
    
   /* *
       * *
       * * *
       * * * *
       * * * * **/ 
		{
			
			
		}
     
   /* for(int row = 1; row <=5 ;) {
    	
    	for(int col = 1; col <= row;  col++) {
    		
    		System.out.print("*");
    	}
    	System.out.println();
    	row++;
    }*/
		
		int primitive= 255;
		int primtive2 = 256;
		int primitve3 = 257;
		
		int [] arr1;
		 
		int  arr [] = new int[3];
		System.out.println("address " +arr);
		for(int i = 0; i < arr.length; i++) 
			arr[i] = i;
		
			
		 arrayInexing(arr);
			int a = 3;
			
			
			
			
			
			System.out.println(a + "    " + value(a));
			
	for(int index = 0; index < arr.length; index++) 
		System.out.print(arr[index] + " ");
	
	System.out.println(arr[3]);
			
		/*for(int index = 0; index < arr.length; index++) {
			System.out.println(arr[index]);
		
		int element = arr[index];
		System.out.println(element);*/
		}
		//arr = new int[3];
		
		
		
		
		
		
		
		
		
/*		BankAccount b = new BankAccount();
     int account =  b.accountNumber;
     System.out.println(account);*/
     

	
}

