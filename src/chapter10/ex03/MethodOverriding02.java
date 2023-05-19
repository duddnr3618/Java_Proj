package chapter10.ex03;

class Animal {
	
	void cry() {
		System.out.println("모든 동물은 웁니다.");
	}
}

class Tiger extends Animal {
	@Override
	void cry() {
		System.out.println("어흥~!");
	}
}

class Eagle extends Animal {
	@Override
	void cry() {
		System.out.println("키이오~");
	}
}

class Lion extends Animal {
	@Override
	void cry() {
		System.out.println("크앙!");
	}
}

public class MethodOverriding02 {

	public static void main(String[] args) {
		
		//1.Animal을 Animal타입으로 객체화
		Animal a1 = new Animal () ;
		a1.cry();  				//animal클래스의 cry를 호출
		
		//2.자식클래스를 객체화하여 부모타입으로 선언 -> 오버라이딩 된 메소드가 출력 
		Animal a2 = new Tiger ();	
		a2.cry();	//a2.cry() ->Animal을 호출 , 오버라이딩된 메소드가 호출
		
		Animal a3 = new Eagle ();
		a3.cry();	//a3.cry() ->Animal을 호출 , 오버라이딩된 메소드가 호출
		
		Animal a4 = new Lion ();
		a4.cry();	//a4.cry() ->Animal을 호출 , 오버라이딩된 메소드가 호출
		
		
		
		
	}

}
