import java.util.HashMap;
/**
 * Implements Assessments for each unit which consists of exams and assignments.It is an abstract class with Exam and
 * Assignment as its sub classes
 * @author AYESHA ALI
 *
 */
public abstract class Assessment {

	private int weight; 
	private HashMap<String, Mark> compAssessment = new HashMap<String, Mark>();
	/*Create an assessment, either an exam or assignment with weight and stores mark of each assessment for each student
	 * with each assessment mark stored as a value with student id being key
	 * @param value:weight of the assignment which has to be in range of 1 and 100
	 */
	
	public void setWeight(int value) {
	

		if (value > 100 && value < 1) {
			throw new IllegalArgumentException("Assessment weight needs to be between 1 and 100");
		}
		else {
			this.weight = value ;
		}
		
	}
	
	public int getWeight() {
		/*Getter method for weight
		 * @param:none
		 * @return:this.weight:Integer
		 */
		return this.weight ;
	}
	
	public abstract String description();
	/*An abstract used by child methods to print descriptions
	 * @param:none
	 * @return:none
	 */
	public void markAssessment(String studentId, int mark ) {
		/*An abstract used by child methods to print descriptions
		 * @param:studentId:String
		 * @param:mark:Integer
		 * @return:none
		 */
		String comment = "";
		if(mark>=50) {
			comment = "Well Done! you have passed.";
		}
		else {
			comment = "Try harder next time!";
		}
		System.out.println("hi");
		Mark markObj = new Mark(mark, comment);
		
		compAssessment.put(studentId, markObj);
		
		
	}
	public String getPerAssessmentFeedback(String studentId) {
		/*This method returns comment for assignment
		 * @param:studentId:String
		 * @return:Comment for an assessment
		 */
		//System.out.println(compAssessment.get(studentId).displayMark());
		return compAssessment.get(studentId).displayScoreComment();
	}
	
	public int getStudentScore(String studentId) {
		/*This method returns mark for assignment
		 * @param:studentId:String
		 * @return:mark for an assessment
		 */
		//System.out.println(compAssessment.get(studentId).displayMark());
		return compAssessment.get(studentId).getScore();
	}
	
	
	// Check if Students in the HashMap
		public Boolean verifyStudent(String studID) {
			/*This method checks if a student exists hashmap compassessment or not
			 * @param:studentId:String
			 * @return:bool
			 */
			if (this.compAssessment.containsKey(studID)) {
				return true;
			}
			return false;
		}

}