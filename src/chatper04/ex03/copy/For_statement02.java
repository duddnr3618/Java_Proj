package chatper04.ex03.copy;

public class For_statement02 {
	public static void main(String[] args) {
		/*
		 	반복문 : for , while , do while
		 	-> 조건이 true 동안 계속 반복 , 조건이 false가 되면 실행블락{}을 빠져나온다.
		 	-> 조건이 무한루프에 빠지지 않도록 잘 처리해야함.
		 	-> 조건이 비어있으면 무한루프가 된다.(메모리 풀로 인해서 프로그램이 중지 될수 있다.)
		 	 */
		
		//1.for문에 조건이 없는 경우 (무한루프)
		/*
		 for (int i = 0 ; ; i++) {
			System.out.println(i);
		} // 터미네이트 해야된다.
		*/
		
		//2.for문에서 초기값 생략 , 조건 생략 , 증감값 생략된 경우 (무한루프)
		/*
		 for (;;) {
			System.out.println("무한루프");
		} // 무한루프가 됨.
		*/
		
		//3.for문에서 조건을 잘못 처리하면 무한루프에 빠질수 있다.
		//if 조건 내에서 break; 문을 사용해서 무한루프를 빠져나올수 있다.
		for (int i = 1000 ; i<=1000 ; i-- ) {
			System.out.println(i);
			if (i==-500) { break;} // i == -500 일때 for문을 빠져나온다.
		}
	}

}
