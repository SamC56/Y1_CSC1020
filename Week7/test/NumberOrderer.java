import java.util.Scanner;
public class NumberOrderer {

	
	
	
	public static void main(String[] args) {
		
		Scanner UserInput = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		int firstInt = UserInput.nextInt();
		
		System.out.println("Please enter an integer: ");
		int secondInt = UserInput.nextInt();
		
		System.out.println("Please enter an integer: ");
		int thirdInt = UserInput.nextInt();
		
		UserInput.close();
		
		if (thirdInt >= secondInt && secondInt >= firstInt)
		{
			System.out.println(firstInt +  ", " + secondInt + ", " + thirdInt + " are increasing in value");
		}
		
		else if (firstInt >= secondInt && secondInt >= thirdInt)
		{
			System.out.println(firstInt +  ", " + secondInt + ", " + thirdInt + " are decreasing in value");
		}
		
		else
		{
			System.out.println(firstInt +  ", " + secondInt + ", " + thirdInt + " are neither increasing or decreasing");
			System.out.println(reorderer(firstInt, secondInt, thirdInt));
		}

	}
	
	
	public static String reorderer(int firstInt, int secondInt, int thirdInt) {
		String orderedNumbers = "";
		
		int greatestInt = 0;
		int middleInt = 0;
		int smallestInt = 0;
		
			if (firstInt > greatestInt)
			{
				smallestInt = middleInt;
				middleInt = greatestInt;
				greatestInt = firstInt;
			}
		
			else if (firstInt > middleInt)
			{
				smallestInt = middleInt;
				middleInt = firstInt;
			}
			
			else
			{
				smallestInt = firstInt;
			}
			
			
			
			if (secondInt > greatestInt)
			{
				smallestInt = middleInt;
				middleInt = greatestInt;
				greatestInt = secondInt;
			}
		
			else if (secondInt > middleInt)
			{
				smallestInt = middleInt;
				middleInt = secondInt;
			}
			
			else
			{
				smallestInt = secondInt;
			}
		
			
			if (thirdInt > greatestInt)
			{
				smallestInt = middleInt;
				middleInt = greatestInt;
				greatestInt = thirdInt;
			}
		
			else if (thirdInt > middleInt)
			{
				smallestInt = middleInt;
				middleInt = thirdInt;
			}
			
			else
			{
				smallestInt = thirdInt;
			}
		
			
			
			
			orderedNumbers = smallestInt + ", " + middleInt + ", " + greatestInt + " are in increasing order";
		
		return orderedNumbers;
	}

}
