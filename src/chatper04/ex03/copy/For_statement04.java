package chatper04.ex03.copy;

public class For_statement04 {
	public static void main(String[] args) {
		/*
		 	for문에서 오류를 일으키기 쉬운 부분
		 	
		 */
		
		for (int i = 0 ; i<10 ; i++) {
			System.out.println(i);
		}
		
		System.out.println("------------------------------------");
		
		for(int i = 0 ,j = 0 ; i<10 ; j++) {
			System.out.println(i + " ," + j); // 무한루프 발생.
			if (j == 1000) {break; //무한루프를 빠져나오도록
			
			}
		}
		System.out.println("무한루프 발생.");
		
		for (int i =10 ; i < 100 ; i +=10 ) {
			System.out.println(i);
		}
	
		int i,j;
		for ( i=0  ; i<10 ; i++) {
			
		}
		
	}
	

}
// 전역변수 : 


// 지역변수 : for , if , switch , while , do while
// ->{} 블랙내에서 선언된 변수 