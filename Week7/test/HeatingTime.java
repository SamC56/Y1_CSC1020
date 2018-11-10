import java.util.Scanner;
public class HeatingTime {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter the time to cook: ");
		double minutes = userInput.nextDouble();
		
		if (minutes <= 0)
		{
			System.out.println("Please enter a valid number of minutes");
			userInput.close();
			return;
		}
		
		System.out.print("Please enter the number of items to be heated: ");
		int Items = userInput.nextInt();
		
		if (Items == 0)
		{
			System.out.println("Please enter a valid number of items");
		}
		
		else if (Items > 3)
		{
			System.out.println("Heating more than three items is not recommended");
		}
		
		else if (Items == 1)
		{
			System.out.println("It will take " + oneItemTime(minutes) + " minutes to cook.");
		}
		
		else if (Items == 2)
		{
			System.out.println("It will take " + twoItemTime(minutes) + " minutes to cook.");
		}
		
		else if (Items == 3)
		{
			System.out.println("It will take " + threeItemTime(minutes) + " minutes to cook.");
		}
		
		else
		{
			System.out.println("I shouldn't see this message");
		}
		
		
		userInput.close();

	}
	
	public static double oneItemTime(double minutes)
	{
		double recommendedTime = minutes;
		
		return recommendedTime;
	}
	
	public static double twoItemTime(double minutes)
	{
		double recommendedTime = (minutes * 1.5);
		
		return recommendedTime;
	}
	
	
	public static double threeItemTime(double minutes)
	{
		double recommendedTime = (minutes * 2);
		
		return recommendedTime;
	}

}
