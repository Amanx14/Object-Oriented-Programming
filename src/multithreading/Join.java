package multithreading;

class MyRunnable implements Runnable{
	private String name;
	
	public MyRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(name + " is starting. " + i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name + " has finished");
	}
	
}

public class Join {
	public static void main(String[] args) {
		MyRunnable obj = new MyRunnable("Thread 1");
		Thread t1 = new Thread(obj);
		
		Thread t2 = new Thread(new MyRunnable("Thread 2"));
	
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start(); 
		
		
		
		
//		System.out.println("All threads have finished their execution");
	}
}
