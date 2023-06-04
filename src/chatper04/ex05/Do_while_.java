package chapter04.ex05;

public class Do_while_ {
	public static void main(String[] args) {
		/*
		 	do while 문 : 
		 	->조건과 상관없이 첫 1회는 무조건 실행블락을 실행시킴 
		 	->조건을 확인후 반복
		 				
		 	1.while문
		 	초기값;
		 	while(조건) {
		 	실행블락
		 	증감식;
		 	}
		 	
		 	2.do while 문
		 	초기값 ; 
		 	do { 
		 	실행블락
		 	증감식 ;
		 	} while (조건) ; 
		 	
		 */
		
		// 1. while문
		int a = 0;
		while (a<0) { // false이므로 실행블락이 실행이 안된다.
			System.out.println(a+ " ");
			a++;
		}
		while (a<10 ) {
			System.out.println(a + " ");
			a++;
		}
		
		System.out.println("---------------------------------------");
		// 2. do while문
		do { 
		System.out.print(a + " "); // 조건과 상관없이 1번은 실행블락이 작동된다.
		
		} while (a<0);
		
		System.out.println("-----------------------------------------");
		// 3. 반복횟수가 10번인 경우 : while문과 do while문 비교
		//while문
		a = 0;		// 변수의 값을 변경
		while (a <10 ) {
			System.out.print(a + " "); //0~9까지 10번 출력
			a++ ;
		}
		
		System.out.println();
		// do while문
		a=0;
		do {
			System.out.print(a +" ");
		}while (a<10);
		
		
		
		
		
	}

}
