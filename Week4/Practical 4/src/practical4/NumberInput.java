package practical4;

import java.util.Scanner;

public class NumberInput {

	public static void main(String[] args) {
		
		Scanner UserInput = new Scanner(System.in);

		int input;
		while (true)
		{
		
			System.out.println("Please insert a number between 1000 and 999,999");
		
			input = UserInput.nextInt();
			
			if (input < 1000 || input > 999999) 
			{
				System.out.println("That number is not between 1000 and 999,999. Please try again");
				
			}
			else {
				// Number was valid, break out of the while loop
				break;
			}
		}
		
		UserInput.close();
		
		System.out.println("The number you entered is: " + input);
			
		String inputAsString = Integer.toString(input);
		int stringLength = inputAsString.length();
		
		switch(stringLength) {
		case 1:
		case 2:
		case 3:
		case 4: System.out.println(inputAsString.substring(0,1) + "," + inputAsString.substring(1));
				break;
		case 5: System.out.println(inputAsString.substring(0,2) + "," + inputAsString.substring(2));
				break;
		case 6: System.out.println(inputAsString.substring(0,3) + "," + inputAsString.substring(3));
				break;
			
		}
		
	}

}
