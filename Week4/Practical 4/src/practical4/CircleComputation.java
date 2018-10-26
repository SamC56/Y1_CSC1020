package practical4;

import java.util.Scanner;
public class CircleComputation {

	public static void main(String[] args) {
		
		Scanner UserInput = new Scanner (System.in);
		System.out.println("Please Insert a radius: ");
		double radius = UserInput.nextDouble();
		UserInput.close();
		
		
		double area = (Math.PI*(Math.pow(radius, 2)));
		double circumference = (2*Math.PI*radius);
		
		System.out.println("The radius is: " + radius + " the area is: " + area + " the circumference is: " + circumference);
		

	}

}
