package finalexamples;

// -------------------BLANK FINAL------------------------
/* Agar final ko initialize nai kar rahe toh blank final exception dega usko baad me
 * constructor ke through initialize kar sakte 
 */

class Student {
	final int i; // works only for final not for static final
	
	Student(int i) {
		this.i = i;
	}
	
}

public class FinalEx {
	public static void main(String[] args) {
		Student s1 = new Student(10);
		System.out.println(s1.i);
	}
}
