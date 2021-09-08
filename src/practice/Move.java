package practice;



 public class Move <Comunnication> {


	 
	 public Move<Comunnication> speak(int count){
		 for(int i = 0; i < count; i++) {
			 System.out.println("말을 합니다.");
			 
		 }
			 return null;
		 
	 }

	 
	 public Move<Comunnication>listen(int count){
		 for(int i = 0; i < count; i++) {
		 System.out.println("듣습니다.");
		 }
		return null;
		 
	 }
}



