package chapter12.ex01;

abstract class A {		//추상 메소드가 하나라도 존재하면 클래스를 추상 클래스로 바꿔주어야 한다.
	
	//인스턴스 필드	-> 객체화 하여 사용 가능 (Heap에 저장)
	int a = 10;
	int b = 20;	
	
	//일반 메소드
	void print () {
		
	}
	
	//추상 메소드 => {} 구현부가 존재하지 않는 메소드
	abstract void run() ;
	
}

class Cat extends A {	//추상클래스를 상속하는 클래스는 추상클래스에서 구현하는 메소드를 메소드를 구현해야한다.
					//->콘크리트 클래스 : 추상클래스에서 선언해 놓은 추상메소드를 구현하는 클래스
	
	@Override	//A클래스의 추상메소드를 오버라이딩 하여 구현
	void run() {
		
		System.out.println("고양이는 달린다.");
	}
}

class Dog extends A {
	@Override
	void run() {
		
		System.out.println("개는 달립니다.");
	}
}

class Eagle extends A {
	@Override
	void run() {

		System.out.println("독수리는 날아다닌다.");
	}
}

public class AbstractMethod {
	
	public static void main(String[] args) {
		
		/*
	 	추상 메소드 
	 		-구현부가 { }  존재하지 않는 메소드 , 선언만 되어 있는 메소드
	 		-abstract void abc() ;
	 		-추상 메소드가 클래스 블락에 1개라도 존재하면 반드시 그 클래스는 추상클래스가 되어야한다.
	 			-> abstract class A {  }
	 		-자식클래스에서 추상클래스의 추상메소드를 오버라이딩하여 메소드를 구현해야한다.
	 		-추상 클래스는 객체생성이 불가능하다.
	 			->자식클래스를 객체화 하여 타입으로 적용은 가능하다.
	 		-프로잭트 설계시 메소드 이름을 프로그래머가 함부로 바꾸지 못하도록 할수 있다.
	 		-자식클래스에서 구현하는 메소드를 오버라이딩 해서 구현부를 만듬.
	 		-메소드 이름을 함부로 변경이 불가능하다.	
	 		-유지보수를 쉽게하는 프로그램을 만들때 사용
	 */
		
		//추상클래스 : 추상메소드를 포함하는 클래스(하나라도 존재하면 추상 클래스가 된다) ->객체화 불가
//		A a = new A () ;	->객체화 불가능
		
		//추상클래스는 타입으로 지정은 가능 : 자식을 객체화해서 부모타입으로 지정
		A cat1 = new Cat () ;
		A dog1 = new Dog () ;
		A eagle1 = new Eagle () ;
		
		//오버라이딩된 메소드 호출 : 부모의 추상메소드를 호출하면 자식클래스에서 오버라이딩된 메소드가 출력
		cat1.run();
		dog1.run();
		eagle1.run();
		System.out.println();
		
		//배열에 넣고 출력
		A [] arr =new A [] {cat1,dog1,eagle1};
		
		//for문을 사용해서 배열의 각방의 내용을 출력
		for (int i =0 ; i < arr.length ; i++) {
			arr[i].run();
		}
		System.out.println();
		
		//Enhance for문 
		for (A k : arr) {
			k.run();
		}
		
		
		
	}
	
	
}
