package has.a.relationship;

//-------------------Has a relation ship bina child class ko extends kar waye hota hai----------------
// -------------Instance of one class is used in another class--------------------

public class Engine {
	String name;
	int model;
	String fuelType;
	int horsePower;
	
	public Engine(String name, int model, String fuelType, int horsePower) {
		
		this.name = name;
		this.model = model;
		this.fuelType = fuelType;
		this.horsePower = horsePower;
	}
	 
	@Override
	public String toString() {
		return "Engine[" + name + " " + model + " " + fuelType + " " + horsePower+ "]";
	}
}

class Ducati {
	String name;
	String color;
	Engine engine; // Ducati has an engine (has a relationship) 
	
	public Ducati(String name, String color, Engine engine) {
		this.name = name;
		this.color = color;
		this.engine = engine;
	}
	
	@Override
	public String toString() {
		return "Ducati[" + name + " " + color + " " + engine + "]";
	}
}
