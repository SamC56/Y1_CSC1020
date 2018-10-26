package practical4;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		
		if(IsLeapYear())
		{
			System.out.println("It was!");
		}
		else 
		{
			System.out.println("It was not!");
		}
	}


	public static boolean IsLeapYear()
	{
		
		boolean result = false;
		
		Scanner UserInput = new Scanner(System.in);
		System.out.println("Please insert a year: ");
		
		int Year = UserInput.nextInt();
		
		UserInput.close();

		if (Year % 400 == 0) {
			result = true;
			
		}
		else if (Year % 4 == 0 && Year % 100 != 0) {
			result = true;
		}

		return result;
		
	}

}
