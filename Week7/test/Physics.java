import java.util.Scanner;
public class Physics {

	public static void main(String[] args) {
		double mass = 2;
		double length = 3;
		double rotationSpeed = 0;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter a rotation speed");
		rotationSpeed = userInput.nextDouble();
		
		
		userInput.close();
		
		
		double tension = (mass * rotationSpeed * rotationSpeed / length);
		
		if (tension >= 60)
		{
			System.out.println("The rope would have broke");
		}
		
		else
		{
			System.out.println("The rope would not have broke");
		}

	}

}
