package chapter17.ex03;

class Apple { String apple = "사과" ; }
class Banana {String banana = "바나나"; }
class Orange {String orange = "오렌지" ;}



class Goods <T> { 		//클래스 이름 뒤의 T : 객체를 생성할때 타입을 지정해서 호출

	//getter
	private T t;
	public T getT() {
		return t;
	}
	
	//setter
	public void setT (T t) {
		this.t = t;
	}
	
	
}

public class SingleGeneric {

	public static void main(String[] args) {
		/*
		 	제너릭 클래스 : 다양한 타입을 저장 할 수 있는 클래스.
		 	-클래스 이름뒤에 : <T> -> 인풋되는 타입을 지정함  (Type)
		 	-객체를 생성할때 <T>에 들어있는 타입을 지정해서 객체를 생성함.
		 	-<T>에 들어오는 타입은 반드시 객체형 자료형이어야 한다.(기본자료형은 올수 없다.)
		 	
		 	wrapper class : 기본자료형을 객체형 자료형으로 만든것.
		 		<기본자료형> -> <객체형 자료형>
		 		boolean -> Boolean
		 		char -> Charter
		 		byte -> Byte
		 		short -> Short
		 		int -> Integer
		 		long -> Long
		 		float -> Float
		 		double -> Double
		 		
		 */
		
		//객체생성 (사과)
		Goods <Apple> apple = new Goods <Apple> ();
		
		//setter을 사용해서 Apple객체를 주입
		apple.setT(new Apple ()); 		//setter을 사용해서 Apple객체를 주입
		
		//getter를 사용해서 Apple 객체를 가져옴 -> 자신이 원하는 객체를 주입후 다운캐스팅 없이 출력가능하다.
		System.out.println( apple.getT().apple );
		apple.getT();
		
		//객체생성 (바나나)
		Goods <Banana> banana = new Goods <Banana> ();
		
		//setter을 사용해서 Banana객체를 주입
		banana.setT(new Banana ());
		
		//getter를 사용해서 Banana 객체를 가져옴 -> 자신이 원하는 객체를 주입후 다운캐스팅 없이 출력가능하다.
		System.out.println(banana.getT().banana);
		banana.getT();
		
		//객체생성 (오렌지)
		Goods <Orange> orange = new Goods <Orange> ();
				
		//setter을 사용해서 Orange객체를 주입
		orange.setT(new Orange ());
				
		//getter를 사용해서 Orange객체를 가져옴 -> 자신이 원하는 객체를 주입후 다운캐스팅 없이 출력가능하다.
		System.out.println(orange.getT().orange);
		orange.getT();
		
		
		
		
		
	}

}
