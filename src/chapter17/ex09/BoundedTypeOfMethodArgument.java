package chapter17.ex09;

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

//상품을 저장하는 제너릭 클래스 생성
class Goods <T> { 	// T : 모든 타입이 올수있다. Wapper class [8] , 참조자료형[무한대]
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

//메소드 아규먼트로 제너릭 타입의 제한
class Test {
	void method1 (Goods <A> g) {}	//case1 : A타입만 가능 -> 자식 클래스는 적용이 되지 않는다.
	void method2 (Goods <?> g) {}	//case2 : ? : 모든 타입이 가능.
	void method3 (Goods <? extends B> g) {} //case 3 : B,C,D타입이 가능
	void method4 (Goods <? super  B> g) {} //case 4 : A,B타입이 가능.
	
}

public class BoundedTypeOfMethodArgument {

	public static void main(String[] args) {
		/*
		 	제너릭 클래스도 아니고 제너릭 메소드도 아니지만 
		 	일반 메소드의 아규먼트로 들어오는 타입 제한
		 */
		
		//Test 객체생성
		Test t = new  Test () ;
		
		//case 1 메소드 호출
		t.method1(new Goods <A> ());
//		t.method1(new Goods <B> ());
//		t.method1(new Goods <C> ());	-> 오류발생 : A객체만 가능하다.
		
		//case 2 메소드 호출
		t.method2(new Goods <A> ());
		t.method2(new Goods <B> ());
		t.method2(new Goods <C> ());
		t.method2(new Goods <D> ()); 
		
		//case 3 메소드 호출
//		t.method3(new Goods <A> ());	-> 오류발생
		t.method3(new Goods <B> ());
		t.method3(new Goods <C> ());
		t.method3(new Goods <D> ());
		
		//case 4 메소드 호출
		t.method4(new Goods <A>());
		t.method4(new Goods <B>());
//		t.method4(new Goods <C>());		->오류발생
//		t.method4(new Goods <D>());		->오류발생
	
		
	}

}
