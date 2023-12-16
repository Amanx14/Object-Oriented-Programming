package singleton;

//---------------LAZY INSTANSIATION / LAZY LOADING------------------
public class SingleTon2 {
	
	private SingleTon2 () {
		System.out.println("SingleTon2.SingleTon2()");
	}
	
	private static SingleTon2 obj = null;
	
	public static SingleTon2 getSingleton() {
		if(obj == null) {
			obj = new SingleTon2();
		}
		return obj;
	}
	
}
