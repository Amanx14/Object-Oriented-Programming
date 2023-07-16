package inheritance;

public class Animal {
	String name;
	String color;
	
	void eat() {
		System.out.println("Animals eat");
	}
	
	void sleep() {
		System.out.println("Animals sleeps zzzzzz'");
	}
	
	void printInfo() {
		System.out.println(name);
		System.out.println(color);
	}
}

class Cat extends Animal{
	String nature;
	
	@Override
	void eat() {
		System.out.println(name + " eats both veg and nonveg");
	}
	
	@Override
	void sleep() {
		System.out.println("Mew mew I'm sleeping zzzz");
	}
	
}
