package chapter18.ex02;

public class Student {
	
	private int score;		//학생의 점수를 담은 변수
	
		
	 
	
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [score=" + score + "]";
	}

	
	

}
