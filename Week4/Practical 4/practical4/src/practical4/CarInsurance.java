package practical4;

import java.util.Scanner;
public class CarInsurance {
	
	 enum coverage {COMPREHENSIVE, THIRD_PARTY_FIRE_AND_THEFT, THIRD_PARTY} 
	
	public static void main(String[] args) {
		double insuranceCost = 200.00;
		String comprehensive = "Comprehensive";
		String thirdPartyFireAndTheft = "Third Party Fire and Theft";
		String thirdParty = "Third Party";		
		//coverage insuranceCoverage;
				
		System.out.println("Please enter type of insurance (Comprehensive, Third Party Fire and Theft, Third Party): ");
		
		Scanner UserInput = new Scanner(System.in);
		
		String insuranceType = UserInput.nextLine();
		
		if (insuranceType.equals(comprehensive)) {
			//insuranceCoverage = coverage.COMPREHENSIVE;
			insuranceCost += 200.00;
		}
		
		else if (insuranceType.equals(thirdPartyFireAndTheft)) {
			//insuranceCoverage = coverage.THIRD_PARTY_FIRE_AND_THEFT;
			insuranceCost += 100.00;
		}
		
		else if (insuranceType.equals(thirdParty)) {
			//insuranceCoverage = coverage.THIRD_PARTY;
		}
		
		System.out.println("Please enter your age: ");
		int age = UserInput.nextInt();
		
		if ( age < 17) {
			System.out.println("You're too young to drive.");
			UserInput.close();
			return;
			
		}
		
		else if (age <= 20 && age >= 17) {
			insuranceCost += 900.00;
			
		}
		
		else if (age <= 30 && age >=21) {
			insuranceCost += 300.00;
		}
		
		else if (age <=40 && age >= 31) {
			insuranceCost += 100.00;
		}
		
		System.out.println("Please enter the number of years of no claims bonus you have: ");
		int noClaimsBonus = UserInput.nextInt();
		
		if (noClaimsBonus == 0) {
			
		}
		
		else if (noClaimsBonus >= 5) {
			insuranceCost = insuranceCost * 0.5;
		}
		
		else {
			insuranceCost = insuranceCost * (1-(0.1 * noClaimsBonus));
		}
			
		
		System.out.println("The Cost of your insurance is: " + insuranceCost);
		UserInput.close();

	}

}
