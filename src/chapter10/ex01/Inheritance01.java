package chapter10.ex01;

//부모 클래스 : 필드,메소드 -> 자식클래스에서 공통된 특징을 갖는 필드와 메소드를 정의함.
//(Human)
class Human {
	String name; 		//공통된 특징 : 모든사람은 이름을 갖는다.
	int age ;			//공통된 특징 : 모든사람은 나이를 갖는다.
	
	void eat () {		//공통된 기능 : 모든 사람은 먹는다.
		System.out.println("모든 사람은 먹는다");
	}
	
	void sleep () {		//공통된 기능 : 모든 사람은 잠을 잔다.
		System.out.println("모든 사람은 잠을 잔다. ");
	}
	
}




//자식 클래스 -> 부모클래스의 필드와 메소드를 상속 받게 된다 / 추가적으로 그 클래스 만이 가지는 필드와 메소드를 정의해서 사용.
//(Student(학생),Worker(근로자),professor(교수))
class Student extends Human {
	
	String studentID ;
		void goToSchool () {
			System.out.println("학생읜 학교에 갑니다.");		
	}
	
}

class Worker extends Human {
	
	int workerID;
	void goToWork () {
		System.out.println("근로자를 일하러 갑니다.");
	}
}

class Professor extends Human {
	int professorID ;
	void goToTech () {
		System.out.println("교수님은 학생을 가르치러 갑니다.");
	}
	
}


public class Inheritance01 {

	public static void main(String[] args) {
		
		/*
		 	상송 (inheritance) 
		 	: 부모클래스(객체화)의 필드(속성)와 메소드(기능),이너클래스를 자식클래스에서 상속받아 사용
		 		-생성자는 상속되지 않는다.
		 		-중복된 코드를 방지할수 있다.코드가 간결해지고 생상성이 향상됨.
		 		-객체 지향언의 꽃이다.
		 		-디향성 : 부모클래스의 내용을 상속받아서 다양한 형태로 출력이 가능하다.
		 		 -> 동물 (부모클래스) <---- 사람,독수리....
		 		-부모클래스의 필드와 메소드는 자식클래스로 내가려 사용
		 		-배열이나 컬렉션에 담아서 사용 ( 부모클래스의 타입으로 업캐스팅해서 저장)
		 		 ->배열이나 컬렉션에 담긴 내욜을 다운캐스팅해서 상용
		 		-자바는 다중 상속이 지원되지 않는다 . 자식 클래스는 여러부모를 가질수 없다.(하나의 부모클래스만 가진다)
		 						
		 */
		
		Student s1 = new Student ();
		
		//필드
		s1.age=10;					//휴먼클래스
		s1.name = "홍길동";			//휴먼클래스
		s1.studentID = " 1111";		//스튜던트 클래스의 필드
		
		//메소드
		s1.eat();					//휴먼
		s1.sleep();					//휴먼
		s1.goToSchool();			//스튜던트
		
		Worker w1 = new Worker () ;
		
		//필드
		w1.name = "김유신";
		w1.age = 50;
		w1.workerID = 2222;
		
		//메소드
		w1.eat();
		w1.sleep();
		w1.goToWork();
		
		Professor p1 = new Professor ();
		
		//필드
		p1.name = "이순신";
		p1.age = 66;
		p1.professorID = 3333;
		
		//메소드
		p1.eat();
		p1.sleep();
		p1.goToTech();
		
		
		
		
		
	}

}
