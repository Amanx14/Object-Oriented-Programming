package nestedclasses;


//---------------- NON STATIC INNER CLASS -----------------

public class OuterClass {
	String name;
	int id;
	
	public OuterClass(String name, int id) {
		this.name = name;
		this.id = id;	
	}
	
	void disp() {
		System.out.println("I am outer class showing " + name + " " + id);
	}
	
	class InnerClass {
		String leage;
		
		public InnerClass(String leage) {
			this.leage = leage;
		}
		
		void printInfo() {
			System.out.println("I am inner class printing:- "); 
			System.out.println("Name = " + name + " Leage = " + leage);
//			disp();
		}
	}
}
