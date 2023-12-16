package constructor;
//-------------------Constructor chaining------------------------
public class Student {
	String name;
	String gender;
	int id;
	
	public Student() {
		this("Aman", "M", 2);
		System.out.println("Contructor with 0 args");
	}
	
	public Student(String name) {
//		this();
		this.name = name;
		System.out.println("Contructor with 1 args");
	}
	
	public Student(String name, String gender) {
		this(name);
		this.gender = gender;
		
		System.out.println("Contructor with 2 args");	
	}
	
	public Student(String name, String gender, int id) {
		this(name, gender);
		this.id = id;
		System.out.println("Contructor with 3 args");
	}
	
	void disp() {
		System.out.println(name + " " + gender + " " + id);
	}
}
