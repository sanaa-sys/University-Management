import java.util.ArrayList;

public class AssessmentScheme {
	public ArrayList<Assessment> assessmentList = new ArrayList<Assessment>();
	
	public void appendAssessment(Assessment newAssessment) {
		assessmentList.add(newAssessment);
	}
	
	public String printAssessment() {
		String result = "";
		for (int i= 0; i<assessmentList.size(); i++) {
			result += assessmentList.get(i).description() + '\n' ;
		}
		return result;
	}
	public ArrayList<Assessment> getAssessments() {
		return this.assessmentList;
	}
}