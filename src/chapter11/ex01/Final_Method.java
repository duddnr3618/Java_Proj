package chapter11.ex01;

class Aa {
	void print () {		//자식 클래스에서 오버라이딩 가능 -> 부모의 실행블락 코드를 자식에서 새롭게 정의해서 사용가능.
		
		System.out.println("Aa클래스의 print () ");
	}
	
	final void run () {	//자식 클래스에서 오버라이딩 불가능 -> 자식 클래스에서 수정하지 못하도록 설정
		
		System.out.println("Aa클래스의 run () ");
	}
}

class Bb extends Aa  {
	@Override
	void print() {
		System.out.println("Bb 클래스의 print() ");
	}
	
	//오버라이딩 불가 void run () {} 
}

public class Final_Method {

	public static void main(String[] args) {
		/*
  			final method : 자식클래스에서 오버라이딩 불가하도록 부모클래스의 인스턴스 메소드에서 설정
		 */
	}

}
