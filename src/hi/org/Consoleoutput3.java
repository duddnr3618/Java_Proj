package hi.org;

public class Consoleoutput3 {
	public static void main(String[] args) {
		//코드는 메인 메소드에서 내에서 작성해야함.
		
		//변수선언 : java와 javascript는 완전히 별개의 언어이다.
		// <자료형> , <변수명> , <초기값> ;
		
		//문자열 자료형 : String
		String fathername = "홍길동"; 
		String mothername = "홍길순";
		String myname = "홍당무";
		
		//정수형 자료형 : int
		int age = 30;
		//int age2 =77.7;		//정수라는 변수에 실수를 넣어서 오류가 발생
		
		//실수형 자료형 : double
		double weith = 70.5;
		double weith2 = 50; 		//오류발생이 안됨. : 정수->실수 자동 변환
		
		//int age = 50; // <오류발생> age 변수를 새롭게 선언하면 오류가 발생
		
		System.out.println(age);	//30 
		
		age = 60; 		//
		System.out.println(age);	//60
		
		System.out.println("-------------------------------");
		
		//1.println(""); 으로 출력
		//ex.우리 아버님 이름은 홍길동이고 , 우리 어머님 홍길순 입니다.
		//나의 이름은 홍당무이고, 나이는 25살이고 , 몸무게는 70.5 입니다.
		//2.print();
		//3.printf();
		
		age = 25;
		
		System.out.println("--------println으로 출력(문자열과 변수를 +로 연결)------------");
		
		System.out.println("우리 아버님 이름은 " + fathername + " 이고 , 우리 어머님 이름은 " + mothername + "입니다." );
		
		System.out.println("나의 이름은 " + myname + "이고 , 나이는 " + age + "이고 , 몸무게는 " + weith + " 입니다.");
		
		System.out.println("-----------print로 출력하기(문자와 변수를 +로 연결해서 변수 출력)----------");
		
		System.out.print("우리 아버님 이른은 " +fathername+" 이고 , 우리 어머님 이름은 " +mothername+ " 입니다.\n" );
		System.out.print("나의 이름은 " + myname + "이고 , 나이는" + age + "이고 , 몸무게는 "+ weith + "입니다.\n");
		
		
		System.out.println("-----------printf();으로 출력하기(문자열 내에서 콤마 뒤의 값을 불러들여서 출력)--------------");

		System.out.printf("우리 아버지 이름은 %s 이고 , 우리 어머니 이름은 %s 입니다.\n",fathername , mothername);
		System.out.printf("나의 이름은 %s 이고 , 나이는 %d 이고 , 몸무게는 %5.1f 입니다.",myname , age , weith);
		
		
		
		
		
		
		
		
	}
	
	

}
