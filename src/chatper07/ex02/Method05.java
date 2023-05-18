package chatper07.ex02;

class Methodoverloading {
	void print () { //인풋 매개변수가 없는 메소드
		System.out.println("데이터가 존재하지 않습니다.");
		
	}
	
	void print (int a) {	//인풋매개변수에 정수 1개를 인풋받는 메소드.
		System.out.println("int : " + a);
	}
	
	void print (double a) {	//인풋매개변수는 1개 : 
		System.out.println("double : " + a);
	}
	
	void print ( int a,int  b) { //인풋 매개변수 2개 : 정수
		System.out.println("int a : " + a +" , int b : " + b );
	}
	
	void print (double a , double b) {	//인풋매개변수 2개  : 실수
		System.out.println("double a : "+ a + " , double b : " + b);
	}
	//오류발생 : 인풋매개변수의 갯수 , 자료형이 동일한 메소드는 오류가 발생됨
	//void print ( int k , int g) {
		
	//메소드 오버라이딩 : 부모클래스의 메소드를 재정의 해서 사용함.
	//상속에서 적용 , 
	@Override
	public String toString() {
	
		return "객체 자체를 출력시 Object 클래스의 toString() 를 출력";
	}
	
}


public class Method05 {
	
	public static void main(String[] args) {

		/*
		  메소드 오버로딩	: 동일한 이름의 메소드지만 시그니처에 따라서 다른 메소드를 식별
		  					메소드를 식별하는 식별자 , 인풋 아규먼트 갯수 , 인풋 아규먼트의 자료형에
		  					따라서 다른 메소드인 것들을 식별
		  					-시그니처 : 메소드를 식별하는 식별자.
		 
		  메소드 오버라이딩	: 상속에서 작동됨 , 부모 클래스의 메소드를 자식 클래스에서 재정의 
		 		 자바의 모든 클래스는 오브젝트 클래스를 상속받는다
		 		 Object 클래스의 필드나 메소드를 사용 할수 있다.
		 */
		
		Methodoverloading m1 = new Methodoverloading () ;
		
		//매개변수가 없는 print 호출
		m1.print();
		
		//매개변수 1개 : int (정수)
		m1.print(10);
		
		//매개변수 1개 : double(실수)
		m1.print(10.5);
		
		//매개변수 2개 : int (정수)
		m1.print(50, 30);
		
		//매개변수 2개 : double (실수) 
		m1.print(1.618, 2.618);
		
		//오브젝트 클래스의 메소드 출력
		System.out.println(m1);						//객체 자체를 출력 
		System.out.println(m1.toString());			//오브젝트 클래스의 메소드
	
		
	}

}
