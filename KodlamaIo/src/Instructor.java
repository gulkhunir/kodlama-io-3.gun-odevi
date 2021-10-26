
public class Instructor extends User{

	private double salary;
	
	public Instructor() {
		
	};
	
	public Instructor(double salary) {
		this.salary=salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
