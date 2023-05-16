package chatper07.ex01;

class B  {
	
	int m ;			//인스턴스 필드 : 객체화 후 사용 가능 , 객체간의 공유 불가능 , Heap
	static int n ; 	//정적필드	: 객체없이 클래스명으로 사용 가능 객체화해서도 사용됨 , 메모리에 클래스 영역에 저장됨
							//모든 객체와 공유되는 필드
}

public class Field02 {
	public static void main(String[] args) {
		
		
		//B타입으로 b1 b2 b3 객체생성
		B b1 = new B();		//기본생성자 호출
		B b2 = new B();		//기본생성자 호출
		B b3 = new B();		//기본생성자 호출
		
		//인스턴스필드 : m ->객체 내부의 고유 공간 , 다른객체와 값이 공유되지 않음.
		b1.m = 1;
		b2.m = 2;
		b3.m = 3;
		System.out.println(b1.m);
		System.out.println(b2.m);
		System.out.println(b3.m);
		System.out.println();
		
		//정적필드 : 모든 객체에서 값을 공유 , 클레스 영역에 값이 저장됨
		b1.n = 10;
		b2.n = 20;
		b3.n = 30;
		System.out.println(b1.n);
		System.out.println(b2.n);
		System.out.println(b3.n);
		
	}

}
