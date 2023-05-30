package chapter17.ex10;

//제너릭 타입의 부모클래스
class Parent <T> {
	T t ;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
//제너릭 타입의 자식 클래스 -> 부모타입이 반드시 하나이상 적용되어 있어야 한다.
class Child <T> extends Parent <T> {
	
}

//부모타입의 갯구보다 많으면 상관없다.
class Child2 <T,V> extends Parent <T> {
	V v;

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
	
}



public class InheritanceGeneric {

	public static void main(String[] args) {
		/*
		 	제너릭 클래스의 상속 : 
		 		-자식 클래스는 부모클래스와 타입의 갯수가 같거나 많아야 한다.
		 		
		 */
		
		//부모 제너릭 클래스
		Parent <String> p1 = new Parent ();
		p1.setT("제너릭 부모클래스");
		System.out.println(p1.getT());
		
		Parent <Double> p2 = new Parent ();
		p2.setT(50.5);
		System.out.println(p2.getT());
		System.out.println();
		
		//자식 클래스
		Child <String> c1 = new Child ();
		c1.setT("상속받은 제너릭 자식클래스");		//부모에서 상속받은 메소드.
		System.out.println(c1.getT());
		System.out.println();
		
		Child2 <String,Integer> c2 = new Child2 ();
		c2.setT("상속받은 제너릭 자식2클래스");
		c2.setV(100); 		//자식에서 정의한 제너릭 자식 클래스
		System.out.println(c2.getT());
		System.out.println(c2.getV());
		
		
	}

}
