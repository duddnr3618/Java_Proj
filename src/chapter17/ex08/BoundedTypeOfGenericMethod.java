package chapter17.ex08;


class A {		//일반클래스의 제너릭 메소드 생성
		
	//Number 클래스 : 정수(byte , short , int long)나 실수(float , double)를 처리하는 부모 클래스
	// T : Byte , Short , Integer , Long , Flaot , Double 타입이 올수 있다.
	
	public <T  extends Number> void method1 (T t) {	//정수나 실수만 처리하는 자료형만 올 수 있다.
		System.out.println(t.intValue());	//t.intValue() : Number타입의 메소드
			
	}
}

//인터페이스 : 제너릭 타입 제한시 인터페이스 일 때 다중 제한이 가능하다. -> 클래스 일 때는 하나만 처리 가능하다.
	// <T extends IF1 & IF2 & IF3 > 
	// 인터페이스 제한을 둘 시 인터페이스를 구현한 하위의 모든 클래스가 타입으로 지정할 수 있다. 
interface IF1  {
	void print ();		//public abstract 가 생략되어있다. -> 자식클래스에서 구현 클래스 생성후 사용 / 익명클래스를 사용
}
class Aa implements IF1 {
	@Override
	public void print() {
		System.out.println("Aa 구현된 메소드 호출");
	}
}
class Aaa extends Aa {
	@Override
	public void print() {
		System.out.println("Aaa 구현돤 매소드 호출 - 오버라이딩.");
	}
	public void print2 () {
		System.out.println("Aa의 자식 Aaa의 print2()메소드 ");
	}
}

interface IF2 {
	void eat ();
}

interface IF3 {
	void run ();
}

//제너릭 클래스에서 인터페이스를 사용해서 타입을 제한 -> 여러 인터페이스를 적용이 가능하다.
class E < T extends IF1 & IF2 & IF3> {		//T : IF1(자식 : Aa , Aaa) , IF2 , IF3 
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

//제너릭 메소드에서 인터페이스 타입 사용
class B { 
	public < T extends IF1 > void method1 (T t) {
		t.print();
	}
}





public class BoundedTypeOfGenericMethod {

	public static void main(String[] args) {

		/*
		 	제너릭 메소드에서 타입 제한 : 
		 		-타입 제한을 두지 않을때 : 모든 타입이 매개변수 인자로 오기 때문에 object의 메소드만 사용 가능
		 		-타입을 제한을 둔 경우 : 제한을 둔 클래스의 메소드만 사용 가능하다.
		 		
		 */
		
		A a = new A () ; 				//일반 클래스
		a.<Double> method1 (3.14);
		a.<Integer> method1 (99);
//		a.<String> method1 ("안녕"); -> 오류발생 ~
		
		
		System.out.println("===============");
		B b1 = new B ();
//		b1.<IF1> method1();		//인터페이스는 객체를 생성할 수 없다. ->자식을 객체화해서 타입으로 둘수는 있다.
		
		//제너릭 메소드 호출
		b1.<IF1> method1 (new Aa()); 		//자식 클래스를 객체화 해서 인터페이스 타입으로 오버라이딩.
		b1.<IF1> method1 (new Aaa ());		
		
		
		//제너릭 메소드 호출	 : 익명클래스를 사용해서 -> 인터페이스는 객체화 할수 없다 -> 자식클래스를 객체화하여 타입으로 지정은 가능
		//인터페이스 메소드 호출시 자식의 오버라이된 메소드 호출
		b1.<IF1> method1 (new IF1 () {

			@Override
			public void print() {
				System.out.println("오버라이딩된 익명 클래스");
			}
		});

		b1.<IF1> method1 (new IF1 () {
			@Override
			public void print() {
				System.out.println("익명 클래스2");
			}
		});
		
		b1.<Aa> method1 (new Aa () );
		b1.<Aaa> method1 (new Aaa ());
		
	}

}
