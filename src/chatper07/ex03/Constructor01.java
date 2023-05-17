package chatper07.ex03;

class Student {
	
	//생성자 오버로딩 : 생성자 이름은 동일하고 , 아규먼트로 받는 매개변수의 갯수 , 매개변수의 타입

	//기본생성자 : 다른 생성자가 존재하거나 새로 만들시 기본생성자를 만들어야 한다.
	public Student () {}
	
	//생성자 : 매개변수로 1개 인풋받는 생성자
		//this : 자기자신의 객체
		//매개변수로 들어오는 변수명 , 매개변수로 들어오는 변수를 받는 변수명 , 필드명 ->3가지 이름이 동일한 경우
		//필드명에 this.키워드를넣어야한다.
	public Student (String stuName) {
		this.stuName = stuName ;
	}
	
	//생성자 : 매개변수 2개를 받는 생성자
	public Student(String stuName, String stuAddr) {
		
		this.stuName = stuName;
		this.stuAddr = stuAddr;
	}
	
	//생성자 : 매개변수 3개를 받는 생성자
	public Student(String stuName, String stuAddr, String stuEmail) {
		
		this.stuName = stuName;
		this.stuAddr = stuAddr;
		this.stuEmail = stuEmail;
	}
	
	//생성자 : 매개변수 4개를 받는 생성자
	public Student(String stuName, String stuAddr, String stuEmail, int stuAge) {
		
		this.stuName = stuName;
		this.stuAddr = stuAddr;
		this.stuEmail = stuEmail;
		this.stuAge = stuAge;
	}	
		
	//생성자 : 아규먼트로 인풋 받는 갯수 : 5개
	public Student(String a, String b, String c, int d, double e) 
	{
	stuName = a;
	stuAddr = b;
	stuEmail = c;
	stuAge = d;
	stuWeight = e;
	}
	
	//필드(학생(객체)이라는 속성)

	String stuName;
	String stuAddr;
	String stuEmail;
	int stuAge;
	double stuWeight ;
	
	//메소드(기능)
	
	//객체의 필드의 값을 출력 : object클래스의 toString () 메소드를 재정의
	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuAddr=" + stuAddr + ", stuEmail=" + stuEmail + ", stuAge=" + stuAge
				+ ", stuWeight=" + stuWeight + "]";
	}
	
}

public class Constructor01 {

	public static void main(String[] args) {
		/*
		 	생성자
		 	-객체를 생성할때 필드의 초기값을 설정
		 	-리턴이 없고 객체이름과 동일한 이름을 가진 메소드
		 	-기본생성자 : 기본적으로 생략되어있다.
		 	-새로생성한 생정자(사용자정의 생성자)를 생성
		 	
		 */
		
		//객체생성 : 기본생성자로 객체생성
		Student s1 = new Student ();
		System.out.println(s1);		//객체 자체를 출력시 오버라이딩된 toString()메소드가 작동됨.
		
		//객체생성 : 
		Student s2 = new Student ("홍길동");							//매개변수 1개
		Student s3 = new Student ("리순신","서울");						//매개변수 2개
		Student s4 = new Student ("세종대왕","강남","aaa@aaa.com"); 	//매개변수 3개
		Student s5 = new Student ("신","강북","bbb@bbb.com",10);		//매개변수 4개
		Student s6 = new Student ("갓","한강","ccc@ccc.ccc",20,50.0);	//매개변수 5개

		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
	}

}
