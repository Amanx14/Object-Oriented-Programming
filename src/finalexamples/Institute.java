package finalexamples;

interface Demo {
	public static final int h = 10;
	void show();
}

abstract class Test {
	abstract void disp();
}

public class Institute extends Test {
	String name;
	static final String institute = "DUCAT 2.0";
	int id;
	
	Institute(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Institute [name=" + name +", institute=" + institute +", id=" + id + "]";
	}
	
	public static void main(String[] args) {
		Institute obj = new Institute("Aniket", 101);
		Institute obj2 = new Institute("Bhanu", 102);
		
		System.out.println(obj);
		System.out.println(obj2);
		
		System.out.println(Demo.h);
		
		obj.disp();
	}

	@Override
	void disp() {
		System.out.println("Yeh Test class ka abstract method hai");
	}
}
