package TuesdayDemo;

public class Game {
	private String gameName;			// Name of the game
	private int topScore;				// Highest score
	private String topScorerName;		// Name of player with highest score
	private int secondScore;			// Second score
	private String secondScorerName;	// Name of player with second score
	
	public Game(String name) {			// constructor
		this.gameName = name;
		this.topScore = -1;				// -1 means game has not yet been played
		this.topScorerName = "";
		this.secondScore = -1;
		this.secondScorerName = "";
	}
	
	// getters
	public String getName() {
		return gameName;
	}
	
	// methods
	public int hiScore() {				// -1 will indicate game not yet played
		return topScore;
	}
	
	public String highestScorer() {
		return topScorerName; 			// will be "" if game not played
	}
	
	public String getDetails() {			// should return a String - table of scores
		// Set up results String
		String res = "";
		
		// -add heading to results String
		res += "Scores for game: " + gameName + "\n";
		
		// -does a topScore exist?
		if ( topScore != -1) {
				// -add topScore to results String
			res += "1st\t" + topScore + "\t" + topScorerName + "\n";
				// -does a secondScore exist?
			if ( secondScore != -1) {
						// - add secondScore to results String
				res += "2nd\t" + secondScore + "\t" + secondScorerName + "\n";
			}
		}
		else {
		// -otherwise 
				// - add "Game has not been played." to results String
			res += "Game not played.\n";
		
		}
		// return results String
		return res;
	}
	
	public boolean recordScore(int score, String player) {
		// set boolean response to false by default
		boolean recorded = false;
		
		// -check if score is the new topScore
		if (score > topScore) {
				// - copy topScore/topName to secondScore/secondName
			secondScore = topScore;
			secondScorerName = topScorerName;
				// - topScore becomes score
			topScore = score;
			topScorerName = player;
				// - set response to true
			recorded = true;
			
		}
		else if (score > secondScore) {
		// -otherwise check if score is new secondScore
				// - secondScore becomes score
			secondScore = score;
				// - secondName becomes player
			secondScorerName = player;
				// - set response to true
			recorded = true;
		}
		// return boolean response
		return recorded;
	}
}
