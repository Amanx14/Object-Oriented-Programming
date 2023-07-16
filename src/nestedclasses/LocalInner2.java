package nestedclasses;

// ---------------LOCAL INNER CLASS-----------------
class OutrClass {
int id = 30;
	
	void display() {
		
		class LocalInner {
			void message() {
				System.out.println(id);
			}
		}
		
		LocalInner i = new LocalInner();
		i.message();
	}
}

class OuterClasses {
	String name;
	
	public OuterClasses(String name) {
		this.name = name;
	}
	
	void printInfo() {
		
		class LocalInnerr {
			void msg() {
				System.out.println("Printing name- " + name);
			}
		}
		
		LocalInnerr i = new LocalInnerr();
		i.msg();
	}
 }
public class LocalInner2 {
	public static void main(String[] args) {
		OutrClass obj = new OutrClass();
		obj.display();
		
		OuterClasses obj2 = new OuterClasses("Aman");
		obj2.printInfo();
	}
}
