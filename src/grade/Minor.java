package grade;

public class Minor implements Grade {

	@Override
	public String grade(int score) {
		String str = null;
	
		 if(score >= 100 || score < 80) {
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
		return str;
	}




	

}
