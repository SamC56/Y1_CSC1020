import java.util.Scanner;
public class CarUpgrades {

	public static void main(String[] args) {
	
		double cost = 11000;
		
		System.out.println("BASIC CAR MODEL COSTS: £11,000");
		System.out.println("");
		
		System.out.println("It includes:");
		System.out.println("- 1.2l petrol engine");
		System.out.println("- Silver Colour");
		System.out.println("");
		
		System.out.println("Would you like to upgrade the engine?");
		System.out.println("y for yes");
		System.out.println("n for no");
		
		Scanner userInput = new Scanner(System.in);
		String options = userInput.next();
		
		if (options.equals("y"))
		{
			System.out.println("What engine would you like to upgrade to? ");
			System.out.println("a. 1.4l petrol (add £200)");
			System.out.println("b. 1.6l petrol (add £300)");
			System.out.println("c. 1.8l petrol (add £400)");
			
			String engineOptions = userInput.next();
			if (engineOptions.equals("a"))
			{
				cost += 200;
			}
			
			else if (engineOptions.equals("b"))
			{
				cost += 300;
			}
			
			else if (engineOptions.equals("c"))
			{
				cost += 400;
			}
		}
		
		else if (!options.equals("n"))
		{
			System.out.println("Error neither y or n was entered");
		}
		
		System.out.println("Would you like to change the car colour?");
		System.out.println("y for yes");
		System.out.println("n for no");
		
		options = userInput.next();
		
		if (options.equals("y"))
		{
			System.out.println("Select from the colour options:");
			System.out.println("a. Red (add £200)");
			System.out.println("b. Green (add £300)");
			System.out.println("c. White (add £350)");
			
			String optionColour = userInput.next();
			
			if (optionColour.equals("a"))
					{
						cost += 200;
					}
			
			else if (optionColour.equals("b"))
			{
				cost += 300;
			}
			
			else if (optionColour.equals("c"))
			{
				cost += 350;
			}
			
			{
				System.out.println("Enter a valid option");
			}
			
		}
		
		else if (!options.equals("n"))
		{
			System.out.println("Error neither y or n was entered");
		}
		
		System.out.println("Would you like heated seats (£500)?");
		System.out.println("y for yes");
		System.out.println("n for no");
		
		options = userInput.next();
		
		if (options.equals("y"))
		{
			cost += 500;
		}
		
		else if (!options.equals("n"))
		{
			System.out.println("Error neither y or n was entered");
			userInput.close();
			return;
		}
		
		System.out.println("Would you like air conditioning (£500)?");
		System.out.println("y for yes");
		System.out.println("n for no");
		
		options = userInput.next();
		
		if (options.equals("y"))
		{
			cost += 500;
		}
		
		else if (!options.equals("n"))
		{
			System.out.println("Error neither y or n was entered");
			userInput.close();
			return;
		}
		
		System.out.println("Would you like parking sensors (£100)?");
		System.out.println("y for yes");
		System.out.println("n for no");
		
		options = userInput.next();
		
		if (options.equals("y"))
		{
			cost += 100;
		}
		
		else if (!options.equals("n"))
		{
			System.out.println("no");
			userInput.close();
			return;
			
		}
		
		System.out.printf("Your total car cost is: £" +"%.2f" ,cost);
		
		userInput.close();
	
	}

}
