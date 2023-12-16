package nestedclasses;

//---------------- STATIC NESTED CLASS -----------------
public class OuterClass2 {
	String name;
	static int id = 97;
	
	public OuterClass2(String name) {
		this.name = name;
	}
	
	void disp() {
		System.out.println("I am outer class");
	}
	
	static class StaticNestedClass {
		String rank;
		public StaticNestedClass(String rank) {
			this.rank = rank;
		}
		
		void display() {
//			System.out.println(name); 
			System.out.println("I am static inner class " + id);
			System.out.println("Rank is " + rank);
		}
	}
	
}
