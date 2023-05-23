package chapter10.ex07;

class C {
	String name;
	C (String name) {
		this.name = name;
	}
}

class D {
	String name ;
	D (String name) {
		this.name = name;
	}
	
	//메소드를 오버라이딩 해서 D클래스로 다운캐스팅 후 Object클래스의 equals() 메소드를 재정의 후 D객체의 name필드의 
	//		값이 같을때 true를 리턴으로 돌려주도록 재정의 
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((D)obj).name) {
			return true;
		}else {
			return false;
		}
	}
}

public class Object_Class03 {

	public static void main(String[] args) {

		C c1 = new C ("홍 길 동") ;
		C c2 = new C ("홍 길 동")	;
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		
		System.out.println("========================");
		
		D d1 = new D ("홍 길 순");
		D d2 = new D ("홍 길 순");
		
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
	}

}
