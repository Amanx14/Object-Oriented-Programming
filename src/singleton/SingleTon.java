package singleton;

//---------------EARLY INSTANSIATION------------------
public class SingleTon {
	
	private SingleTon() {
			
	}
	
	private static SingleTon obj = new SingleTon();

	public static SingleTon getInstance() {
		return obj;
	}
}
