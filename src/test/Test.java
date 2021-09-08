//package test;
//
//import java.io.BufferedInputStream;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Scanner;
//
//import grade.Grade;
//import grade.Major;
//import grade.Minor;
//import num.Num;
//import practice.ClassNyang;
//import practice.Mong;
//import practice.Practice;
//import practice.Score;
//import record.RecordRe;
//
//public class Test {
//
//	Practice practice = Practice.getInstance();
//    Major major = new Major();
//    Minor minor = new Minor();
//	RecordRe recordRe = new RecordRe();
//	ClassNyang classNyang = new ClassNyang();
//	Mong mong = new Mong();
//	
//	public static void main(String[] args) throws FileNotFoundException,IOException {
//       Test tes = new Test();
//       tes.subject();
//       tes.student(); 
//       
//       String str = tes.recordRe.getRecord();
//       System.out.println(str);
//	}
//
//	public void subject() {
//		ClassNyang korean = new ClassNyang(Num.korean,"국어",Grade.majorCode);
//		practice.addClassNyang(korean);
//		
//	}
//
//	public void student() throws FileNotFoundException, IOException {
//		Scanner sc = new Scanner(new FileInputStream("text.txt"));
//		Mong mong = null;
//		while(sc.hasNextLine()) {
//			
//			int studentNum;
//			String studentName;
//			int score;
//			studentNum = sc.nextInt();
//			studentName = sc.nextLine();
//			score = sc.nextInt();
//			String cd;
//			cd = sc.nextLine();
//		   if(cd == Grade.majorCode) {
//			  mong = new Mong(studentNum, studentName, score);
//		   }
//		   if (cd == Grade.minorCode) {
//			   mong = new Mong(studentNum, studentName, score);
//		   }
//		   practice.addMong(mong);
//		   classNyang.register(mong);
//		   addScore(score);
//		}
//		sc.close();
//      
//      
//      
//	}
//
//	public void addScore(int score) {
//		Score scoreBeam = new Score(mong.getScore(),mong.getStudentNum(),mong.getStudentName());
//	    practice.addScoreList(scoreBeam);
//	}
//
//	
//
//}
