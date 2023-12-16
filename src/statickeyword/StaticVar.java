package statickeyword;

public class StaticVar {
	String name;
	String gender;
	int age;
	
	public StaticVar() {
		
	}
	
	public StaticVar(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
//	public void setter(String name, String gender, int age) {
//		this.name = name;
//		this.gender = gender;
//		this.age = age;
//	}
	
	public void printInfo() {
		// instance method static method ko call kar sakta hai
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
//		print();
	}
	
	public static void print() {
		System.out.println("StaticVar.print()");
//		printInfo();
	}
}
