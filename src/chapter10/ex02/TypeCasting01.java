package chapter10.ex02;

class Animal {	//부모 클래스
	String name;
	int age;
	
	void eat () {
		System.out.println("모든 동물은 먹는다.");
	}
}

//자식 클래스 : Tiger / Lion
class Tiger extends Animal {
	
	String tigerCry;
	
	void tigerRun () {
		System.out.println("호랑이는 달린다.");
	}
	
}

class Lion extends Animal {
	
	String LionCry;
	
	void LionRun () {
		System.out.println("사자는 달린다.");
	}
	
}

//자식의 자식클래스
class LionChild extends Lion {
	
	String LionChildCry;
	
	void LionChildRun () {
		System.out.println("새끼사자는 엉금엉금 뛰어다닌다.");
	}
	
	
}

public class TypeCasting01 {
	public static void main(String[] args) {
		/*
		 	객체의 타입캐스팅(변환) : object type casting
		 	-업 캐스팅	: 자식 타입 ->부모타입으로 변환 (명시하지 않아도 자동으로 변환)
		 		->객체를 배열 / 컬렉션에 저장하기 위해서 동일한 타입으로 배열,컬렉션에 저장하기 위해 사용
		 	-다운캐스팅 : 부모 타입 ->자식타입으로 변환 (명시해서 변환)
				->instanceof를 사용해서 자식타입이 존재하는지 확인후 다운캐스팅.
				->자식타입이 존재하지 않을 경우 실행시 오류발생. 
		 
		 */
		
		//1.Animal 객체화
		Animal a1 = new Animal ();
		
		//a1은 Animal타입만 존재 : Animal플랫의 필드나 메소드만 접근
			//a1 : Tiger Lion LionChild 타입을 가지고 있지 않다.
		a1.age = 10;
		a1.name = "동물";
		a1.eat();
		
		//2.Tiger
		Tiger t1 = new Tiger () ;	//t1은 Tiger,Animal 타입을 가진다.
		t1.tigerCry = "어흥"; 		//Tiger
		t1.tigerRun(); 				//Tiger
		
		t1.name = "호랑이";			//Animal피드
		t1.age = 20;				//Animal피드
		t1.eat();					//Animal 메소드
		
		//업캐스팅	: 자식 타입을 부모타입으로 변환 : t1 (Animal(부모) , Tiger(자식))
		Animal a2 = t1;
		
		//a2는 Animal타입으로 업캐스팅 : Animal의 필드/ 메소드만 접근
		System.out.println(a2.name);
		System.out.println(a2.age);
//		System.out.println(a2.tigercry); 	//Tiger의 필드 / 메소드는 접근 안됨
		
		
		System.out.println("======================================================");
		
		//a2는  Animal타입으로 정의 : Tiger / Animal
		
		//다운캐스팅 : 부모->자식변환 ->명시해서 변환 (instanceof)
		Tiger tt1 = (Tiger)a2;
		
		//tt1는 Tiger타입으로 다운캐스팅 : Tiger / Animal ->부모/자식 필드/메소드를 모두 사용가능
		System.out.println(tt1.name);			//animal타입
		System.out.println(tt1.age);			//animal타입
		System.out.println(tt1.tigerCry);		//Tiger타입
		
		System.out.println("===================================");
		
		//3.Lion객체를 생성 : l1 -> 2개 타입(Lion/Animal)
		//자식클래스를 객체화 시키면 부모 클래스의 필드와 메소드가 사용가능.
		Lion l1 = new Lion ();
		//Lion,Animal의 필드와 메소드 사용가능
		
		//업캐스티팅 : Lion타입 (l1) -> Animal타입 (aa1)
		Animal aa1 =l1;	
		//aa1는 Animal의 필드와 메소드만 접근 가능 ,Animal타입과 Lion타입은 가지고 있다.
		
		//다운캐스팅 : Animal (부모-aa1) -> Lion (자식-ll2)
		Lion ll2 = (Lion)aa1;
		//모두다 접근 가능.
		
		System.out.println("============= Instanceof ============");
		//객체 내부의 해당 타입이 존재하면 true / 존재하지 않으면 false
		System.out.println(ll2 instanceof Animal);	//true
		System.out.println(ll2 instanceof Lion);	//true
		
		System.out.println(a1 instanceof Tiger);	//false
		System.out.println(a1 instanceof Animal);	//true
		
		//a1객체 : Animal타입
		
		//객체내부에 해당타입이 존재하지 않는 경우 실행시 오류(컴파일 단계에서는 오류가 발생하지 않는다)
		if (a1 instanceof Tiger) {		//false : a1객체는 tiger타입이 존재하지 않는다.
		Tiger ttt1 = (Tiger) a1;		
		}else {
			System.out.println("해당객체는 Tiger타입이 존재하지 않습니다.");
		}
		
//		Tiger tt22 = (Tiger) a1 ;
		
		//4.LionChild 객체화
		LionChild lc1 = new LionChild ();
		
		lc1.age = 30 ; //Animal
		lc1.LionCry = "어흥"; //Lion
		lc1.LionChildCry = "응애"; // LionChild
		
		
		System.out.println("===========================================");
		
		//LionChild -> Animal타입으로 업캐스팅
		Animal a5 = lc1;		//a5는 Animal의 필드/메소드만 접근
		
		System.out.println(a5 instanceof Animal);
		System.out.println(a5 instanceof Lion);
		System.out.println(a5 instanceof LionChild);
		
		Lion ll7 = null;		//객체의 초기화 null
		//다운캐스팅 : Animal -> Lion 
		if (a5 instanceof Lion) {
			ll7 = (Lion) a5;
			System.out.println("a5는 Lion으로 캐스팅");
		}else {
			System.out.println("해당객체는 Lion으로 다운캐스팅 할수 없습니다.");
		}
		
		//ll7 : Lion / Animal만 접근 가능 , LionChild/Lion/Animal 을 가지고 있다.
		ll7.LionCry = "크앙 크앙 크앙 ";	//Lion
		ll7.age = 5;
		
		// LionChild로 다운캐스팅
		LionChild lc9 = (LionChild) ll7;
		lc9.age = 40;
		
		
		
	}

}
