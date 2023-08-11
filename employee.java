package string;

public class employee {
	private String name;
	private String jobTitle;
	private double salary;
	
	

	public employee(String name, String jobTitle, double salary) {
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getJobTitle() {
		return jobTitle;
	}



	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void raiseSalary(double percentage) {
		salary = salary + salary*percentage/100;
	}
public void  printEmployeeDetails() {
	System.out.println("name:" + name);
	System.out.println("job Title:"+ jobTitle);
	System.out.println("Salary:"+salary);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee e1 = new employee("Anshad","manager", 45000);
e1.printEmployeeDetails();
e1.raiseSalary(0);
	}

}
