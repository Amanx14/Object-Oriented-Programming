package CalculatorApp;

class CircleAreaCalc {
	Float pi = 3.14f, r, result;
	
	public Float calcArea(Float r) {
		this.result = this.pi * (r * r);
		return result;
	}
}

public class App {
	
	public static void main(String args[]) {
		
		Float ans = new CircleAreaCalc().calcArea(3f);
		System.out.println(ans);
	}
}
