package exercises4.inheritanceinterface.bll;

public abstract class Employee {

	private String name;
	private String JobTitle;
		//three-argument constructor
	public Employee(String name, String JobTitle) {
		setname(name);
		setjOBTITLE(JobTitle);
	
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return JobTitle;
	}
	public void setjOBTITLE(String JobTitle) {
		this.JobTitle = JobTitle;
	}
	@Override
	public String toString() {
		return String.format( "%s %s /nsocial security number: %s",getname(),getJobTitle());
		
	}
	public abstract double earnings();
	public double calculatePay() {
		// TODO Auto-generated method stub
		return 0;
	}


}