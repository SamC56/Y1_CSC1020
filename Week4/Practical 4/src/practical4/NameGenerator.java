package practical4;

import javax.swing.JOptionPane;

public class NameGenerator {

	public static void main(String[] args) {
		
		String firstName = JOptionPane.showInputDialog(null, "Please enter your first name:");
		String firstPet = JOptionPane.showInputDialog(null, "Please enter your first pet:");
		String cityBorn = JOptionPane.showInputDialog(null, "Please enter the city where you were born:");
		String favCity = JOptionPane.showInputDialog(null, "Please enter your favourite city: ");
		
		
		String name = firstName.substring(0,3) + cityBorn.substring(3,5) + favCity.substring(2,3);
		String land = firstPet.substring(0,3) + cityBorn.substring(5,8) + favCity.substring(0,4);
		
		JOptionPane.showMessageDialog(null, ("You are " + name + " from the land " + land));
		
	}

}
