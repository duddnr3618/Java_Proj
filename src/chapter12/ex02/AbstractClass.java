package chapter12.ex02;

//1.콘크리트 클래스 생성후 사용
abstract class A {
	abstract void cry () ;
	
}

class B extends A {
	@Override
	void cry() {		//구현된 메소드 출력
		System.out.println("구현된 메소드 출력");
		
	}
	
}

abstract class C {
	abstract void cry ();
	
}

abstract class D {
	abstract void run();
	abstract void eat();
}


public class AbstractClass {

	public static void main(String[] args) {
		
		/*
		 	추상 클래스 (Abstract Class )
		 	-추상 메소드를 포함하는 클래스 abstract void abc();
		 	-추상클래스는 객체화 할수 없다 . 자식을 객체화 해서 타입으로 지정은 가능하다.
		 	-추상 클래스 작동방법은 2가지
		 		->1.자식 클래스에서 상속을 통해서 추상 메소드를 구현한 클래스를 만들고 (콘크리트 클래스),
		 		자식클래스를 객체화 해서 사용
		 		->2.콘크리트 클래스 생성 없이 익명클래스를 만들어 사용
		 		:한번 사용 하고 버리는 경우 (안드로이드 개발시 이벤트 처리할때 많이 사용)
		 */
		//1.구현 클래스를 만들고 사용하는 방법 (콘크래트 클래스를 객체화 해서 타입을 추상 클래스로 지정후 메소드 호출)
		A a1 = new B();
		a1.cry();
		
		//2.익명클래스를 생성해서 사용하는방법
		C c1 = new C () {
			@Override
			void cry() {
				System.out.println("C클래스의 구현된 메소드");
				
			}
		};
		c1.cry();
		
		D d1 = new D() {
			@Override
			void run() {
				System.err.println("D클래스의 run메소드 구현");
			}
			@Override
			void eat() {
				System.out.println("D클래스의 eat메소드의 구현");
			}
		};
		d1.run();
		d1.eat();
		
	}

}
