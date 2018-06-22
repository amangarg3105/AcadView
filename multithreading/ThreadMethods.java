package multithreading;

public class ThreadMethods {

	public static void main(String[] args) throws InterruptedException {

		
		Thread t = Thread.currentThread();
		t.setPriority(t.MAX_PRIORITY);
		System.out.println(t.getName() + "  "  + t.getPriority()  + "  " +t.getState());
		
		//System.out.println(t.getName());
	Task task1 = new Task();
	Thread t1  = new Thread(task1);
	Thread t2 = new Thread(task1);
	
	t2.start();
	t1.start();
	System.out.println(t1.getName() + " " +t1.getState()  + " " );

	
//		//Thread t2  = new Thread(task1);
//		t1.start();	
//		
	//t1.join();
//		
	
	/*System.out.println("Hello");
		System.out.println(t1.getName() + " " +t1.getState());
	//	t2.start();
		System.out.println(t.getName() + " " + t.getState());*/
		
	}

}
