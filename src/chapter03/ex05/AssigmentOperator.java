package chapter03.ex05;

public class AssigmentOperator {
	public static void main(String[] args) {
		/*
		 대입 연산자 : +=,-=,*=,/= (기존 연산의 축약된 표현)
		 val1+=10;  <==>  val1=val1+10;
		 */
		
		//1.대입연산자의 축약 표현
		int val1 = 3;
		val1 = val1+3; // val1 +=3
		System.out.println(val1);
		
		int val2 = 3;
		val2 +=3;					//축약
		System.out.println(val2);
		
		int val3 = 10;
		val3 = val3 - 15; 
		System.out.println(val3);  //-5출력
		
		int val4 = 10;
		val4 -=15;
		System.out.println(val4); // -5출
		
	}

}
