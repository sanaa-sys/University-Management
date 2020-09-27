import java.util.ArrayList;


public class Unit{
	 
	private String unitCode;
	private String unitName;
	private University uni;
	public AssessmentScheme unit_assessmentScheme;
	public ArrayList<String> enrolledStudents = new ArrayList<String>();
	 
	 
	Unit(String newUnitName, String newUnitCode, University uni){
		
		unitName = newUnitName;
		unitCode = newUnitCode;
		this.uni = uni;
	    unit_assessmentScheme = new AssessmentScheme();
		
	}
	
	public void appendcore(Course core) {
		Core.add(core);
	}
	public void appendelective(Course elective) {
		Elective.add(elective);
	}
	public String description() {
		return unitCode+ " " +unitName + '\n' + "Enrolled Students:";
	}
	
	public void enrolStudent(Student newStudent) {
		

		if(uni.checkAdmit(newStudent)) {
		enrolledStudents.add(newStudent.getStudentId());
		}
		else {
			System.out.println(newStudent.description()+" can not be enrolled before "
    				+ "admission to the University");
		}
	
	}
	
	public String displayStudent() {
		
		String result = "";
		for (int i= 0; i<enrolledStudents.size(); i++) {
			result = result + enrolledStudents.get(i)+ '\n';
		}
		return result;
		
	}
	
	public String displayStudentDetails() {
		String result = "";
		for (int i= 0; i<enrolledStudents.size(); i++) {
			result += uni.StudentDetails(enrolledStudents.get(i))+ '\n' ;
		}
		return result;
		
	}
	
	public void addAssessment(Assessment assessment) {
		unit_assessmentScheme.appendAssessment(assessment);

	}
	
//	public String invidualStudentMark() {
//		String result = "";
//		for (int i= 0; i<enrolledStudents.size(); i++) {
//			for (int j= 0; j<unit_assessmentScheme.assessmentList.size(); j++) {
//				result +=  unit_assessmentScheme.assessmentList.get(j).getAssessment(enrolledStudents.get(i))+ '\n' ;
//			}
//			
//		}
//		
//		return result;
//	}
	
	
	public ArrayList<Assessment> getScheme() {
		return unit_assessmentScheme.getAssessments();
	}
	
	
	public String displayAssessment() {
		return unit_assessmentScheme.printAssessment();
	}
	
}