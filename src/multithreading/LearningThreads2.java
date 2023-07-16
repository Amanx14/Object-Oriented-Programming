package multithreading;

public class LearningThreads2 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		
	}
	
	public static void main(String[] args) {
		Runnable ref = new LearningThreads2(); // downcasting
		Thread t1 = new Thread(ref);
		t1.start();
	}
}
