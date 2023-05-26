package chapter17.ex01;

//상품을 저장하는 클래스 : Object와 Generic을 사용 하지 않는 경우 -> 하나의 삼품 클래스에 하나의 타입의 상품을 저장.

class Apple {	//Apple클래스
Apple () {}
Apple (String name) {
	this.name = name;
}
String name ;
}

class Goods1 {		//상품을 저장하는 클래스 -> 1종류의 상품을 저장함.(Apple객체만 저장)
	private Apple apple = new Apple ();
	
	//getter
	public Apple getApple () {
		return apple ;
	}
	//setter
	public void setApple (Apple apple) {
		this.apple = apple ;
	}
	
}



public class ProbleGeneric {

	public static void main(String[] args) {

		/*
		 	제너릭을 사용하기전에 여러가지 문제점 :
		 		-클래스 내부에 다양한 타입을 사용자가 정의해서 넣을수 있다.
		 		-재너릭을 사용하기전에 하나의 클래스의 다양한 타입의 정보를 저장하기 위해선 각각의 클래스를 만들어서 사용
		 		-하나의 클래스에 다양한 객체정보를 저장하기 위해서 Object타입으로 업캐스팅해서 저장후 다시 다운캐스팅을 통해서 객체내부의 정보를 
		 		 읽거나 쓰거나를 했음.
		 		-재너릭을 사용하면 업,다운캐스팅이 필요없이 여러타입의 객체를 하나의 클래스에 넣고 뺄수가 있다.
		 		
		 */
		
		//상품객체생성 ->사과만 저장 가능.
		Goods1 g1 = new Goods1 ();
		
		g1.setApple(new Apple ("홍옥"));		//setter를 사용해서 객체를 생성
		System.out.println((g1.getApple()).name);
		
		
		g1.setApple (new Apple("국광"));
		System.out.println((g1.getApple()).name);
		
		g1.setApple(new Apple("부사"));
		System.out.println((g1.getApple()).name);
		
		
	}

}
