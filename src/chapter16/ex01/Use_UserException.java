package chapter16.ex01;

//음수의 값을 넣으면 예외를 강제발생 : 일반예외 
class MinusException extends Exception {
	
	//기본생성자
	MinusException () {}
	//예외의 메세지를 처리하는 생성자.
	MinusException (String message) {		//e.getmessage ()
	super(message);
	}
	
}
// 100점이상의 값을 넣으면 예외를 강제로 발생 : 일반예외
class OverException extends Exception {
	OverException () {}
	OverException (String message) {		//e.getmessage()
		super(message);
	}
	
}

//사용자 정의 예외를 사용하는 클래스 생성.
class Aa {
	void checkScore (int score) throws MinusException, OverException {
		if ( score < 0) {
			//minus exception 호출
			throw new MinusException ("예외발생됨 : 음수값은 입력이 불가능합니다. ");
			
		}else if (score >100) {
			//overexception 호출
			throw new OverException ("예외발생됨 : 100점 이상은 입력이 불가능합니다. ");
			
		}else  {
			System.out.println("정상적으로 값이 잘 입력되었습니다." + score);
		}
		
		
	}
}


public class Use_UserException {

	public static void main(String[] args) throws MinusException, OverException {

		//객체생성 
		
		Aa a1 = new Aa();
		
		//메소드 호출 : throws미루었기 때문에 호출하는 쪽에서 예외를 처리
		
		a1.checkScore(10);
		
		
	}

}
