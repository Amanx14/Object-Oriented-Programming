package nestedclasses;

interface MNC2 {
	public abstract void paisaHiPaisa(); // by default interface ke methods public & abstract hote hai
}

abstract class MNC {
	String name;
	
	public MNC(String name) {
		this.name = name;
		System.out.println("MNC.MNC()");
	}
	
	void print() {
		System.out.println(name);
	}
	abstract void paisaDouble();
}

class Chetu extends MNC {
	public Chetu(String name) {
		super(name);
	}
	
	@Override
	public void paisaDouble() {
		System.out.println("Chetu me kaam karo paisa kamao");
		System.out.println("My name is " + name);
	}
}

public class AnonymousClass {

	
	public static void main(String[] args) {
// 		Pehle anonymous class nai hota tha toh alag se ek class chahiye hota tha 
//		jisme asbtract class ke abstract method ko use kar sake
		
//		MNC ref; // abstract class ka reference banaya hai
//		ref = new Chetu("Lodu");
//		ref.paisaDouble();
		
//		System.out.println();
		
//		-----------------------ANONYMOUS CLASS------------------------
		
//		Here were are not creating object of MNC(Kyunki mnc abstract class hai usko oject nai ban sakta)
//		we are creating the object of anonymous class using abstract class name
		
		MNC obj = new MNC("Ovijeet") {
			@Override
			public void paisaDouble() {
				System.out.println(name + " se milo 25 din me paisa double");
			}
		};
		
		obj.paisaDouble();
		System.out.println();
		
		
		MNC2 ref1 = new MNC2() {

			@Override
			public void paisaHiPaisa() {
				System.out.println("Chetu me kaam karo khub paisa kamao");
			}
			
		};
		
		ref1.paisaHiPaisa();
	}

	
}
