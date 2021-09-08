package test;

import javax.security.auth.Subject;

import grade.Grade;
import grade.Major;
import num.Num;
import practice.ClassNyang;
import practice.Mong;
import practice.Practice;
import practice.Score;
import record.RecordRe;

public class Main {

	Practice practice = Practice.getInstance();
	ClassNyang korean = new ClassNyang();
	RecordRe recordRe = new RecordRe();
	Mong mong = new Mong();
	Major major = new Major();
	public static void main(String[] args) {
	   
		Main main = new Main();
        main.subject();
        main.student();
        
        String str = main.recordRe.getRecord();
        System.out.println(str);
       
	}


	public void subject() {
	 korean = new ClassNyang(Num.korean, "국어", Grade.majorCode);
		practice.addClassNyang(korean);
		

	}

	public void student() {
		Mong mong = new Mong(20110209, "고보배", 100, korean);
		practice.addMong(mong);
		String result = major.grade(mong.getScore(), korean.getGradeType());
		System.out.println(result);
	}
	
	public void addScore(Mong stutentNum, Mong StudentName, Mong score) {
		
		Score score1 = new Score(mong.getScore(), mong.getStudentNum(), mong.getStudentName());
		practice.addScoreList(score1);
		
	}
}
