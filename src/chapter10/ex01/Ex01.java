package chapter10.ex01;

//부모클래스 (animal):동물
class Animal {
	String name;
	int age;
	String color;
	
	void eat () {
		System.out.println("Animal - 모든 동물은 먹는다.");
	}
	
	void sleep () {
		System.out.println("Animal - 모든 동물은 잠을 잔다.");
	}
}


//지식클래스 (Tiger ,Eagle ,Lion) -> 추가적으로 필드,메소드 정의 (sound , run)

class Tiger extends Animal {
	String sound;
	void TigerRun () {
		System.out.println("호랑이는 성큼성큼 뛰어다닌다.");
	}
	
}

class Eagle extends Animal {
	String sound;
	void EagleRun () {
		System.out.println("독수리는 훨훨 날아다닌다.");
	}
	
}

class Lion extends Animal {
	String sound;
	void LionRun () {
		System.out.println("사자는 폴짝폴짝 뛰어다닌다.");
	}
	
}

//자식-자식클래스 (LionChild) 
class Lionchild extends Lion {
	String LionBabysound;
	void LionBabyRun () {
		System.out.println("사자새끼는 사뿐싸분 뛰어간다.");
	}
	
}


public class Ex01 {

	public static void main(String[] args) {

		Tiger t = new Tiger () ;
		t.name = "호랑이";
		t.age = 10;
		t.color = "호피무늬색";
		t.sound = "어흥~";
		
		t.eat();
		t.sleep();
		t.TigerRun();
		
		
		Eagle e = new Eagle () ;
		e.name = "독수리";
		e.age = 5;
		e.color = "갈색";
		e.sound = "키이오~";
		
		e.eat();
		e.sleep();
		e.EagleRun();
		
		Lion l = new Lion () ;
		l.name = "사자";
		l.age = 15;
		l.color = "주황색";
		l.sound = "커흥~";
		
		l.eat();
		l.sleep();
		l.LionRun();
		
		Lionchild a = new Lionchild ();
		a.name = "사자새끼";
		a.age = 1;
		a.color = "갈색";
		a.LionBabysound = "카앙~";
		
		
		a.eat();
		a.sleep();
		a.LionBabyRun();
	}

}
