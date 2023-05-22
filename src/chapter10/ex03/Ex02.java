package chapter10.ex03;

//부모 클래스
class Animals {
	
	//인스턴스 메소드 : 오버라이딩은 인스턴스 메소드만 오버라이딩된다. ( 인스턴스 메소드 오버라이딩)
	//필드는 오버라이딩 되지 않는다.
	void run() {
		System.out.println("Animals 클래스의 run() : 모든 동물은 달립니다.");
	}
}

class Tigers extends Animals {
	@Override
	void run() {
		System.out.println("호랑이는 폴짝 폴짝 달립니다.");
	}
	
}

class Eagles extends Animals {
	@Override
	void run() {
		System.out.println("독수리는 훨훨 납니다.");
	}
	
}

class Cat extends Animals {
	@Override
	void run() {
		System.out.println("고양이는 사뿐사뿐 뜁니다.");
	}
	
}

class CatChild extends Animals {
	@Override
	void run() {
		System.out.println("고양이새끼는 달리지 못합니다.");
	}
}
public class Ex02 {

	public static void main(String[] args) {
		
		//자식클래스를 객체화 해서 부모타입으로 지정후 메소드 호출시 자식에서 오버라이딩된 메소드를 출력
		
		Animals a1 = new Animals () ;
		Animals t1 = new Tigers ();
		Animals e1 = new Eagles ();
		Animals c1 = new Cat ();
		Animals cs1 = new CatChild ();
		
		a1.run();
		t1.run();
		e1.run();
		c1.run();
		cs1.run();
		
		System.out.println("==================배열에 저장후 한번에 출력=========");
		//배열에 저장후 한번애 출력
		Animals [] arr1 = new Animals [] {t1,e1,c1,cs1};
		for (int i = 0  ; i< arr1.length ; i++)  {
			arr1 [i].run();
		}
		
		
		System.out.println("======향상된(Enhanced) for문 ===========");
		for (Animals  k : arr1) {
			k.run();
		}
		
		
	}

}
