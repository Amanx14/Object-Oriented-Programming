package singleton;

public class Runner {
	public static void main(String[] args) {
		//-------Early instantiation----------
		
		SingleTon obj = SingleTon.getInstance();
		System.out.println(obj);
		
		SingleTon obj2 = SingleTon.getInstance();
		System.out.println(obj2);
		
		//-------Lazy instantiation----------
		
		SingleTon2 ref = SingleTon2.getSingleton();
		System.out.println(ref);
		
		SingleTon2 ref2 = SingleTon2.getSingleton();
		System.out.println(ref2);
		
	}
}
