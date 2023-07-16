package inheritance;

public class Runner {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.name = "Mew";
		c.color = "brown";
		
		c.printInfo();
		c.eat();
		c.sleep();
		System.out.println();
		
		//------------------------------------------------------------------------//
		Animals obj = new Animals("Animal", "color", 4);
		System.out.println(obj);
		obj.eats();
		System.out.println();
		
		
		Dogs d1 = new Dogs("Husky", "White", 4, "Bhow bhow");
		System.out.println(d1.toString());
		d1.eats();
		d1.sound();
		System.out.println();
		
		Puppy p1 = new Puppy("Rocky", "Golden", 3, "Houls");
		System.out.println(p1);
		p1.eats();
		
		
	}
}
