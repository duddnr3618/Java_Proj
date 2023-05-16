package chatper07.ex02;

class A {
	
	//생성자
	A () {}
	
	//인스턴스 필드
	int m;
	int n;
	
	//메소드 : 함수를 객체지향 언어에서는 메소드라 호칭 , 호출해야 사용 가능 , 인풋 매개변수를 가짐
	
	//리턴 값이 없는 매소드 , 인풋값이 없는 
	public void print () {	//리턴타입(void-리턴타입이 없을떄.) 매소드명(print) () {}
		//매소드 호풀시 필드의 내용을 출력
		System.out.println("m필드의 값 : " + m);
		System.out.println("n필드의 값 : " + n);
		
	}
	
	//리턴값이 있는 매소드 (int),매소드 호출시 인풋매개변수를 받는 매소드
	int plus (int a , int b) {
		return a+b ;
		
	}
	
	//double을 리턴
	double mainus (double a, double b) {
		return a-b;
	}
	
	//문자열을 리턴
	String fullName (String fName , String lName) {
		return fName + " " + lName;
	}
	
}


public class Method01 {
	public static void main(String[] args) {
		
		//객체생성
		A a = new A () ;
		
		//매소드 호출
		
		//리턴이 없는 매소드 호출
		a.m = 10;
		a.n = 20;
		a.print();
		
		System.out.println();
		
		//리턴값이 있는 매소드 호출 (호출시 매개변수 정수값 2개)
		a.plus(10, 20);
		System.out.println(a.plus(10, 20));
		
		System.out.println();
		
		//double을 리턴 받는 매소드
		System.out.println(a.mainus(1.618, 1.382));
		
		System.out.println();
		
		//문자열을 리턴받는 매소드
		System.out.println(a.fullName("길동", "홍"));
		
	}

}
