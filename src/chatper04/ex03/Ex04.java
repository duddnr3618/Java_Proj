package chapter04.ex03;

public class Ex04 {
	public static void main(String[] args) {
		
		/*
		 	1.이중for문을 사용해서 구구단을 코드 (1~19단)
		 	2.1~19단 중 3의 배수단 만 출력
		 */
		
		System.out.println("-----2중 for문을 사용해서 1~19단까지---------");
		for (int i = 1; i<20 ; i++) {
			System.out.println(i + "단" );
			for (int j= 1 ; j<20 ; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
				System.out.println(" ");
			}
		}	
		
		//제어 키워드 : break ; continue;
		//제어 키워드는 일반적으로 if문과 같이 사용됨
		// break; : {}실행블락을 탈출
		//contiune; :contiune; 아래내용은 실행되지 않고 , 증감식을 작동시킨다. 
		System.out.println("----------------3의 배수단만 출력-----------------");
		System.out.println( "  ");
		for (int i = 1 ; i < 20 ; i++) {
			if ( i % 3 == 00) { // if (i % 3 != 0) {contiune;} : 3의 배수가 아닐때는 contiune가 작동.
				System.out.println(i + "단");
				for (int j = 1 ; j<20 ; j++) {
					System.out.println(i + " * " + j + " = "  + i*j);
				
			}
			}
			
		}
			
	}

}
