package encapsulation;

public class Encapsulation {
	private String name;
	private String jobRole;
	private String company;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setjobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getName() {
		return name;
	}
	
	public String getjobRole() {
		return jobRole;
	}
	
	public String getCompany() {
		return company;
	}
}
