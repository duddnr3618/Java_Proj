package chatper08.ex01;
	//클래스 외부 구성요소 블락
import chatper08.ex02.Student;

class A {		//class A 는 접근제어자가 디폴트이므로 외부 패키지에서는 접근이 안된다.
	
	//필드에서 선언된 접근제어자
	public int a;
	protected int b;
	int c;		//default : 명시해서 사용되지 않고 생략시 디폴트 접근제어자가 생략되있다.
	private int d;
	
	//메소드에 선언된 접근제어자
	public void a () {		//public 접근제어자 : 외부패키지에서 접근 가능.
		System.out.println("a 메소드 출력");
	}
	protected void b () {	//protected 접근제어자 : 상속관계일때만 외부패키지에서 접근 가능.
		System.out.println("b 메소드 출력");
	}
	void c () {				//default 접근제어자 : 같은 패키지내에서만 접근이 가능.
		System.out.println("c 메소드 출력");
	}
	private void d () {		//private 접근제어자 : 동일한 클래스에서만 접근이 가능.
		System.out.println("d 메소드 출력");
	}
}


public class Package {
	//클래스 내부 구성요소 블락

	public static void main(String[] args) {
		/*
		 	클래스 내부 구성요소
		 	1.생성자
		 	2.필드
		 	3.메소드
		 	4.이너클레스(클래스 내부의 클래스)
		 	
		 	클래스 외부 구성요소
		 	1.패키지 :
		 	 		-클래스(파일)를 조직화
		 	 		-같은 패키지에 동일한 클래스는 올수 없다.
		 		
		 	2.임포트(Import) :
		 			-동일한 패키지에 존재하지 않는 클래스는 임포트를 사용해서 불러들어야한다. 
		 			-외부의 클래스는 반드시 public class이 와야 불러들일 수 있다.
		 	3.외부클래스 
		 			-클레스 외부에 생성된 클래스
		 			-public 클래스는 반드시 하나만 와야한다. -> public클래스가 아니면 외부에서 접근이 불가.
		 			
		 			#접근제어자 : 정보를 보호하기 위해서 클래스 이름앞,필드이름앞,메소드이름앞에 붙는 제어자.
		 					-변수 이름앞에는 붙지 않는다 -> 메소드 내부에서 선언된 , 제어문 내부에서 선언된
		 					1.public	: 외부패키지에서 접근이 가능하도록 허용해준다.
		 					2.protected	: 상속관계에 있을때 외부패키지에서 접근이 허용
		 					3.default	: 같은패키지 안에서만 접근 가능. 다른패키지에서 접근이 불가.
		 					4.private	: 같은 패키지가 아니라 같은 클래스에서만 접근이 가능.
		 					
		 					-클래스 이름 앞 (public , default)만 사용 가능
		 					-필드/메소드 이름 앞 : public , protected , default , private 사용가능
		 					-정보의 은닉 , 캡술화 : 보안..
		 */

		Car c1 = new Car();				//같은 패키지에 존재하는 클래스 : import없이 바로 사용 가능
		
		//외부의 클래스 import 할때는 해당 클래스의 접ㄱ근 지정자가 public , public
		
		//import후 외부 패키지를 불러들이수 있다.
		Student s1 = new Student ();	//다른 패키지에 존재하는 클래스 : import를 사용해서 사용가능
		
		//import없이 바로 접근 : 클래스의 전체 이름으로 접근  -> 패키지명, 클래스명
		chatper08.ex02.Student s2 = new chatper08.ex02.Student();
		s1.stuName = " 홍 길 동 " ;
	}

}
