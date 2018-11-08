package TuesdayDemo;

import java.util.Scanner;

public class GameTester {

	public static Game addAGame() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter game name: ");
		String name = input.nextLine();
		input.close();
		Game gme1 = new Game(name);
		return gme1;
	}
	
	public static int getAScore() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter game score: ");
		int score = input.nextInt();
		input.close();
		return score;
	}
	
	public static void main(String[] args) {
		Game g1 = new Game("Space Invaders");
		System.out.println(g1.getDetails());

		g1.recordScore(25, "Paul");
		System.out.println(g1.getDetails());
		
		g1.recordScore(30, "Jim");
		System.out.println(g1.getDetails());
	}

}
