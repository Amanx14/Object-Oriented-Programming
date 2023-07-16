package inheritance;

public class Animals {
	String name;
	String color;
	int legs;
	
	public Animals(String name, String color, int legs) {
		this.name = name;
		this.color = color;
		this.legs = legs;
	}
	
	public void sound() {
		System.out.println("Animals can also speak");
	}
	
	public void eats() {
		System.out.println("Animals Eat");
	}
	
	@Override
	public String toString() {
		return "Animals[" + name + " " + color + " " + legs + "]"; 
	}
}

class Dogs extends Animals{
	String barks;
	
	public Dogs(String name, String color, int legs, String barks) {
		super(name, color, legs);
		this.barks = barks;
	}
	
	void printInfo() {
		System.out.println("I am a domestic animal");
	}
	
	@Override
	public void sound() {
		System.out.println(color + " " + name + " houl sometimes");
	}
	
	@Override
	public void eats() {
		System.out.println(name + " can eat both veg and non veg");
	}
}

class Puppy extends Dogs{
	
	public Puppy(String name, String color, int legs, String barks) {
		super(name, color, 4, barks);
	}
	
	@Override
	public void eats() {
		super.eats();
		System.out.println("I only drink milks");
	}

	@Override
	public String toString() {
		return "Puppy [barks=" + barks + ", name=" + name + ", color=" + color + ", legs=" + legs + "]";
	}

	
	
	
}