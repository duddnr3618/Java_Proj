package chapter10.ex06;

class Aaa {
	//기본생성자
	Aaa () {
		System.out.println("Aaa 생성자");
	}
	
}

class Bbb extends Aaa {
	Bbb() {
		//super (); -> 생략
		System.out.println("Bbb 생성자");
	}
	
	
}

class Ccc {
	
	Ccc (int a) {
		System.out.println("C 생성자 호출");
		System.out.println(a);
		
	}
	
}

class Ddd extends Ccc {
		Ddd () {
			super (3) ;
			System.out.println("D 생성자 호출");
		}
	
	
}

public class SuperMethod {

	public static void main(String[] args) {
		/*
		 	super() : 생성자 내부에서 사용 , 생성자 첫번째 라인에 와야함 , 부모(super)클래스의 다른 생성자를 호출가능
		 */
		
		//자식객체 생성시 부모의 기본생성자를 먼저 호출후 자신의 객체가 생성됨.
		Bbb bbb1 = new Bbb ();
		
		System.out.println("==========================");
		//자식 객체 생성시 부모 객체를 먼저 호출
		Ddd ddd1 = new Ddd ();
		
	}

}
