package interfaces;

interface Gaddar {
//  interface variables by default static and final hota hai
//	interface methods by default abstract hota
	
	public static final int id = 420;
	public abstract void print();
}

interface Cheater {
	default void features() {
		System.out.println("Now I have a job in MNC");
	}
	
	static void Don() {
		System.out.println("Cheater.Don()");
		System.out.println("Don baega apun");
	}
	
	void kartoot();
}

class Hunk {
	String name="Chuiya";
}

public class Interfaces extends Hunk implements Cheater, Gaddar{
	@Override
	public void print() {
		System.out.println("Gaddar log " + id + " hote hai");
	}
	
	@Override
	public void kartoot() {
		System.out.println(name + " ladkiyon ki tarah randi rona karta");
	}

}
