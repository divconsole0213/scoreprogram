package practice;

public class Score {

	public int score;
	int studentNum;
	String StudentName;
	
	
	
	public Score(int score,int StudentNum, String studentName) {
		this.score = score;
		this.studentNum = StudentNum;
		this.StudentName = studentName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	
	
}
