package chatper06.ex01;

import java.util.Scanner;

//클레스 외부 블락 : 패키지 / 임포트(같은 패키지에 존재하지 않는 클래스는 Import) / 외부 클레스


public class Object01 {
		//클레스 내부 블락 : 필드 / 메소드(함수) / 생성자 (클레스 이름과 동일한 메소드-리턴타입이 없는)
		
		//생성자 : 변수의 값을 초기화 시에 사용됨 , 객체를 생성시 생성자를 호출함.
		public Object01 () {} 
			   //기본생성자 : 필드에서 상략가능
		//필드
		int a = 100 ; //필드 : 객체화를 해서 사용 가능
		int b = 200 ; 
		
		//메소드(함수) : 호출시 작동
		public void plus (int a, int b) {		// 접근제어자 리턴타입 메소드명 ( 인풋매개변수,인풋매개변수) {
												// 		실행 블락;
												//	}
			System.out.println(a+b);
			
		}
	
		public static void main(String[] args) {
		//main method출력
		/*
		 	
		 */
		
		int a = 10; //지역변수 (메소드 내부에서 선언된 변수)
		
		Scanner sc = new Scanner (System.in);
		
		//1.객체 생성 : 클레스를 틀로 해서 메모리에 올라가는 인스턴스 , 클레스(붕어빵 틀 / 설계도) -> 객체(붕어빵)
		Object01 oc1 = new Object01() ;
		//클래스명	 객체  = Heap영역에 객체생성 	생성자호출;
		//타입	 변수
		
		//2.객체의 필드의 값 출력
		System.out.println(oc1.a);		//객체의 a필드의 저장된 값을 출력
		System.out.println(oc1.b);		//객체의 b필드의 저장된 값을 출력
		
		
		//3.객체의 메소드 호출
		oc1.plus(10, 20);
		
		System.out.println("==================================================");
		
		//클레스는 객체화를 헤야 사용가능하다.
		//클레스는 "붕어빵틀"(프로그램) --> 객체(인스턴스)는 메모리에 로드된 "붕어빵"(프로세스).
		//하나의 클레스를 가지고 여러개의 갹체를 생성가능하다.
		
		//두번째 객체 생성
		Object01 oc2 = new Object01();
	 //클레스명(타입) 객체(타입변수) = new(힙영역에 저장) 생성자 호출() : 기본생성자 호출 ;
		
		//객체의 필드 값 수정 및 출력
		oc2.a = 500;	//oc2객체의 a필드에 값을 500 할당
		oc2.b = 700;	//oc2객체의 b필드에 값을 700 할당
		
		System.out.println(oc2.a);	//500
		System.out.println(oc2.b);	//700
		
		//메소드 호출
		oc2.plus(oc2.a,oc2.b);
		
		
		
		
		
		
	}

}
