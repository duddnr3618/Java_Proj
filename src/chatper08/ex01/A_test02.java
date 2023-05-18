package chatper08.ex01;

public class A_test02 {

	public static void main(String[] args) {
		//A클래스와 다른 패키지에 존재 : import / 클래스의 전체이름 : 패키지명.클래스명
		
		//1. 다른 패키지의 클래스를 전체이름으로 사용
		chatper08.ex02.A a1 = new chatper08.ex02.A();
		
		//2. import 해서 사용
		A a2 = new A();
		
		//접근가능한 필드 , 메소드 : public 접근제어자만 접근 가능.
		System.out.println(a1.a); 	//public
//		System.out.println(a1.b); 	//protected -접근x (상속관계가 설정되있어야됨)
//		System.out.println(a1.c); 	//default -접근x
//		System.out.println(a1.d); 	//private -접근x
		
		//메소드 호출
		a1.abc();		//public
//		a1.bcd();		//protected
//		a1.cde();		//default
//		a1.def();		//private
		
	}
}
