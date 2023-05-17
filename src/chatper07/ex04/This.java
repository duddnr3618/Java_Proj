package chatper07.ex04;

class A {
	//필드 : heap공간에 값이 저장이됨. , 객체를 생성 (new) 후 heap
	int m ;
	int n ; 
	
	//메소드
	void init (int a , int b) {	//지역변수 (a,b,c) : 메소드 내부에서 선언된 변수
		int c;
		c=3;
		m=a;		//생략가능 -> 생략됬을시 컴파일시 자동으로 등록함.
		this.n=b;
		System.out.println("핃드의 값 출력 : "+this.m + ", " + n ); 	//this생략 가능
	}
	void work() {
		this.init(2,3);		//생략시 컴파일러가 자동으로 등록함.
	}


}

public class This {
	public static void main(String[] args) {
		/*
		 	this 키워드  : 필드이름 앞 , 메소드 이름앞
		 	->자기 자신의 객체를 의미(기본적으로 모두 생략되어있다,실행시 컴파일러가 자동으로 넣어줌.)
		 	->명시가 필요한 경우 : 생상자에서 인풋되는 이름 , 받는 이름 , 필드명 모두동일 할때 필드명에 this키워드 
		 	 
		 	this() 메소드 : 생성자 내부에서만 사용됨.
		 	->반드시 생성자 내부에서 첫번째 라인에 와야한다.
		 	->생성자 호출시 다른 생성자를 먼저 실행 하도록 한다.
		 */
		
		//객체 생성 
		A a = new A () ;
		a.work();
		System.out.println();
		
	}

}
