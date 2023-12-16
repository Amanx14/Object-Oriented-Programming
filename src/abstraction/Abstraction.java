package abstraction;

abstract class Mobile {
	String name; 
	
	public Mobile(String name) {
		this.name = name;
	}
	
	abstract void call();
	public abstract void msg();
	
	void printInfo() {
		System.out.println("I am a mobile blue print");
		System.out.println("Mobile.printInfo()");
	}
}

class Nokia extends Mobile{
	
	public Nokia(String name) {
		super(name);
	}

	@Override 
	public void call() {
		System.out.println(name + " phones are great for calling");
	}
	
	@Override
	public void msg() {
		System.out.println("Now message anyone with your nokia lumia.");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		
		Nokia lumia = new Nokia("Nokia Lumia");
		lumia.call();
		lumia.msg();
		lumia.printInfo();
	}
}
