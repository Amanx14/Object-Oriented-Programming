package CalculatorApp;

class Area {
	
	float area;
	
	public float circleArea(float r) {
		area = 3.14f * (r * r);
		return area;
	}
	
	public float squareArea (float side) {
		area = side * side;
		return area;
	}
	
	public float rectangleArea(float l , float w) {
		area  = l * w;
		return area;
	}
}
public class App3 {
	public static void main(String args[]) {
		
		Area area = new Area();
		
		System.out.println(area.circleArea(3));
		
		System.out.println(area.squareArea(4));
		
		System.out.println(area.rectangleArea(3, 4));
		
		
		
	}
}
