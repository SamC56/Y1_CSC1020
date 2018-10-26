package practical4;

import java.util.Scanner;

public class IntReturns {

	public static void main(String[] args) {
		
		Scanner UserInput = new Scanner(System.in);
		
		System.out.println("Please insert the first number: ");
		int number1 = UserInput.nextInt();
		
		System.out.println("Please insert the second number: ");
		int number2 = UserInput.nextInt();
		
		UserInput.close();
		
		int sum = number1 + number2;
		int difference = number1 - number2;
		int product = number1 * number2;
		double average = (double)sum / 2;
		int max = Math.max(number1, number2);
		int min = Math.min(number1, number2);
		
		
		System.out.println("First Integer: " + number1 + " Second Integer: " + number2);
		System.out.println("Sum:	" + sum);
		System.out.println("Difference:		" + difference);
		System.out.println("Product: 	" + product);
		System.out.println("Average:	" + average);
		System.out.println("Maximum:	" + max);
		System.out.println("Minimum: 	" + min);
		
		
		
	}

}
