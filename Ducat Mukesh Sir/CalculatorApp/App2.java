package CalculatorApp;

import java.math.BigDecimal;
import java.math.BigInteger;

class Employee {
	String city;
	int age ;
	
	BigInteger bg; // 16 byte size int
	BigDecimal bd; // 16 byte size decimal
	
	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		String str = "City : " + city + " Age : " + age;		
		return str; 
	}
	
}

class EmployeeInfo {
	public void disp() {
		Employee employee1 = new Employee();
		employee1.setCity("Kolkata");
		employee1.setAge(23);
//		System.out.println(employee1.getCity() + " " + employee1.getAge());
		System.out.println(employee1.toString());
		
		Employee employee2 = new Employee();
		employee2.setCity("Jaipur");
		employee2.setAge(25);
//		System.out.println(employee2.getCity() + " " + employee2.getAge());
		System.out.println(employee2.toString());
		
		Employee employee3 = new Employee();
		employee3.setCity("Dhanbad");
		employee3.setAge(26);
//		System.out.println(employee3.getCity() + " " + employee3.getAge());
		System.out.println(employee3.toString());
		
	}
}

public class App2 {	
	public static void main(String args[]) {
		
		EmployeeInfo employeeInfo = new EmployeeInfo();
		employeeInfo.disp();
	}
}
