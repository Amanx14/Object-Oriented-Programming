package multithreading;

public class LearningThreads2 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Runnable ref = new LearningThreads2(); // down casting
		Thread t1 = new Thread(ref);
		t1.start();
	}
}
