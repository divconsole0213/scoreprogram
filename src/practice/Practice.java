package practice;

import java.util.ArrayList;

public class Practice {
	
  static Practice instance;
  
   private Practice() {
	   
   }
   
   public static Practice getInstance() {
	   
	   if(instance == null) {
		   instance = new Practice();
	   }
	return instance;
	   
   }
   
    ArrayList<ClassNyang>classNyangs = new ArrayList<ClassNyang>();
  public void addClassNyang(ClassNyang classNyang) {
	  classNyangs.add(classNyang);
  }

public  ArrayList<ClassNyang> getClassNyangs() {
	return classNyangs;
}


ArrayList<Mong>mongs = new ArrayList<Mong>();
public void addMong(Mong mong) {
	mongs.add(mong);
}

public ArrayList<Mong> getMongs() {
	return mongs;
}

ArrayList<Score>scoreList = new ArrayList<Score>();
public void addScoreList(Score score) {
	scoreList.add(score);
}

public ArrayList<Score> getScoreList() {
	return scoreList;
}
}