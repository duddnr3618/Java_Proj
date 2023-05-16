package chatper07.ex01;

class A {		// 클레스 블락에 올수 있는 것
				// 1.생성자 / 2.필드 /3.메소드 / 4.이너클래스
	//기본생성자 생략 public A () {}
	
	//필드 : Heap에 저장 : 인스턴스 필드 , 정적필드
	// 인스턴스 필드 : 필드 이름 앞에 Static 키가 들어가 있지 않는 필드 , Heap에 저장됨 , 객체화 해야 사용가능.
						//다른 객체화 공유되지 않는 필드 
	// 정적필드(Static) : 필드 이름 앞에 Static 키가 붙어 있는 필드 , Heap공간에 저장되지 않고 Static 공간에 저장됨 
						//객체화 해서 사용 or 객체화 하지 않고 클래스 이름으로 바로 사용 가능.
						//다른 객체화 공유해서 사용 할수 있는 필드.
	
	int a ;				//인스턴스 필드(객체화) 	: 그 객체에만 사용 가능 (메모리에 Heap 공간에 저장)
	static int b ;		//정적(스테틱) 필드	: 모든 객체에서 공유가능 (메모리에 Static 공간에 저장)
	
	
}
public class Fieid01 {

	public static void main(String[] args) {
		
		//A클래스(타입) 으로 a객체 생성
		A a = new A ();		//a객체를 생성.(기본생성자를 호출)
		A aa = new A ();
		A aaa = new A ();
		
		//각 객체의 필드의 값 입력
		a.a = 10;
		aa.a = 20;
		aaa.a = 30;
		
		System.out.println(a.a);
		System.out.println(aa.a);
		System.out.println(aaa.a);
		
		System.out.println();
		
		//정적(static)필드의 값 입력 : 모든 객체가 공유되는 필드. -> A class로 생성된 모든 객체가 공유해서 사용하는 필드
		a.b = 10;
		aa.b = 20;
		aaa.b = 30;	
		a.b = 40;
		
		System.out.println(a.b);
		System.out.println(aa.b);
		System.out.println(aaa.b);
		
		System.out.println();
		//정적(Static) 필드 : 객체화 하지 않고 클래스 이름으로 바로 사용 가능하다.
		
		A.b = 50 ;			//클래스 이름으로 사용
		System.out.println(A.b);
		System.out.println(a.b);
		System.out.println(aa.b);
		System.out.println(aaa.b);
		

	}

}
