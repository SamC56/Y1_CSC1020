package MondayDemo;

public class EmployeeTest {

	public static void main(String[] args) {
		// Create an Employee object
		Employee emp1 = new Employee("Joe Bloggs", 25000.0);
		
		// Test getters
		System.out.println("----Employee Test Getters----");
		System.out.println("Emp Name: " + emp1.getName() );
		System.out.println("Emp Salary: " + emp1.getSalary() );
		System.out.println();
		
		// Test setters
		System.out.println("----Employee Test Setters----");
		emp1.setName("Fred Flintstone");
		emp1.setSalary(35000.0);
		System.out.println("Emp Name: " + emp1.getName() );
		System.out.println("Emp Salary: " + emp1.getSalary() );
		System.out.println();
		
		// Test getDetails
		System.out.println("----Test getDetails----");
		System.out.println(emp1.getDetails());
		System.out.println();
		
		// Test calcGrossPay
		System.out.println("----Test calcMonthlyPay----");
		System.out.println(emp1.getName() + " earns £" + 
					String.format("%.2f",emp1.calcGrossPay()) + " per month, before tax.");
	}

}
