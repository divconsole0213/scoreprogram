package practice;

import java.util.ArrayList;

public class Mong {

	int studentNum;
	String studentName;
	int score;
	ClassNyang classNyang;
	
	public Mong() {
		
	}
	public Mong(int studentNum, String studentName, int score,ClassNyang classNyang) {
		super();
		this.studentNum = studentNum;
		this.studentName = studentName;
		this.score = score;
		this.classNyang = classNyang;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		studentName = studentName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
