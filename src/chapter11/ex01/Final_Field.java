package chapter11.ex01;

class A {
	int a = 3;				//필드 : Heap에 변수와 값이 저장됨 , 값을 수정할 수 있다.
	final int b = 5;		// 상수 : 값을 수정할수 없다.
	
	A () {
		a=7;	//수정가능
//		b=10; -> 오루발생 (상수라서 수정 불가능)
	}

	void print () {
		int c = 10; 	//지역변수 -> Stack에 저장
		final int d = 20;	//지역상수 : 값을 수정할수 없다.
		
		c=100;	
//		d=200; -> 값을 수정할수 없다.
	}
}

public class Final_Field {

	public static void main(String[] args) {
		
		/*
		 	final modifier : 마지막
		 	-필드,변수 이름앞에 final - 필드[변수] : 값을 수정하지 못하도록 제어 ->상수
		 	- 메소드 이름 앞 final : 메소드를 수정 못하도록 제어 ->overriding 할수 없는 메소드
		 	- 클래스 이름 앞 final : 상속할수 없는 클래스(상속 불가)
		  	
		 */
	}

}
