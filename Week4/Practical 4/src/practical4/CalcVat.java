package practical4;
import java.util.Scanner;

public class CalcVat {
	public static void main (String[] args) {
	// declare the VAT rate as a final
	final double VATRATE = 20;
	// declare the purchase price
	Scanner UserInput = new Scanner(System.in);
	
	System.out.println("Please enter the price of the item: ");
	double price = UserInput.nextDouble();
	// declare a variable to hold the VAT to be paid
	double vat;
	// Do the calculation
	
	vat = price * (VATRATE/100);
	
	// output the answer 
	
	System.out.printf("The vat to pay is: £%.2f.%n", vat);
	UserInput.close();
	}
}
