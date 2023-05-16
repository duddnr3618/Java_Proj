package chatper07.ex02;


class G { 
	//메소드 타입 
	//- 인스턴스 메소드 : 객체화 시켜애 호출이 가능
	//- static 메소드 : 객체 생성 없이 클래스 명으로 호출이 가능하다. , 객체 만들어서도 호출 가능
	
	// 인스턴스 메소드
	void sum ( int a , int b) {
		
		System.out.println(a + b + " <<== 두 매개변수의 합" );	// + : 덧셈으로 처리 ( 연산 + 문자열)
		System.out.println(" 두 매개 변수의 합은 : " + a+b);		// + : 연결처리가 됨 ( 문자열 + 연산 )
	}
	
	//정적메소드
	static int diff ( int a , int b) {
		return a-b ;
		
	}
		
}


public class Method03 {

	public static void main(String[] args) {
		
		//1. 인스턴스 메소드 호출 ->객체화 해야 호출이 가능하다.
		G g1 = new G () ;
		g1.sum(3, 2);
		
		//2.스테틱 메소드 호출 -> 객체화 하지 않아도 호출이 가능하다.(객체화로도 호출이 가능하다.)
		//객체 생성후 호출
		int a ; //정수변수 선언 후 호출
		a= g1.diff(50, 60);
		System.out.println(a);
		
		System.out.println(g1.diff(90, 80));
		
		//객체 생성 없이 바로 호출 ( 객체 생성 없이 클래스 이름으르 호출가능)
		int b ;
		b = G.diff(350, 200);
		System.out.println(b);
		
		
	}

}
