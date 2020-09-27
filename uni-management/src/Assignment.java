/**Child class of assessment which checks defines an assignment for a unit with a weight and title
 * 
 * @author AYESHA ALI
 *
 */
public class Assignment extends Assessment {
	private String title;
	
	Assignment(int weightValue, String newTitle){
		setWeight(weightValue);
		title    = newTitle;
	}
	
	public String description() {
		/* This method returns description of an assignment
		 * @return: result:String
		 */
		String result = "Assignment: ";
		result +=  title + ",";
		result += "weight "+ getWeight() +"%"; 
		return result;
	}
}