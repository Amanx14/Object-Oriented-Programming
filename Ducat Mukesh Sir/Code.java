class Calculator {
	int a, b;
	int sum;

	public int printSum(int a, int b) {
		return a + b;
	}

}

public class Code {
	public static void main(String args[]) {
		Calculator c = new Calculator();
		int ans = c.printSum(3, 4);

		System.out.println(ans);
	
	}
}