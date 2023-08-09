package multithreading;

public class LearningThreads extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		LearningThreads t1 = new LearningThreads();
		t1.start();
		
		LearningThreads t2 = new LearningThreads();
		t2.start();
		
//		LearningThreads t3 = new LearningThreads();
//		t1.start();
		
	}
}
