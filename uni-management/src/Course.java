import java.util.ArrayList;

public class Course {
	public ArrayList<Unit> coreList = new ArrayList<Unit>();
	public ArrayList<Unit> electiveList = new ArrayList<Unit>();
	public ArrayList<String> studentid = new ArrayList<String>();
	String title;
	int Pass;
	Course(String newtitle,Integer noelective){
		this.title = newtitle;
		this.Pass = noelective;
	}
	public void appendcore(Unit core) {
		coreList.add(core);
	}
	public void appendelective(Unit elective) {
		electiveList.add(elective);
	}
	public void appendid(String id) {
		studentid.add(id);
	}
	public void removeid(String id) {
		studentid.remove(id);
	}

}