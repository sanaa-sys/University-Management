/**
 * this class stores score and comment for each student for an assessment
 * @author AYESHA ALI
 *
 */
public class Mark {
	// private instances score == marks
	// and comment for that score
	private int score;
	private String comment;
	
	// constructor
	Mark(int newScore, String newComment){
		if (newScore > 100 && newScore < 0) {
			throw new IllegalArgumentException("Score needs to be between 0 and 100");
		}
		this.score = newScore;
		this.comment = newComment;
	}
	
	// methods are public to access the score and comment
	public String displayScoreComment() {
		/* This method returns score and comment as a part of a mark
		 * @return: result:String
		 */
		String result = Integer.toString(this.score)+ " >>> ";
		result+= this.comment;
		return result;
	}
	
	// getter method
	public int getScore() {
		/* Getter method for score
		 * @return: this.score:Integer
		 */
		return this.score;
	}
	
	// getter method
	public String getComment() {
		/* Getter method for comment
		 * @return: this.comment:String
		 */
		return this.comment;
	}
	

}