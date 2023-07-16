package multithreading;

public class DaemonThreads extends Thread{
	public void run() {
		System.out.println("Running");
	}
	
	public static void main(String[] args) {
		DaemonThreads t1 = new DaemonThreads();
//		t1.start();
//		t1.setDaemon(true);
		
		Thread.currentThread().setDaemon(true);
		System.out.println("main-method.......");
	}
}
