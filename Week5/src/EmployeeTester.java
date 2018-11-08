import java.util.Scanner;
public class EmployeeTester {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Tom", 25000);
		Scanner userInput = new Scanner(System.in);
		
		System.out.println(emp1.getDetails());
		
		emp1.raiseSalary(1.1);
		
		System.out.println(emp1.getDetails());
		
		System.out.println("Please insert the salary percentage change");
		emp1.raiseSalary(userInput.nextDouble());
		System.out.println(emp1.getDetails());
		
		userInput.close();
		

	}

}
