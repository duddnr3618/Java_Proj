package chapter10.ex07;

class A extends Object {	//Object 가 생략되어있다. -> 최상위 클래스
	Integer a;
	String b;
	Double c;
	Boolean d;
	Object e;
	
}

class B extends A {
	
	int a ;
	int b;
	int c;
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}

public class Object_class {
	public static void main(String[] args) {
		/*
		 	
		 	object클래스 : 
		 		-java.lang.object
		 		-java.lang 패키지의 모든 클래스는 import없이 사용할수 있다.
		 		-모든 자바 클래스는 object클래스의 자식이 된다.
		 		-자바의 모든 클래스는 object클래스의 선언된 메소드를 상속받는다.
		 		-toString() 메소드 : 객체 자체를 출력할때 객체의 "패키지주소@Heap의 메모리주소" 
		 			-> 재정의 해서 많이 사용 (객체의 필드에 저장된 값을 출력)
		 		-equals() : 기본적으로 stack메모리 주소 비교 -> 재정의해서 heap의 메모리 값을 비교
		 		
		 */
		
		A a = new A ();
		
		System.out.println(a);
		System.out.println(a.toString());	//Object클래스의.toString()
		
		B b = new B () ;
	}
}
