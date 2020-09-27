/**
 * Child class of assessment which checks defines an exam for a unit with a weight and duration
 * if duration entered by user is less than 30 it throws an error 
 * @author AYESHA ALI
 *
 */

public class Exam extends Assessment{
	private int duration;
	
	Exam(int weightValue, int durationValue){
		setWeight(weightValue);
		if (durationValue < 30){
			throw new IllegalArgumentException("Exam duration too short");
		}
		else {
			duration = durationValue;
		}
		
	}
	
	public String description() {
		/* This method returns description of an exam
		 * @return: result:String
		 */
		String result = "Exam: ";
		result += "duration "+ duration + " minutes,";
		result += "weight "+ getWeight() +"%"; 
		return result;
	}
	
}