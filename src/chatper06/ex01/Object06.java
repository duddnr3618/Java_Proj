package chatper06.ex01;
class Student2{
	//기본생성자
	public Student2 () {}
	//필드
	String sName ;		//학생이름
	int sAge ;			//핵생나이
	String sAddr;		//학생주소
	String sEmail;		//학생이메일
	
	//메소드 : 필드의 내용을 출력하는 메소드
	public void print () {
	System.out.println("이름 : " + sName);	
	System.out.println("나이 : " + sAge);	
	System.out.println("주소 : " + sAddr);	
	System.out.println("이메일 : " + sEmail);	
	}
}


public class Object06 {
public static void main(String[] args) {
	//kim 객체	: 김길동 / 20 / 서울 / aaa@aaa.com
	//lee 객체	: 이순신 / 30 / 부산 / bbb@bbb.com
	//hong 객체	: 홍길동 / 45 / 광주 / ccc@ccc.com
	
	//각 객체의 필드의 값을 입력후 배열에 넣어서 지정후 끄집어 내어서 다시 출력.
	//객체 생성 후 각 필드의 값을 입력.
	Student2 kim = new Student2();
	kim.sName = "김길동";
	kim.sAge = 20;
	kim.sAddr = "서울";
	kim.sEmail = "aaa@aaa.com";
	
	Student2 lee = new Student2();
	lee.sName = "이순신";
	lee.sAge = 30;
	lee.sAddr = "부산";
	lee.sEmail = "bbb@bbb.com";
	
	Student2 hong = new Student2();
	hong.sName = "홍길동";
	hong.sAge = 45;
	hong.sAddr = "광주";
	hong.sEmail = "ccc@ccc.com";
	
	Student2 [] arr1 = new Student2 [3];

	//배열안에 객체 선언 및 바로 배열에 값을 할당.
	arr1[0] = kim;
	arr1[1] = lee;
	arr1[2] = hong;
	System.out.println(arr1[0]);  //객체의 heap주소
	System.out.println(arr1[1]);  //객체의 heap주소
	System.out.println(arr1[2]);  //객체의 heap주소
	System.out.println();
	
	System.out.println("=============================================");
	System.out.println();
	
	//배열 각방에 저장된 객체를 끄집어 낸다.
	Student2 s1 = arr1[0];
	s1.print();
	System.out.println();

	Student2 s2 = arr1[1];
	s2.print();
	System.out.println();
	
	Student2 s3 = arr1[2];
	s3.print();
	System.out.println();
	
	

	
}
}
