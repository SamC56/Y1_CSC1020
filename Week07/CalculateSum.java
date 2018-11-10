import javax.swing.JOptionPane;

public class CalculateSum {
	
public static void main(String[] args) {
	// obtain the two integers the user enters and save them as a string
	String userInput1 = JOptionPane.showInputDialog("Please enter your first integer:");
	
	String userInput2 = JOptionPane.showInputDialog("Please enter your second integer:");
	// The numbers are read in as Strings. They must be integers to do calculations.
	
	// The parseInt method of the Integer class achieves this, as follows
	int num1 = Integer.parseInt(userInput1);
	int num2 = Integer.parseInt(userInput2);
	
	// obtain the sum of the two numbers entered by the user
	int sum = num1 + num2;
	
	// output the answer in a dialog box
	JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is " + sum);
	}
}
