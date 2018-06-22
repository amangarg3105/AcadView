package multithreading;

public class Task implements Runnable {
int i = 1;
	@Override
	public void run() {   //Synchronization
	//	System.out.println(Thread.currentThread().getName()  + " "  +Thread.currentThread().getState());
		synchronized (this) {
			while(i < 15) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println( Thread.currentThread().getName()  +"  "  +i);
			i++;
			}
			System.out.println( Thread.currentThread().getName() + " " + Thread.currentThread().getState());
		}
		
	
	}

}
