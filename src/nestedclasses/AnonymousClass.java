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
	
	abstract void paisaHiPaisa();
}

class Chetu extends MNC {
	public Chetu(String name) {
		super(name);
	}
	
	@Override
	public void paisaHiPaisa() {
		System.out.println("Chetu me kaam karo paisa kamao");
	}
}

public class AnonymousClass implements MNC2{
	
	@Override
	public void paisaHiPaisa() {
		System.out.println("");
	}
	
	public static void main(String[] args) {
		MNC ref; // abstract class ka interface banaya hai
		
		ref = new Chetu("Lodu");
		ref.paisaHiPaisa();
		
//		-----------------------ANONYMOUS CLASS------------------------
		
		MNC2 ref1 = new MNC2() {

			@Override
			public void paisaHiPaisa() {
				System.out.println("Chetu me kaam karo khub paisa kamao");
			}
			
		};
		
		ref1.paisaHiPaisa();
	}

	
}
