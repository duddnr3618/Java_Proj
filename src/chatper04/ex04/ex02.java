package chapter04.ex04;

public class ex02 {
	public static void main(String[] args) {
		/*
		 	반복문 : 무한루프 빠지지 않도록 해야한다.
		 */
		
		System.out.println("--------------무한루프 탈출----------------");
		boolean abc =  true ;
		int i = 1;			//밖에서 변수 선언을 해주어야 i가 초기화 되지 않고 무한루프가 종료된다.
		while (abc) { // 무한루프
			
			System.out.println("무한루프"+i);
			if (i==100) {break;} // i가 100일때 무한루프 종료 = 무한루프 100번출력
			i ++;
			
		}
	}

}
