package constructor;
//-------------------Constructor chaining------------------------
public class Constructor {
	String name;
	String gender;
	int id;
	
	public Constructor() {
		System.out.println("Contructor with 0 args");
	}
	
	public Constructor(String name) {
		this();
		this.name = name;
		System.out.println("Contructor with 1 args");
	}
	
	public Constructor(String name, String gender) {
		this(name);
		this.gender = gender;
		
		System.out.println("Contructor with 2 args");	
	}
	
	public Constructor(String name, String gender, int id) {
		this(name, gender);
		this.id = id;
		System.out.println("Contructor with 3 args");
	}
	
	void disp() {
		System.out.println(name + " " + gender + " " + id);
	}
}
