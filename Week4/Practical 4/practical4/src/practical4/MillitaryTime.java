package practical4;

import java.util.Scanner;

public class MillitaryTime {

	public static void main(String[] args) {
		
		Scanner UserInput = new Scanner(System.in);
		
		System.out.println("Please enter the first time in 24 hour format (eg. 0722): ");
		int time1 = UserInput.nextInt();
		
		System.out.println("Please enter the second time in 24 hour format (eg. 0722): ");
		int time2 = UserInput.nextInt();
		
		UserInput.close();
		
		int difference = Math.abs(time2 - time1);
		System.out.println(difference);
		String differenceAsString = Integer.toString(difference);
		
		if (differenceAsString.length() == 3) {
			differenceAsString = "0" + differenceAsString;
		}
		
		String hours = differenceAsString.substring(0,2);
		String minutes = differenceAsString.substring(2,4);
		
		int hoursInt = Integer.parseInt(hours);
		int minutesInt = Integer.parseInt(minutes);
		
		if (minutesInt > 60 ) {
			minutesInt -= 60;
			hoursInt += 1;
		}
		
		/* if (time2 > time1) {
			difference = 2400-difference;
		}
		
		
		*/
		
	
		System.out.println("The difference in time is: " + differenceAsString);
		System.out.println("The difference in time is: " + hoursInt + " hours and " + minutesInt + " minutes");
	 
	}

}
