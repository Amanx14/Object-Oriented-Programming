package encapsulation;

public class Runner {
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setjobRole("Software Engineer");
		e.setName("Aman");
		e.setCompany("Microsoft");
		
		System.out.println(e.getName());
		System.out.println(e.getjobRole());
		System.out.println(e.getCompany());
	}
}
