package chapter10.ex06;

class Aa {
	int a = 10;
	
	void abc () {
		System.out.println("Aa 클래스의 abc메소드");
	}
	void ab() {
		System.out.println("Aa 클래스의 ab메소드");
	}
	
}

class Bb extends Aa {
	
	int b = 20;
	@Override
	void abc() {
		System.out.println("Bb클래스의 abc()");
	}
	void bcd () {
		abc();			//this.abc() ->this가 생략
	}
	void cde () {
		super.abc(); 	//부모 객체의 abc() 메소드 호출
	}
	void def () {
		super.ab();		//부모 객체의 ab() 메소드 호출
		
	}
	
	void efg () {
		System.out.println(super.a);
		System.out.println(this.b);
	}
}

public class Super_keyword02 {

	public static void main(String[] args) {
		
		//1.객체생성
		Bb bb = new Bb () ; 		//bb : Aa , Bb타입을 내포 Bb타입으로 지정
		bb.bcd(); 	//자기 자신의 abc() 메소드 호출됨 , this
		bb.cde(); 	//부모클래스의 메소드 호출 : Aa의 abc() 메소드 호출
		bb.def(); 	//부모의 ab()메소드를 호출
		bb.efg();	//
		
		

	}

}
