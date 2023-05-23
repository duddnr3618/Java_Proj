package chapter10.ex05;

class C {	//부모
	
	//필드 (오버라이딩 되지 않는다 - 자식과 완전히 별개)
	int m = 3;
	static int n = 30;
	
	//인스턴스 메소드 - 오버라이딩 
	void print () {
		System.out.println("C");
	}
	
	//정적메소드 : 오버라이딩 되지 않는다.
	static void print3 () {
		System.out.println("C");
	}
}

class D extends C {	//자식
	
	//필드 (오버라이딩 되지 않는다 - 부모와 완전히 별개)
	int m = 4;
	static int n = 40;
	
	//
	void print () {
		System.out.println("D");
	}
	
	static void print3 () {
		System.out.println("D");
	}
	
}

public class OverridingAllInfo {

	public static void main(String[] args) {

		C c1 = new D () ;
		System.out.println(c1.m);	//3
		System.out.println(c1.n);	//30
		c1.print();			//D : 오버라이딩되어 자식의 메소드가 출력
		c1.print3();		//C : 
		
		System.out.println();
		//다운캐스팅
		D d1 = (D) c1;
		System.out.println(d1.m);	//4
		System.out.println(d1.n);	//40
		d1.print();					//D
		d1.print3();				//D

		
	}

}
