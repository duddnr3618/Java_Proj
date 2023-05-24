package chapter12.ex01;

abstract class Car {	//추상 클래스 : 트럭 , 자가용 , 굴삭기 , 봉고 ...
	
	abstract void run ();
	abstract void eat ();	//경유 , 휘발유 , LPG
	
}
class T extends Car {

	@Override
	void run() {
		System.out.println("트럭은 달린다.");
	}

	@Override
	void eat() {
		System.out.println("트럭은 경유를 먹습니다.");
	}
	
}
class Tesla extends Car {

	@Override
	void run() {
		System.out.println("자가용은 달린다.");
	}

	@Override
	void eat() {
		System.out.println("자가용은 휘발유를 먹습니다.");
	}
	
}

class P extends Car {
	@Override
	void run() {
		System.out.println("굴삭기은 달린다.");
	}

	@Override
	void eat() {
		System.out.println("굴삭기은 경유를 먹습니다.");
	}
}

class B extends Car {
	@Override
	void run() {
		System.out.println("봉고차는 달린다.");
	}

	@Override
	void eat() {
		System.out.println("봉고차는 LPG를 먹습니다.");
	}
}


public class Ex01 {

	public static void main(String[] args) {
		
		Car c1 = new T ();
		Car c2 = new Tesla ();
		Car c3 = new P ();
		Car c4 = new B ();

		c1.run();
		c1.eat();
		System.out.println();
		
		c2.run();
		c2.eat();
		System.out.println();
		
		c3.run();
		c3.eat();
		System.out.println();
		
		c4.run();
		c4.eat();
		
	}

}
