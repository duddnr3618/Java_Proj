package chatper08.ex03;

public class Ex01 {

	public static void main (String [] args) {
		

		int [] coinUnit = {500,100,50,10};
		int money = 2680;		//money변수의 돈을 거스름돈으로 나누어줄려고함.
		
		System.out.println("money = " + money);
		for ( int i = 0 ; i < coinUnit.length ; i++) {
			//나누어줄 거스름 돈이 아래와 같이 출력 되도록 코드 작성
		
			System.out.println(coinUnit[i] + "원 : " + money/coinUnit[i]);			
		
			money =  money % coinUnit[i];  		//나누고 나서 나머지값 -> 그다음 연산 진행
		}
	}
}

/*
 	실행결과 
 	money = 2680
 	500원 : 5
 	100원 : 1
 	50원 : 1
 	10원 : 1
 	
 */

	
