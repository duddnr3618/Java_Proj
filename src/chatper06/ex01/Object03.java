package chatper06.ex01;

class Student {			//외부의 클레스, 같은 클레스에서 public은 하나만 올수 있다.
	
	//기본 생성자 (생략가능)
	public Student () {}
	
	//필드 선언
	String name;
	int kor ;
	int eng ; 
	int math ;
	
	//메소드 선언 : print 메소드 호출시 메모리에 있는 내용을 출력
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math +"\n");
		
	}
	
	
	
}

public class Object03 {

	public static void main(String[] args) {
	
		//s1 객체생성 : 홍길동 / 국어점수 : 80 , 영어점수 : 90 , 수학점수 : 100
		//s2 객체생성 : 이순신 / 국어점수 : 60 , 영어점수 : 88 , 수학점수 : 70
		//s3 객체생성 : 세종대왕 / 국어점수 : 90 , 영어점수 : 99 , 수학점수 : 88
		//s4 객체생성 : 신사임당 / 국어점수 : 77 , 영어점수 : 88 , 수학점수 : 99
		
		//각 객체의 print() 메소드 호출
		
		//s1객체 생성 : 클레스 -> 객체화(인스턴스)  
		Student s1 = new Student();
		//s1필드의 값 할당.
		s1.name = "홍길동";
		s1.kor = 80;
		s1.eng = 90;
		s1.math = 100;
			
		Student s2 = new Student();
		s1.name = "이순신";
		s2.kor = 60;
		s2.eng = 88;
		s2.math = 70;
		
		Student s3 = new Student();
		s3.name = "세종대왕";
		s3.kor = 90;
		s3.eng = 99;
		s3.math =88;
		
		Student s4 = new Student();
		s4.name = "신사임당";
		s4.kor = 77;
		s4.eng = 88;
		s4.math = 99;
		
		//필드의 값 출력.
		s1.print();
		s2.print();
		s3.print();
		s4.print();
		
		
		
		
		
	
	}

}
