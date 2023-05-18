package chatper08.ex01;

import chatper08.ex02.A;



public class A_test03 extends A { //상속관계설정 : A - 부모클래스 , A_test03 - 자식클래스

	//부모클래스의 필드중 public , protected 만 접근 가능
	int k = a;	//public		: 1
	int l = b;	//protected		: 2
//	int m = c;	//default
//	int n = d;	//private
	
	//상속된 메소드 2개가 내려온다.->abc() , bcd()
	
	
	public static void main(String[] args) {
		
		A a1 = new A () ;
		
		//접근 가능한 필드 , 메소드 : public , protected
		System.out.println(a1.a);
		//System.out.println(a1.b);
		
		a1.abc();
		
		
		A_test03 t1 = new A_test03();
		System.out.println(t1.a); 		//A클래스의 a필드 : public
		System.out.println(t1.b); 		//A클래스의 b필드 : protected
		
		//메소드 출력
		t1.abc();	//public
		t1.bcd();	//protected
		
	}
}
