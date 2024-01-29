package CalculatorApp;

class Calculate {
	
	public void add(Integer... n) {
		
		int sum = 0;
		for(Integer i : n) {
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println( "|| (Sum : " + sum + ")");
	}
}

public class Arbitary {
	
//  Varargs -> (Arbitary number of arguments) , 
//	Arbirary means hum log ko pata nai hai ki arguments ka number kitna hai
//	In past releases, a 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate calculate = new Calculate();
		
		calculate.add();
		calculate.add(3, 45);
		calculate.add(22, 77);
		calculate.add(3, 45, 67);

	}

}
