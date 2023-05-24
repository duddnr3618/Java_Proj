package chapter12.ex03;
//1.정식표현
interface A {		//필드 , 메소드
	//필드
	public static final int a = 3;
	
	//메소드
	public abstract void abc ();
	
}

//인터페이스의 구현되지 않는 메소드를 구현하는 클래스
class Aa implements A {
	@Override
	public void abc() {
		System.out.println("A인터페이스의 구현되지 않는 메소드를 구현한 메소드 abc();");
	}
	
	
}

//2.약식표현
interface B { 
	int a = 3;	//public static final 이 생략
	void abc ();	//public atstract 가 생략
	
}

class Bb implements B {
	@Override
	public void abc() {
		System.out.println("B인터페이스를 구현한 메소드 abc()");
	}
}

public class InterFace01 {

	public static void main(String[] args) {
		/*
		 	인터페이스 : 내부와 외부를 연결시켜주는 접점.
		 	API (Application Program Interface):api를 통해서 벡엔드의 다양한 서비스를 받게 된다.
		 	
		 	-모든 필드 , 메소드는 public 접근 제어가 작동된다.
		 	-모든 필드는 public static final이 생략되어 있다. -> interface의 필드의 값은 수정이 불가능
		 	-모든 메소드는 public atstract 가 생략되어있다.
		 		->예외) default , static 메소드인경우는 제외
		 	-인터페이스는 객체화 할수 없다 / 타입으로는 지정 가능하다.
		 	-인터페이스를 구현한 클래스는 여러 인터페이스를 구현가능하다.
		 	-클래스는 단 하나의 부모만 상속 가능하다. ->extends 다중상속이 불가능하다.
		 	-클래스는 여러개의 인터페이스를 구현할수 있다.->implements (다중 상속이 가능하다.)
		 	-유지보수를 쉽게 하기 위해서 인터페이스를 사용한다.
		 	-인터페이스에 선언된 메소드를 오버라이딩해서 구현하도록 만듬.
		 	-인터페이스를 구현한 클래스는 오버라이딩된 메소드를 수정할수 없다.
		 	
		 */
		
		//1.인터페이스는 객체화 할수 없다.
//		A a = new A (); -> 인터페이스는 객체화 불가능 (생성자 존재 x)
		
		//2.인터페이스를 구현한 객체를 객체화해서 타입으로 지정
		 A a1 = new Aa ();
		 a1.abc();
		 System.out.println();
		 
		 //1.인터페이스는 객체화 할수 없다 (약식)
//		 B b1 = new B (); 
		 //2.인터페이스를 구현한 클래스를 객체화 해서 타입으로 지정은 가능하다.
		 B b1 = new Bb () ;
		 b1.abc();
		 System.out.println(b1.a);
//		 b2.a = 10 ; 		//필드의 값은 수정할수 없다 -> public static final (상수)
		
		
		
		
		
		
	}

}
