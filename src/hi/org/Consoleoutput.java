package hi.org;
//패키지 : 킄래스 파일이 저장되는 폴더 구조


public class Consoleoutput {
public static void main(String[] args) {
	//main 매소드 블락에서 프로그램 작성


	//1.system.out.println ();
	
//문자열 출력 : " "->처리함
	System.out.println("안녕하세여");
	//+ : 문자열일때는 연결을 의미
    System.out.println("오늘은"+"날씨가매우좋다");	
	// : 정수,실수일떄는 더하기 연산
	System.out.println("2"+"4");
	
	//정수 출력 : " "-> ""를 처리하면 연산이 안된다.
	System.out.println(2+4);
	
	
	//실수 출력 : ""를 처리하지 않는다.
	System.out.println(11.5+11.5);
	
	System.out.println("11.5"+ 11.5);
	
	//-------------------------------------------------------
	System.out.println("---------------------------------------------");
	
	//문자열과 숫자를 + 할때 : 연결
	System.out.println("문자열"+3 + 4 + 5);
	
	//정수 + 정수 +정수 + "문자열"
	System.out.println(3 + 4 + 5 + " 문자열");
	
	//변수 선언 : 문자열을 저장하는 변수
	//String :자료형  str : 변수명 = 초기값 ;
	String str = "안녕하세여 ";
	
	System.out.println(str);
	
	//int : 정수를 담는 자료형 
	int a = 10 ;
	int b = 10 ;
	System.out.println(a);
	 System.out.println(a +b);
	 System.out.println(a+"b");
	 



}




}

