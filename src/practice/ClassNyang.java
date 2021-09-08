package practice;

import java.util.ArrayList;

public class ClassNyang {

	int subjectNum;
	String subjectName;
	String gradeType;
	ArrayList<Mong> mong;
	public ClassNyang() {
		
	}
	public ClassNyang(int subjectNum, String subjectName, String gradeType) {
		super();
		this.subjectNum = subjectNum;
		this.subjectName = subjectName;
		this.gradeType = gradeType;
		mong = new ArrayList<Mong>();
	}

	public int getSubjectNum() {
		return subjectNum;
	}

	public void setSubjectNum(int subjectNum) {
		this.subjectNum = subjectNum;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	
public String getGradeType() {
		return gradeType;
	}
	public void setGradeType(String gradeType) {
		this.gradeType = gradeType;
	}
public void setMong(Mong mong) {
	

}


}
