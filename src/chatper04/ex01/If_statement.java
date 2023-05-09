package chatper04.ex01;

public class If_statement {
	public static void main(String[] args) {
		/*
		 	제어문 : if / swich
		 	if : 실행문 마지막에 break가 들어가 있다.(생략되있음)
		 	swich :실행문에서 빠져 나오기 위해 항상 break를 넣어주어야 한다.
		If문 사용하기
		1.조건이 1개 일떄. -> 실행블락의 {}를 생략할 수 있다.
		- if (조건) {조건이 참일시 싱행블락}
		- if (조건) 조건이 참일시 싱행블락;
		
		2.조건이 2개 일때. -> 삼항 연산자로 처리 가능. : (조건)? 참 실행 : 거짓 실행;
		-if (조건) {조건이 참일시 생행블락}
		else {조건이 거짓일시 실행블락}
		
		3.조건이 여러개 일떄.
		- if (조건1) {조건1이 참일시 실행블락
		} else if (조건2) {조건2가 침일시 실행블락
		} else if (조건3) {조건3가 참일시 실행블락
		} else if (조건4) {조건4가 참일시 실행블락
		} else {위의 조건이 모두 만족하지 않을때 실행하는 블락}
		
		*/
		
		//Type1 예제 : 조건이 1개일때.
		int val1 = 5;
		
		if (val1 > 3) {System.out.println("실행1");}
		if (val1 > 6 ) {System.out.println("실행1");} // 조건이 거짓이므로 실행x
		
		System.out.println("---------------------------------------");
		//조건이 1개일때 {}생략가능.
		if (val1 > 0 ) System.out.println("실행2");
		
		System.out.println("---------------------------------------");
		//Type 2 : 조건이 2개일때.
		if (val1 > 3) {
			System.out.println("실행3"); //조건이 참일시 실행
		} else {
			System.out.println("실행4"); //조건이 거짓일시 실행
		}
		//if ~ else -> 삼항 연산자로 변환 가능하다.
		System.out.println( (val1 < 3) ? "참참참" : "거짓");
		
		System.out.println("----------------------------------------");
		//Type 3 : 조건이 여려개 일떄.
		int val2 = 30;
		
		if (val2 > 90) {
			System.out.println("A학점 입니다.");
		} else if (val2 >80 ) {
			System.out.println("B학점 입니다.");
		} else if (val2 > 70) {
			System.out.println("C학점 입니다.");
		} else if (val2 > 60) {
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}
		
		System.out.println("------------------------------------------");
		//조건의 순서를 바꿀 경우 원치 내용이 출력 될 수 있다.
		int val3 = 95; //조건을 줄떄 세밀하게 할 필요가 있다.
		if (val3 > 60) {
			System.out.println("D학점 입니다.");
		} else if ( val3 > 70) {
			System.err.println("C학점 입니다.");
		} else if (val3 > 80) {
			System.out.println("B학점 입니다.");
		} else if (val3>90){
			System.out.println("A학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}	//위의 조건이 모두 만족하지 않을때 , swich문의 default
		
		System.out.println("--------------------------------------");
		int val4 = 95; //조건을 줄떄 세밀하게 할 필요가 있다.
		if (val4 > 60 && val4<70) { //참 && 참 일시 참
			System.out.println("D학점 입니다.");
		} else if ( val4 > 70 && val4 <80) {
			System.err.println("C학점 입니다.");
		} else if (val4 > 80 && val4 < 90) {
			System.out.println("B학점 입니다.");
		} else if (val4>90 && val4 < 100){
			System.out.println("A학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}	//위의 조건이 모두 만족하지 않을때 , swich문의 default	
		
		
		}
		
		
	}


