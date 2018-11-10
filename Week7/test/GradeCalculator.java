import java.util.Scanner;
public class GradeCalculator {

	public static void main(String[] args) {
		
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter your percentage: ");
		int percentage = userInput.nextInt();
		int casePercentage = percentage / 10;
		String Grade = "";
		
		switch (casePercentage) {
		case 1: 
		case 2:
		case 3: Grade = "U";
				break;
		case 4: Grade = "E";
				break;
		case 5: Grade = "D";
				break;
		case 6: Grade = "C";
				break;
		case 7: Grade = "B";
				break;
		case 8: Grade = "A";
				break;
		case 9: Grade = "A*";
				break;
			
		}
		
		if (percentage < 60)
		{
			System.out.println("You have failed with the grade: " + Grade);
		}
		
		else
		{
			System.out.println("You have passed with the grade: " + Grade);
		}
		
		userInput.close();
	}

}
