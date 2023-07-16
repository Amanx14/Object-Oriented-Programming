package nestedclasses;

//--------------Local Inner Class-------------------
public class LocalInner {
	public static void main(String[] args) {
		int id = 10;
		// Local Inner Class Kisi bhi method ke andar hota
		class Local {
			void disp() {
				System.out.println("LocalInner.main(...).Local.disp() " + id);
			}
		}
		
		Local obj = new Local();
		obj.disp();
	}
}
