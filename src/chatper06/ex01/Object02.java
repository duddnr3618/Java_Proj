package chatper06.ex01;		//클래스를 조직화하는 폴더

//클래스 외부 : 패키지 이름 / 임포트 (같은 패키지에 존재하지 않는 클래스는 import가 필요하다.) / 외부클래스

class A { //외부 클래스 : public 클래스는 1개만 존재해야한다.
	
	//1.생성자 : 리턴타입이 없고 클레스 이름과 동일한 메소드 , 객체를 생성시 생성자를 호출 
		//A() {} : 인풋매개변수가 없는 생성자 : 기본생성자 -> 생략가능.
		// 생성자를 필드의 값을 초기화 할때 사용됨.
	
	public A () {} 			//기본 생성자.(생략가능) , 생성자가 존재하지 않으면 객체를 생성할수 없다.
	
	//2.필드 : 객체화 해서 사용됨. : Heap메모리 안에 저장됨.
	int m = 3 ;
	int n = 7 ;
	double d = 10.5;
	
	//3.메소드 : 호출시 작동 , 필드의 내용을 출력하는 메소드
	public void print () {
		System.out.println("m : " + m);
		System.out.println("n : " + n);
		System.out.println("d : " + d);
		
	}
				
	
}
public class Object02 {
						//클레스블락 : 생성자 / 필드 / 메소드 / 이너클래스(클래스 내부의 클래스)
	
   //접근제어자		 리턴타입		입력매개변수			실행블락
	public static void main(String[] args) {
		//메인 메소드 (함수)
		
		int b = 10 ; //지역변수 , 메소드 블락에서 선언된 변수 , if/switch/for/while/do while ->블락을 벗어나면 사라지는 변수
					 // Stack 공간에 저장.
		
		//객체 생성 : 클레스의 필드와 메소드를 객체화해서 메모리(RAM)로 로드함.
		A a = new A() ; 	// new 기본 생성자 호출(); 
		
		//객체의 필드의 값을 출력
		System.out.println(a.m);
		System.out.println(a.n);
		System.out.println(a.d);
		
		//a객체의 메소드를 호출
		a.print();
		
		System.out.println("==================================================");
		
		//객체의 필드의 값을 수정후 출력
		a.m = 100;
		a.n = 200;
		a.d = 300.55;
		
		//메소드 호출
		a.print();
		
		System.out.println("===================================================");
		
		//클레스는 하나의 틀을 가지고 여러개의 객체를 생성할 수 있다.
		A aa = new A();	//
		
		//필드의 값을 할당.
		aa.m = 200;
		aa.n = 300;
		aa.d = 30.33;
		aa.print();
		
		
		
		
		
		
	}
	
}
