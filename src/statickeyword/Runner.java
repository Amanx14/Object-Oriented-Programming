package statickeyword;

public class Runner {
	public static void main(String[] args) {
		StaticVar s = new StaticVar("Anjali", "Female", 23);
		
//		s.name = "Shila"; // agar constructor nai ho toh aise value bhejte
//		s.age = 23;
//		s.gender = "female";
		
//		s.setter("Aman", "Male", 23);
		
		s.printInfo();
	}
}
