package chapter10.ex05;

class Aaa {
	
	//정적메소드 : Aaa클래스 영역에 실행코드가 저장됨.
	static void print () {
		System.out.println("Aaa - print()-정적메소드");
	}
	
	void print2 () {
		System.out.println("Aaa - print2()-인스턴스 메소드");
	}
}

class Bbb extends Aaa {
	static void print () {
		System.out.println("Bbb - print()-정적메소드");
	}
	
	void print2 () {
		System.out.println("Bbb - print2 ()-인스턴스 메소드");
	}
	
}


public class Overriding_StaticMethod {

	public static void main(String[] args) {
		//정적 메소드 : 클래스 영역에 실행코드를 가지고 있음. ->각 클래스 영역에 들어있어 오버라이딩 되지 않는다.
		// -- 객체화해서 사용 가능
		// -- 객체 없이 클래스 이름으로 바로 사용가능
		
		//객체생성해서 호출 : 정적메소드 / 인스턴스메소드(반드시 객체생성)
		Aaa aaa1 = new Bbb();
		aaa1.print();		//정적메소드 : 오버라이딩 되지 않고 각각 별개의 공간에서 작동
		aaa1.print2();		//인스턴스 메소드 : 오버라이딩되어 자식의 오버라이딩 된 메소드 작동 
		
		//다운캐스팅
		Bbb bbb1 = (Bbb) aaa1;
		bbb1.print();		//정적메소드
		bbb1.print2();		//인스턴스메소드
		
		//객체생성없이 바로 호출	(정적메소드는 객체생성 없이 바로 호출 가능)
		Aaa.print();
		Bbb.print();
		
		
	}

}
