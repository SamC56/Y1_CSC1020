
public class Employee {
	//instance variables
	private String employeeName;	// The employee's name
	private double currentSalary;	// the employee's current salary
	
	
	public Employee (String employeeName, double currentSalary)
	{
		this.employeeName = employeeName;
		this.currentSalary = currentSalary;
	}
	
	public String getName()
	{
		return employeeName;
	}
	
	
	public double getSalary()
	{
		return currentSalary;
	}
	
	public void raiseSalary(double inputPercentage)
	{
		if (inputPercentage <= 1) 
		{
			System.out.println("Please enter a valid number greater than 1");
		}
		
		else
		{
			currentSalary = (currentSalary * inputPercentage);
		}
	}
	
	
	public String getDetails()
	{
		String employeeDetails = "";
		
		employeeDetails += "The employee's name is: ";
		employeeDetails += employeeName + "\n" ;
		
		employeeDetails += "The employee's current salary is: ";
		employeeDetails += String.format("£%.2f", currentSalary) + "\n";
		employeeDetails += "-----------------------------------";
		
		return employeeDetails;
	}
	
	
	
}
