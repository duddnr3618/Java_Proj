package chapter04.ex04;

public class While_statement {
	public static void main(String[] args) {
		/*
		 	While : 반복문 , 조건이true동안 반복 , 조건이 false가 되면 while문을 빠져나온다.
		 	->for문으로 적용 가능하다. / while문은 for문으로 적용 가능하다
		 	for (초기값 ; 조건 ; 증감식) {
		 		조건이 ture일 동안 실행블락
		 		}
		 	
		 	초기값
		 	while (조건) { 
		 	조건이 true일동안 실행블락;
		 	증감식;
		 	}	
		 	
		 */
		// 1. for문으로 출력
		for (int i = 0; i<10 ; i++) {
			System.out.println(i);
		}
		
		
		
		System.out.println("-----------------------------------------\n");
		// 2. while문으로 출력
		int a = 0 ;						//초기값.
		while (a<10) {					//조건
			System.out.println(a);		//실행블락
			a++;						//증감식
		}
		
		
	}

}
