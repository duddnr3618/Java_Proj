package chapter10.ex05;

class Aa {

	static int m = 3;
}

class Bb extends Aa{
	

	static int m = 4;		//정적필드는 클래스블락에 저장이되고 오버라이딩 되지 않는다.
}

public class Overriding_Static {

	public static void main(String[] args) {
		
		//정적필드 : 클래스영역에 필드의 값이 저장되어 있어 부모,자식필드는 별개이다.
		// -- 모든 객체에서 공유되는 공간
		// -- 객체 생성후 사용
		// -- 객체 생성 없이 클래스 이름으로 호출 가능.
		
		//객체생성후 사용 
		Aa aa1 = new Bb (); 	//자식객체생성하면서 부모타입으로 지정
		System.out.println(aa1.m);	 	//3
		
		//다운캐스팅
		Bb bb1 = (Bb) aa1 ;
		System.out.println(bb1.m); 		//4
		
		
		

	}

}
