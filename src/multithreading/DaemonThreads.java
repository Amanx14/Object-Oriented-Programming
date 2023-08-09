package multithreading;

public class DaemonThreads extends Thread{
	@Override
	public void run() {
		System.out.println("Running");
	}
	
	public static void main(String[] args) {
		DaemonThreads t1 = new DaemonThreads();
		t1.setDaemon(true);
		t1.start();
		
//	Thread.currentThread().setDaemon(true); 
//  Main thread ko daemon nai set liya jaa sakta qki main pehle running state me chala jata
//  And koi thread ko running state me jane se pehle hi daemon set karna hota warna exception deta hai 
		System.out.println("main-method.......");
	}
}
