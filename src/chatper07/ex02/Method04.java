package chatper07.ex02;


public class Method04 {
	
	//인스턴스 메소드 : 객체화 해야 호출이 가능
	String sum (int a , int b ) {
		int c = a+b ;		//c : a+b 저장하는 정수형 변수
		String d=String.valueOf(c);	//d : 정수c를 String타입으로 변환해서 d변수에 할당
		return d;
	}
	
	//스테틱 메소드 : 객체 생성 없이 호출이 가능
	static int sum2 (int a , int b ) {
		
		return a+b;
	}
	
	
	public static void main(String[] args) {
		//main 메소드는 static 키오드가 들어가 있다.
		// 같은 클레스 내에서 static 붙은 메소드는 메소드 명으로 바로 호출이 가능하다.
		int a ;
		a= sum2 ( 10,20);
		System.out.println(a);
		
		//sum : 인스턴스 메소드 , 객체화 해야 호출이 가능하다.
		Method04 m1 = new Method04 () ;
		String s1 = m1.sum(10, 30) ;		//40 <----- String 
		String s2 = m1.sum(70, 30) ;		//100 <----- String 
		System.out.println(s1);
		System.out.println(s2);
			
		System.out.println(s1+s2); 			// 40100  : "문자열 " + "문자열"
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); // 문자열 -> 정수로 캐스팅
		
		//같은 클래스 내부에서 메소드 호출 (static 메소드는 static 메소드를 호출 가능)
		// sum2 : static (정적메소드) 
		int m = Method04.sum2(10,20);	//객체 생성 없이 클래스 명으로 호출
		System.out.println(m);
		
		Method04 m3 = new Method04 () ;	//객체 생성
		int n = m3.sum2(10, 20) ; 		//객체생성 후 출력
		System.out.println(n);
		
		int k = sum2(10,20) ; 	//메소드 명으로 바로 호출 가능 : 메인메소드에서 클래스객체,클래스명없이 바로 메소드 명으로 호출가능
		System.out.println(k);	//조건 : 동일한 클래스 / 스테틱키가 붙어있어야 한다. 
		
		//sum (10,10) ; // 인스턴스 메소드 : 객체 생성후 호출
		sum2(10,10); // 정적 메스도 : 객체 생성후 호출 , 클래스먕으로 호출, 메소드 명으로 바로 호출
		
		
	}

}
