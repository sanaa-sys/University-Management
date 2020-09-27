import java.util.ArrayList ;
import java.util.Collections;
import java.io.*;
import java.lang.String;
import java.util.HashMap;
import java.util.Set;


public class University{
	
	private ArrayList<Unit> myList = new ArrayList<Unit>();
	private HashMap<String, Student> students = new HashMap<String, Student>();
	private ArrayList<Course> courses = new ArrayList<Course>();
	
    public void printStatus() {
        System.out.println("Welcome to Java University");
        System.out.println();
        System.out.println("Thank you for using Java University");
        
        createUnits();
        displayUnits();
        System.out.println(displaycommoncore(myList.get(0)));
        System.out.println(displaycoursegrad());
        
        System.out.println(" ");
        System.out.println("Have a good day! See you Soon!!");
        
    }
    Student studentData1 = null;
    Student studentData2 = null;
    Student studentData3 = null;
    private void createUnits() {
   
    	Unit mobileApps = new Unit("Mobile Apps", "1003", this);
    
        Unit engDesign = new Unit("Engineering design", "1001", this);
    
        Unit software = new Unit("software","2004", this);
        
   
        myList.add(mobileApps);
        myList.add(engDesign);
        myList.add(software);
        
        //Unit y = myList.get(2) ;
        //System.out.println(y.description());
        
        
        
        //String[] inputList1 = readString("Please enter Student Info (Student Id followed by Given name & Family name): ").split(" ");
        try {
            studentData1 = new Student("12345679");
            studentData1.setGivenName("Indi");
            studentData1.setFamilyName("Naidu");
        }
       catch(Exception e) {
    	   e.printStackTrace();
       }

       
        //String[] inputList2 = readString("Please enter Student Info (Student Id followed by Given name & Family name): ").split(" ");
        try {
//            studentData2 = new Student(inputList2[0]);
//            studentData2.setGivenName(inputList2[1]);
//            studentData2.setFamilyName(inputList2[2]);
            studentData2 = new Student("12345677");
            studentData2.setGivenName("Indi");
            studentData2.setFamilyName("Naidu");
        }
        catch(Exception e) {
     	   e.printStackTrace();
        }
        
        try {
            studentData3 = new Student("12345678");
            studentData3.setGivenName("Indira");
            studentData3.setFamilyName("Naidu");
        }
        catch(Exception e) {
      	   e.printStackTrace();
         }
        
        //System.out.println(hashCode(studentData2)== hashCode(studentData1));
        
        //this.admitStudent(studentData1);
        this.admitStudent(studentData2);
        this.admitStudent(studentData3);
        
        //System.out.println(students);
        
        //mobileApps.enrolStudent(studentData1);
        mobileApps.enrolStudent(studentData3);
      
        software.enrolStudent(studentData2);
        //software.enrolStudent(studentData1);
   
        engDesign.enrolStudent(studentData3);
        engDesign.enrolStudent(studentData2);

        Exam mobAppsExam = null;
        try {
        	mobAppsExam = new Exam(50,50);
        	mobileApps.addAssessment(mobAppsExam);
        }
        catch(Exception e) {
     	   e.printStackTrace();
        }
        Assignment mobAppsMap = new Assignment(25, "Subj:mobileApps map");
        Assignment mobAppsLudo = new Assignment(25, "Subj:mobileApps game");
        
        mobileApps.addAssessment(mobAppsMap);
        mobileApps.addAssessment(mobAppsLudo);
        ArrayList<Assessment> mobileScheme = mobileApps.getScheme();

        Exam softwareExam = null;
        try {
        	softwareExam = new Exam(45,90);
        	software.addAssessment(softwareExam);
        }
        catch(Exception e) {
      	   e.printStackTrace();
         }
        

        Assignment softJava = new Assignment(20, "Subj:software java programmimg");
        Assignment softPython = new Assignment(20, "Subj:software python language");
        Assignment softManagement = new Assignment(15, "Subj:software security and management");
        
        software.addAssessment(softJava);
        software.addAssessment(softPython);
        software.addAssessment(softManagement);
        
        int result = 0;
        ArrayList<Assessment> scheme = software.getScheme();
        for (int index = 0; index < scheme.size(); index++) {
        	
        	Assessment currentAssessment = scheme.get(index);
        	result += currentAssessment.getWeight();
        }
        if (result > 100 && result < 0) {
        	throw new IllegalArgumentException("Assessment weight total needs to be between 0 and 100");
        }
        
        Exam engDesExam = null;
        try {
        	engDesExam = new Exam(60,40);
        	engDesign.addAssessment(engDesExam);
        }
        catch(Exception e) {
      	   e.printStackTrace();
         }
        
        Assignment engDesLamp = new Assignment(20, "Subj:engDesign making lamp");
        Assignment engDesCircuits = new Assignment(20, "Subj:engDesign making lamp");
        
        engDesign.addAssessment(engDesLamp);
        engDesign.addAssessment(engDesCircuits);
        
        
  
        // marking for assessments
        mobAppsExam.markAssessment(studentData1.getStudentId(), 70);
        mobAppsExam.markAssessment(studentData2.getStudentId(), 59);
        mobAppsExam.markAssessment(studentData3.getStudentId(), 49);
        mobAppsMap.markAssessment(studentData1.getStudentId(), 80);
        mobAppsMap.markAssessment(studentData2.getStudentId(), 59);
        mobAppsMap.markAssessment(studentData3.getStudentId(), 50);
        mobAppsLudo.markAssessment(studentData1.getStudentId(), 80);
        mobAppsLudo.markAssessment(studentData2.getStudentId(), 59);
        mobAppsLudo.markAssessment(studentData3.getStudentId(), 50);
        
        softwareExam.markAssessment(studentData1.getStudentId(), 70);
        softwareExam.markAssessment(studentData2.getStudentId(), 59);
        softwareExam.markAssessment(studentData3.getStudentId(), 49);
        softJava.markAssessment(studentData1.getStudentId(), 80);
        softJava.markAssessment(studentData2.getStudentId(), 59);
        softJava.markAssessment(studentData3.getStudentId(), 50);
        softPython.markAssessment(studentData1.getStudentId(), 80);
        softPython.markAssessment(studentData2.getStudentId(), 59);
        softPython.markAssessment(studentData3.getStudentId(), 50);
        softManagement.markAssessment(studentData1.getStudentId(), 80);
        softManagement.markAssessment(studentData2.getStudentId(), 59);
        softManagement.markAssessment(studentData3.getStudentId(), 50);
        
        engDesExam.markAssessment(studentData1.getStudentId(), 70);
        engDesExam.markAssessment(studentData2.getStudentId(), 59);
        engDesExam.markAssessment(studentData3.getStudentId(), 49);
        engDesLamp.markAssessment(studentData1.getStudentId(), 80);
        engDesLamp.markAssessment(studentData2.getStudentId(), 59);
        engDesLamp.markAssessment(studentData3.getStudentId(), 50);
        engDesCircuits.markAssessment(studentData1.getStudentId(), 80);
        engDesCircuits.markAssessment(studentData2.getStudentId(), 59);
        engDesCircuits.markAssessment(studentData3.getStudentId(), 50);
       
        System.out.println("..........");
        System.out.println(queryUnit(mobileApps, "29585775"));
        System.out.println(getStudentMarks(mobileApps, "29585775"));
        System.out.println("..........");
        createcourse();
    }
    
    public void createcourse() {
    	Course cs = new Course("Computer Science",1);
        Course swe = new Course("Software Engineering",1);
        swe.appendcore(myList.get(0));
        swe.appendcore(myList.get(1));
        swe.appendelective(myList.get(2));
        cs.appendcore(myList.get(0));
        cs.appendelective(myList.get(1));
        cs.appendelective(myList.get(2));
        courses.add(cs);
        courses.add(swe);
        
    }
    public String displaycoursegrad() {
    	ArrayList<Unit> electiveList = new ArrayList<Unit>();
    	ArrayList<Unit> coreList = new ArrayList<Unit>();
    	ArrayList<Boolean> pass = new ArrayList<Boolean>();
    	ArrayList<String> ids = new ArrayList<String>();
    	String result = "";
    	for(int i=0;i < courses.size();i++) {
    		coreList = courses.get(i).coreList;
    		electiveList = courses.get(i).electiveList;
    		for(int j=0 ;j < coreList.size();j++) {
    			for (int k=0 ;k < coreList.get(j).enrolledStudents.size();k++) {
    				if(getStudentMarks(coreList.get(j), coreList.get(j).enrolledStudents.get(k)) > 50 ) {
    					courses.get(i).appendid(coreList.get(j).enrolledStudents.get(k));
    				}
    			}
    		}
    		for(int j=0 ;j < electiveList.size();j++) {
    			for (int k=0 ;k < coreList.get(j).enrolledStudents.size();k++) {
    				if(getStudentMarks(coreList.get(j), coreList.get(j).enrolledStudents.get(k)) > 50 ) {
    					pass.add(true);
    				}
    			if(Collections.frequency(pass, true) != courses.get(i).Pass) {
    				courses.get(i).removeid(coreList.get(j).enrolledStudents.get(k));
    			}
    			}
    		}
    	}
    	for(int i=0;i < courses.size();i++) {
    		result += "Students eligible to graduate " + courses.get(i).title +" :";
    		ids = courses.get(i).studentid;
    		for(int j=0;j < ids.size();j++) {
    			result += ids.get(j) + "\n";
    		}
    	}
    	return result;
    }
    
    public String displaycommoncore(Unit unit) {
    	
    	String result = "The courses with common core unit are: ";
    	
    	for(int i=0;i < courses.size();i++) {
    		ArrayList<Unit> coreList = courses.get(i).coreList;
    		for(int j=0;j < coreList.size(); j++) {
    			if (coreList.get(j).equals(unit)) {
    				result += courses.get(i).title + " ";
    			}
    		}
    	}
    	return result;
    }	

    private String readString(String prompt) {
    	System.out.print(prompt);
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in)
    	);
    	String s = null;
    	try {
    	s = in.readLine();
    	} 
    	catch (IOException e) {
    	e.printStackTrace();
    	}
    	
    
    	return s;
    	}


//    
//    public int hashCode(Student obj) {
//        return Integer.parseInt(obj.getStudentId());
//    }
    
    
    
    private void admitStudent(Student newStudent) {
    	
    	students.put(newStudent.getStudentId(), newStudent);
    	
    }
    
    public boolean checkAdmit(Student newStudent) {
    	
    	
    	if (students.get(newStudent.getStudentId())!= null){
    	return true;
    	}
    	
    	else {
//    		System.out.println(newStudent.description()+" can not be enrolled before "
//    				+ "admission to the University");
    		return false;
    	}
    }
    
    public String StudentDetails(String id) {
    	String result = "";
    	result = students.get(id).description();
		return result;
    }

    
    private Boolean queryUnit(Unit unit, String studentId) {
    	ArrayList<Assessment> unitScheme = unit.getScheme(); 
    	
    	for (int index = 0; index < unitScheme.size(); index++) {
    		Assessment currentAssessment = unitScheme.get(index);
    		
    		if (!currentAssessment.verifyStudent(studentId)) {
    			return false;
    		}
    	}
    	return true; 
    
    }
    
    private float getStudentMarks(Unit unit, String studentId) {
    	
    	if (queryUnit(unit, studentId)) {
    		float result = 0;
    		ArrayList<Assessment> unitScheme = unit.getScheme();
    		for (int index = 0; index < unitScheme.size(); index++) {
        		Assessment currentAssessment = unitScheme.get(index);
        		result += currentAssessment.getWeight()*currentAssessment.getStudentScore(studentId);
    		}
    		
    		return result/100;
    	}
    	
    	System.out.println("student did not complete all the assessments");
    	return 0;
    }
    
    
    private void displayUnits() {
    	
    	
    	//System.out.println('\n');
    	for (int i=0; i<myList.size(); i++) {
    		System.out.println(myList.get(i).description());
    		System.out.println(myList.get(i).displayStudentDetails());
    		System.out.println(myList.get(i).displayAssessment());
    	}
    	
    	//System.out.println(myList.get(0).invidualStudentMark());
    	
    	//System.out.println(students.get("29585775").description());
    	
    			
    	
    }
    
}