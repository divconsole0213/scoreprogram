package grade;

public class Major implements Grade {


	
	@Override
	public String grade(int score, String majorCode) {
		String str = null;
		majorCode = "A7";
		if(score >= 95 || score <= 100) {
			str = "A+";
		}
		else if(score >= 90 || score < 95) {
			str = "A";
		}
		else if(score >= 80 || score <= 70) {
			str = "B";
		}
		else if(score >= 70 || score <= 60) {
			str = "C";
		}
		else if(score >= 60 || score <= 50) {
			str = "D";
		}
		else {
			str ="F";
		}
		return str + majorCode;
	}

}