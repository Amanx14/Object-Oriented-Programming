package interfaces;

interface I1{
	void fun1();
}

interface I2 {
	void fun2();
}

interface I3 extends I1, I2{
	void fun3();
}

class Demo implements I3{
	
	@Override
	public void fun1() {
		System.out.println("This is fun1 from I1");
	}
	
	@Override
	public void fun2() {
		System.out.println("This is fun2 from I2");
	}
	
	@Override
	public void fun3() {
		System.out.println("This is fun3 from I3");
	}
}



public class MultipleInheritance {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun1();
		obj.fun2();
		obj.fun3();
	}
}
