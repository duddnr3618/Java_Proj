package chapter02.ex01;

public class UsageOfDataType {
	public static void main(String[] args) {
		// 변수 선언 두가지 방법 (변수는 계속 다른 값으로 변환이 가능하다)
		//1.변수를 선언, 나중에 값 대입
		int a;
		//System.out.println("a"); // 초기값을 할당하지 않는 상태에서 출력할시 오류발생
		a= 10 ; 
		System.out.println(a);
		
		
		//2.변수 선언과 동시에 값을 할당.
		int  b = 20;
		System.out.println(b);
		b = 30;
		System.out.println(b); // 변수는 다른값으로 바꿀수 있다.
		
		
		//상수 선언 : 변수 이름 앞에 final 키를 넣는다.(초기값이 지정되면 다른값을 수정할 수 없다.)
		// 상수 이름은 대문자를 사용(전체 대문자)
		final double PI = 3.14; // final(상수) double PI = 3.14 (변수)
		System.out.println(PI);
		//PI = 3.148621 : 상수는 초기값을 수정할수 없다.
		
		
				
		
		
		
		
	}

}
