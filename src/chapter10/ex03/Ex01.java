package chapter10.ex03;
//상속 , 메소드 오버라이딩(인스턴스 메소드) , 업.다운캐스팅 , 배열의 객체대입

class Human {	//사람(부모) <->학생,교수,근로자 (자식)
	
	//기본생성자가 생략 되어 있다. Human () {}
	
	//부모 필드 : 상속 받을 자식클래스의 공통으로 사용하는 속성을 정의.
	String name;
	int age;
	
	//메소드 : 인스턴스 메소드
	void eat () {
		System.out.println("Human - 모든 사람은 잠을 잔다.");
	}
	
}

//자식클래스
class Student extends Human {
	//기본생성자가 생략되어있다. -> 상속관계에서는 기본 생성자 내부에 부모클래스의 기본생성자를 호출.
	//Student () {
	// super () ;
	//}
	int stuID ; 	//학생에게만 적용되는 필드
	
	void goToSchool () {
		System.out.println("Student - 모든 학생은 학교를 간다.");
	}
	
	//메소드 오버라이딩 : 부모클래스에서 정의한 메소드를 자식클래스가 재정의해서 사용.
	@Override
	void eat() {
		
		System.out.println("Student - 학생은 식당에서 밥을 먹는다.");
	}

	@Override
	public String toString() {
		return "Student [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}
	
}

class Professor extends Human {

	int ProID;
	
	void goToTech () {
		System.out.println("Professor - 교수는 학생을 가르친다.");
	}
	
	
	@Override
	public String toString() {
		return "Professor [ProID=" + ProID + ", name=" + name + ", age=" + age + "]";
	}

	//메소드 오버라이딩 
	@Override
	void eat() {
		System.out.println("Professor - 교수는 식사를 한다.");
	}
}

class Worker extends Human {
	
	int workerID;
	
	void goToWork () {
		System.out.println("Worker - 근로자는 일 하러 출근한다.");
		
	}
	
	
	@Override
	public String toString() {
		return "Worker [workerID=" + workerID + ", name=" + name + ", age=" + age + "]";
	}


	//메소드 오버라이딩
	@Override
	void eat() {
		System.out.println("Worker - 근로자는 밥을 먹는다.");
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		
		//1.상속에서 부모클래스의 필드와 메소드 상속 확인.
		//Human 클래스를 h1 객체를 생성 -> h1 : Human타입만 내포하고 있음.
		Human h1 = new Human () ;	
		
		//다운캐스팅 오류발생 : 객체를 캐스팅 할 때 명시해야한다.
		//Student ss1 =(Student) h1 ;		//런타임 (실행시)오류발생 -> instanceof를 사용해서 해당타입이 존재하는지 확인.
		System.out.println(h1 instanceof Human); 		//true
		System.out.println(h1 instanceof Student); 		//fasle
 		
		if (h1 instanceof Student) {
			Student ss1 = (Student) h1;
		}else {
			System.out.println("h1에는 Student 타입이 존재하지 않습니다.");
		}
		
		System.out.println("=============================================");
		
		//Student 클래스를 s1객체를 생성
		Student s1 = new Student ();	//s1:Human , Student 타입을 내포 , Student타입으로 지정.
										//-> Human의 필드와 메소드 Student 필드와 메소드를 모두 접근 가능
		s1.name = "홍길동";				
		s1.age = 20;
		s1.stuID = 1234;
		

		Human s2 = new Student ();		//s2:Human , Student 타입을 내포 , Human타입으로 지정.
										//->Human의 필드와 메소드만 접근 가능.
		
		s2.name = "하준숴이";
		s2.age = 30;
		
		
		//s2는 Human / Student타입으로 이동이 가능하다.
		//s2(Human) -> Student : 다운캐스팅(부모 -> 자식)
		System.out.println(s2 instanceof Student); 		//true 
		if (s2 instanceof Student) {
			Student ss2 = (Student) s2;
		}else {
			System.out.println("s2는 Student타입이 존재하지 않습니다.");
		}
		
		Student ss2 = (Student) s2;
		ss2.name = "이순신";
		ss2.age = 15;
		ss2.stuID = 321;
		
		//ss2(업캐스팅) : Student (자식) -> Human (부모) : 명시하지 않아도 자동으로 캐스팅됨
		System.out.println(ss2 instanceof Human); 		//true
		
		Human hh1 = ss2;	//업캐스팅
		
		//자식을 객체화 해서 부모타입으로 지정후 배열 / 컬랙션에 저장후 끄집어 내서 출력함.
		Student s10 = new Student ();		//s10 : Human , Studnet타입이 내포 / Student지정.
		Professor p10 = new Professor ();	//p10 : Human , professor타입이 내포 / Professor로 지정
		Worker w10 = new Worker ();		//w10 : Human , worker타입이 내포 / Worker로 지정
		
		//각 객체의 필드의 값을 입력
		s10.name = "김무개";
		s10.age = 111;
		s10.stuID = 555;
		
		p10.name = "박무개";
		p10.age = 222;
		p10.ProID = 456;
		
		w10.name = "최무개";
		w10.age = 54;
		w10.workerID= 5454;
		
		//객체들을 배열 / 컬렉션 ( ArryList / Vector / Set / Map )에 넣어서 처리
		
		//배열이나 컬렉션에 넣기(저장되기) 위해서는 동일한 타입이여야 한다.
		//s10 : Studnet , p10 : Professor , w10 : Worker ----> 공통된 타입 (Human)
		Human [] arr = new Human [] {s10,p10,w10}; 		//자동으로 업캐스팅 되어서 Human타입으로 지정
		
		//arr[0]		//Human / Student타입
		//arr[1]		//Human / Professor타입
		//arr[2]		//Human / Worker타입
		
		//배열의 각 방의 값을 끄집어 내어서 변수에 재할당.
		Human h20 = arr[0] ;
		Human h21 = arr[1] ;
		Human h22 = arr[2] ;
		
		//배열의 각 방의 값을 끄집어 낼때 다운캐스팅을 바로 하면서 끄집어 낼수 있다.
		Student s20 =(Student) arr[0] ;	//Human -> Student타입으로 다운캐스팅.
		Professor p20 = (Professor) arr[1];	//Human ->Professor타입으로 다운캐스팅
		Worker w20 = (Worker) arr[2];	//Human ->Worker타입으로 다운캐스팅
		
		//각 객체의 필드의 내용 출력
		System.out.println("Student 객체정보 출력 : " + s20);
		System.out.println("Professor 객체정보 출력 : "+ p20);
		System.out.println("Worker 객체정보 출력 : "+ w20);
		
		
		//메소드 오버라이딩 
		
		//Human 객체 생성후 eat() 메소드 호출
		Human h30 = new Human ();
		h30.eat();		//human클래스의 eat();메소드 호출
		
		//Student 객체 생성후 Student타입으로 지정.
		Student s30 = new Student () ;
		s30.eat();			//Student클래스의 eat(); 라는 메소드 호출
		
		Professor p30 = new Professor ();
		Worker w30 = new Worker ();
		
		p30.eat();
		w30.eat();
		
		System.out.println();
		
		System.out.println("=====오버라이딩된 메소드가 출력 =======");
		//자식클래스 생성 하면서 부모클래스로 지정후 오버라이딩된 메소드 호출.
		Human s40 = new Student ();
		Human p40 = new Professor () ;
		Human w40 = new Worker () ;
		
		//Human 클래스의 eat(); 메소드 호출
		s40.eat();	//s40 : Human / Student을 내포 -> Human 클래스의 eat();메소드를 호출시 Student 클래스의 오버라이딩된 eat();이 작동
		p40.eat();	//s40 : Human / Professor을 내포 -> Human 클래스의 eat();메소드를 호출시 Professor 클래스의 오버라이딩된 eat();이 작동
		w40.eat();	//s40 : Human / Worker을 내포 -> Human 클래스의 eat();메소드를 호출시 Worker 클래스의 오버라이딩된 eat();이 작동
		
		//부모의 메소드 호출시 eat (); -> 자식클래스의 오버라이딩 된 메소드가 출력 .
		
	}

}
