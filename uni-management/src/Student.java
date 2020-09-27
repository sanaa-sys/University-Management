public class Student{
	
		private String studentId;
		private String givenName;
		private String familyName;
		
		Student(String newStudentId){
			boolean numeric = true;
			try {
				int num = Integer.parseInt(newStudentId);
			}
			catch (NumberFormatException e) {
	            numeric = false;
	        }
			if (newStudentId.length() != 8 && !numeric) {
				throw new IllegalArgumentException("Id needs to have 8 digits");
			}
			else {
				studentId = newStudentId;
			}
		}
		
		// all the student attributes are taken as String, integers can be represented as string form as well
		// and sometimes in studentId we see mix of both string and integers, so I chose String 
		
		Student(String newStudentId, String newGivenName, String newFamilyName){
			boolean numeric = true;
			try {
				int num = Integer.parseInt(newStudentId);
			}
			catch (NumberFormatException e) {
	            numeric = false;
	        }
			if (newStudentId.length() != 8 && !numeric) {
				throw new IllegalArgumentException("Id needs to have 8 digits");
			}
			else {
				studentId = newStudentId;
			}
			givenName  =  newGivenName;
			familyName =  newFamilyName;
		}
		
		public String getStudentId() {
			return studentId;
		}
		
		public void setGivenName(String newGivenName){
			givenName  =  newGivenName;
		}
		
		public void setFamilyName(String newGivenName){
			familyName  =  newGivenName;
		}
		
		public String description(){
			return studentId + ' ' + givenName + ' ' + familyName ;
		}


}