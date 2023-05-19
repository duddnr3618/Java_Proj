package chatper04.ex03.copy;

public class For_statement {
public static void main(String[] args) {
	/*
	 반복문 : for , while , do while ->조건이 true일때 까지 반복,false 이면 구문을 빠져나온다.
	 for (변수의 초기값 ; 조건 ; 증감식) {
	 조건이 true일 때 반복되는 실행 블락 
	  }
	 */
	// 1. For문의 기초 
	for (int i = 0; i <10 ; i++) { // 초기값 0할당. 0~9까지 1씩 증가하면서 변수i값을 출력
		System.out.println(i);		//i변수는 지역변수기 때문에 for 블락 밖에서 다시 사용할수 있다.
	}
	
	for (int i = 100, j = 200 ; i<1000 ; i++ , j++) { // 실행 구문 작동후 증감식 작동.
		System.out.println("변수i의 값은 " +i+ "이고 변수j의 값은 " +j+ "이다." );
	}
	
	System.out.println("--------------------------------------------------");
	//전역 변수로 선언 b
	int b ;							//전역변수 : for문 블락 밖에서 선언
	for (b=0 ; b<100 ; b+=2) {
		System.out.print(b+ " ");
	}
	
	System.out.println("\n------------------------라인 개행-------------------------");
	//for문을 이용해서 3의 배수를 0~1000 출력.
	int c ;
	for (c=0 ; c<1000 ; c+=3) {
		if (c!=0) {
		
		System.out.print( c+ " ");
	}
	}
	System.out.println("-------------------------------------------------------------");
	//for문을 사용해서 2단 
	for (int i =2 , j = 1 ; j<10 ; j++) {
		System.out.println(i + " * " + j + " = "+ i*j);
	}
	System.out.println("------------------------------------------------------------");
	for (int i = 2 , j = 1 ; j<10 ; j++) {
		System.out.printf("%d * %d = %d \n",i,j,i*j);
	}
}
}
