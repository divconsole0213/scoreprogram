package record;

import java.util.ArrayList;

import grade.Grade;
import grade.Major;
import practice.ClassNyang;
import practice.Mong;
import practice.Practice;
import practice.Score;

public class RecordRe {
    Practice practice = Practice.getInstance();
	
	public static final String title = " 등급 \t\t\n ";
  public static final String Header = " 학번    | 이름  | 점수 | 과목 \n ";
  public static final String Line = " ================================== ";
  private StringBuffer sb = new StringBuffer();
  
  public String getRecord() {
	  ArrayList<Mong>mongs = practice.getMongs();
	  ArrayList<ClassNyang>classNyangs = practice.getClassNyangs();
	  ArrayList<Score>scoreList = practice.getScoreList();
	 
	Major major = new Major();
		  makeHeader(mongs);
		  makeBody(classNyangs);
		  makefooter();
	  
	return sb.toString();
	  
  }
  
public void makeHeader(ArrayList<Mong> mongs) {
 
	for(Mong mong :mongs) {
		sb.append(Header);
		
		sb.append(mong.getStudentNum());
		sb.append("\s\s"+ mong.getStudentName());
		sb.append("\s\s\s"+mong.getScore());
	}
}
  private void makeBody(ArrayList<ClassNyang> classNyangs) {
	  for(ClassNyang classNyang : classNyangs) {
		 
		  
		  sb.append("\s\s\s\s"+ classNyang.getSubjectName());
	  }
  
  }
	private void makefooter() {
		  
		  
     
	
}
}
