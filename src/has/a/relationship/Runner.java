package has.a.relationship;

public class Runner {
	public static void main(String[] args) {
		String str = "Hello"; // Yeh bhi has a relation me aaya 
		System.out.println(str.length());
		
		Engine engine = new Engine("V12", 2023, "Petrol", 1000);
//		System.out.println(engine);
		
		Ducati d1 = new Ducati("Ducati-PANIGALE", "red", engine);
		System.out.println(d1);
	}
}
