package singleton;

//---------------EARLY INSTANSIATION / EAGER LOADING------------------
public class SingleTon {
	
	private SingleTon() { // constructor ko private karne se object nai banta
		System.out.println("SingleTon.SingleTon()");
	}
	
	private static SingleTon obj = new SingleTon();

	public static SingleTon getInstance() {
		return obj;
	}
}
