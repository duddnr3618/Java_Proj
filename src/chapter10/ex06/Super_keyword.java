package chapter10.ex06;

class A { 
	
	int a;
	
	//다른생성자가 존재하지 않을때 기본생성자가 생략되어있다.
	//자식 클래스를 생성할시 부모클래스의 다른생성자가 존재할 경우 기본생성자를 반드시 명시적으로 만들어야 한다.
	A () {
		
	}
	A (int a) {
		this.a = a;
	}
}

class B extends A {
	
	//기본생성자가 생략되어있음.
	//자식 클래스는 객체화 할때 부모클래스의 생성자를 호출해야한다.
	B () {
		super ();
	}
	
}


public class Super_keyword {

	public static void main(String[] args) {
		/*
		 	this 키워드 : 필드 , 메소드 이름앞에 this키를 사용해서 자신의 객체의 필드나,메소드 호출시 사용됨.
		 	this() 메소드 : 생성자 내부에서 사용됨 , 생성자 첫 라인에 와야함 , 자신의 객체의 다른 생성자를 호출시 사용됨.
		 	
		 	-상속관계에서 부모클래스(Super) 
		 	super 키워드 : 필드나 메소드 앞에 super를 사용해서 부모의 필드나 메소드를 호출할떄 사용
		 	super() 메소드 : 생성자 내부에서 사용됨 , 생성자 첫라인에 와야함 , 부모(super)의 생성자를 호출할때 사용.
		 */
	}

}
