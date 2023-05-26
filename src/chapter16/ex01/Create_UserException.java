package chapter16.ex01;

//1.일반예외 (사용자 정의 예외)
class MyException extends Exception {
	//1.기본생성자
	MyException () {} 
	//	super();
	
	//2.오류메시지를 인풋 받아서 처리해주는 생성자
	MyException (String message) {
		super (message) ;		//Exception 부모의 생성자에 넣어줌.
		
	}
}

//2.실행예외 (사용자 정의 예외)
class MyRuntimeException extends RuntimeException {
	//1.기본생성자.
	MyRuntimeException () {
		
	}
	//메시지를 처리할 생성자.
	MyRuntimeException (String message) {	//오류메시지를 인풋 받아서 부모클래스의 생성자에게 던짐.
		super (message);
}
}

//3.사용자 정의 예외를 사용하는 클래스
class A {
	//1.사용자 정의 예외의 객체생성 (기본생성자)
	MyException me1 = new MyException (); 				//일반예외처리
	MyRuntimeException me2 = new MyRuntimeException ();	//실행예외처리
	
	//2.필드선언
	MyException mre1 = new MyException ("예외메세지 : MyException");		//오류메시지를 생성자에 넣어서 처리하는 객체생성
	MyRuntimeException mre2 = new MyRuntimeException ("예외메세지 : MyRuntimeException");		//오류메시지를 생성자에 넣어서 처리하는 객체생성
	
	//3.예외던지기. ( throw : 예외를 강제로 발생 시킨다.)
	
	//정수를 인풋받아서 70이하 이면 예외를 강제로 발생(예외를 직접)
	void abc_1 (int num) {
		try {
		if (num >70 ) {
			//정상처리
			System.out.println("당신이 넣은 값은 : " + num + " 이고 정상작동.");
		}else {
			//예외를 강제로 발생시킴.
			throw mre2;		//RuntimeException 
		}
		
	}	catch (MyRuntimeException e) {
		System.out.println(e.getMessage()); 	//실행예외가 발생되었을때 예외메시지를 출력
	}
	}
	//abc_1() 메소드를 호출하는 
	void bcd_1 () {
		abc_1 (60);
	}
	
	//정수를 인풋받아서 70이하 이면 예외를 강제로 발생(예외를 미루기)
	void abc_2 (int num) throws MyException {		//abc_2()메소드를 호출하는 곳에서 예외를 처리함.
		if (num >70) {	//정상처리
			System.out.println("당신이 넣은 값은 : " + num + " 이고 정상값입니다.");
		}else {	//예외를 강제로 발생 (throws : 예외를 미루기 / throw : 예외를 강제로 발생.)
			throw mre1 ;		//일반예외 
		}
		
	}
	
	void bcd_2() {		//메소드 호출
		
		try {
		abc_2 (80);
	} catch (MyException e) {
		System.out.println(e.getMessage()); 		//MyException의 생성자에 넣은 오류메세지를 출력해라.
	}
}
}



public class Create_UserException {

	public static void main(String[] args) {
		
		/*
		  사용자 정의 예외 : Java에서 제공되지 않는 예외를 사용자가 직접 만들어서 사용
		  	-일반 예외(checked exception) : 컴파일 단계에서 오류발생.->예외 처리가 반드시 필요
		  		-exception 클래스를 상속해서 사용자 정의 예외 (1.기본생성자 , 2.오류 메세지를 처리할 생성자 )
		  	-실행 예외 (Unchecked Exception , RuntimeExccption) : 실행 단계에서 예외 발생
		  		-Runtime Exception클래스를 상속해서 사용자 정의 예외를 만든다.
		 */
		
		A a1 = new A ();
		a1.bcd_1();
		
	}

}
