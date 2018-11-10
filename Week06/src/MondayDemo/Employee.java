package MondayDemo;

public class Employee {
	private String name;
	private double salary;
	private final double LOWER_RATE = 20.0;
	private final double LOWER_LIMIT = 45000.0;
	private final double HIGHER_RATE = 40.0;
	
	public Employee(String name, double salary) {
		this.name = name;
		if (salary > 0.0) {
			this.salary = salary;
		}
		else {
			this.salary = 0.0;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary) {
		if (salary > 0.0) {
			this.salary = salary;
		}
	}
	
	public String getDetails() {
		String res = "";
		res += "Name : " + getName() +"\n";
		res += "Salary: £" + String.format("%.2f", getSalary() ) + "\n";
		return res;
	}
	
	public String toString() {
		return getDetails();
	}
	
	public double calcGrossPay() {
		return salary/12;
	}
	
	public double calcNetPay() {
		double higherTax = 0.0;
		double lowerTax = 0.0;
		
		// lower tax band or both?
		if (salary > LOWER_LIMIT) {
			double amountAbove = salary - LOWER_LIMIT;
			higherTax = amountAbove * (HIGHER_RATE/100);
			lowerTax = LOWER_LIMIT * (LOWER_RATE/100);
		}
		else {
			lowerTax = salary * (LOWER_RATE/100);
		}
		
		double netYearly = salary - (higherTax + lowerTax);
		return netYearly/12;
	}
}
