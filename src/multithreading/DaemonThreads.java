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
		
/*  
	Main thread ko daemon nai set kiya jaa sakta qki main thread pehle running state me chala jata
	And koi thread ko running state me jane se pehle hi daemon set karna hota warna exception 
	deta hai 
*/
		
//		Thread.currentThread().setDaemon(true); => not possible throws error
		System.out.println("main-thread.......");
	}
}
