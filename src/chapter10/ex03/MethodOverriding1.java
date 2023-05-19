package chapter10.ex03;

class A {
	void print () {	//인스턴스 메소드
		System.out.println("A 클래스의 print() ");
		
	}
}

class B extends A { //B클래스는 A를 상속받는다.
	
	@Override
	void print() {		//메소드가 부모타입과 일치해야한다. (int x ,....) , 메소드명,시그니처등 일치해야한다.
		System.out.println("B클래스의 print()");
	}
}

class C extends A {

	@Override
	void print() {
		System.out.println("C클래스의 print()");
	}
}


public class MethodOverriding1 {

	public static void main(String[] args) {
	
		/*
		 	메소드 오버로딩(Method Overloading) : 상속과는 상관없음
		 	-메소드이름은 동일 , 시그니처에 따라서 다른메소드를 식별해서 작동
		 	-시그니처 : 메소드를 식별하는 식별자.(리턴타입x) ,아규먼트의 갯수,아규먼트의 자료형
		 	
		 	메소드 오버라이딩 (Method overriding) : 반드시 상속관계에서만 적용
			-부모메소드의 실행부를 재정의해서 사용
			-인스턴스 메소드일 경우에만 오버라이딩이 가능하다.
			-필드는 오버라이딩이 되지 않는다.
			-스테틱 메소드도 오버라이딩 되지 않는다.
			- @overrid 어노테이션 : 부모클래스의 메소드를 오버라이딩 한다고 선언하는 선언자.
				-> 부모클래스의 메소드의 리턴타입,메소드명,시그니처가 정확히 일치해야한다.
			
		 */
		//A클래스를 객체화 해서 A타입으로 지정.
		A a = new A () ;	// a : A타입만 존재.
		a.print();
		
		System.out.println("=======================");
		
		B b = new B () ;
		b.print();		//상속관계에 의해서 A클래스의 print가 출력
		
		System.out.println("=========================");
		
		C c = new C ();
		c.print();
		
		System.out.println("***자식 객체를 생성하면서 부모타입으로 지정한 경우 : 오버라이딩된 메소드가 출력***");
		
		A ab = new B ();		//B를 객체화해서 A타입으로 지정 -> 오버라이딩된 B타입이 print가 찍힌다.
		ab.print();					
		
		A ac = new C ();		//C타입의 클래스가 출력된다.
		ac.print();
		
		
	}
}
