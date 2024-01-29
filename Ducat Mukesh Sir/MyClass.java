package mypackage;

class Print {
	public void printInfo() {
		System.out.println("Hello Bro");
	}
}

class MyClass {
	public static void main(String args[]) {
		Print p = new Print();
		p.printInfo();
	}
}