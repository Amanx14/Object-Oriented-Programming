package nestedclasses;

public class OuterRunner {
	public static void main(String[] args) {
		
		//---------------- NON STATIC INNER CLASS -----------------
		
		OuterClass obj = new OuterClass("Prototype", 101);
		
		OuterClass.InnerClass innerObj = obj.new InnerClass("Conquerer"); 
		innerObj.printInfo();
		
		//---------------- STATIC NESTED CLASS -----------------
		
		OuterClass2.StaticNestedClass nestObj = new OuterClass2.StaticNestedClass("Gurdian");
		nestObj.display();
	}
}

