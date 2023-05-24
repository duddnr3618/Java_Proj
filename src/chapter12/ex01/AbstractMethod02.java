package chapter12.ex01;

abstract class Animal {
	//구현부가 없이 선언만 된 메소드 : 추상메소드
	abstract void eat();
	abstract void run();
	abstract void cry();
	
	
}

class Tiger extends Animal {//콘크리트 클래스

	@Override
	void eat() {
		System.out.println("호랑이는 고기를 먹는다.");
	}

	@Override
	void run() {
		System.out.println("호랑이는 달린다.");
	}

	@Override
	void cry() {
		System.out.println("호랑이는 운다.");
	}	
}

abstract class Lion extends Animal {	//추상클래스 : 부모와 추상메소드를 일부만 구현한 경우

	@Override
	void eat() {
		System.out.println("사자는 고기를 먹는다.");
	}

	@Override
	void run() {
		System.out.println("사자는 달린다.");
	}
		
}

class LionChild extends Lion {	//콘크리트 클레스

	@Override
	void cry() {
		System.out.println("아기사자는 운다.");
	}
	
}

public class AbstractMethod02 {

	public static void main(String[] args) {
		
		//추상클래스는 객체화 할수 없다.
//		Animai a1 = new Animal ();
		
		//자식클래스를 객체화 해서 타입으로 지정은 가능하다.
		Animal a2 = new Tiger (); 
//		Animal a3 = new Lion (); 	//Lion은 추상클래스라 객체화 불가능 
		Animal a4 = new LionChild (); 
		
		//오버라이딩된 메소드 호출
		a2.run();
		a2.eat();
		a2.cry();
		System.out.println();
		
		a4.run();
		a4.eat();
		a4.cry();
		
		

	}

}
