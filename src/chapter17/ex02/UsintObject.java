package chapter17.ex02;

class Banana {
	Banana () {}
	Banana (String name) {
		this.name = name;
	}
	String name ;
}

class Orange {
	Orange () {}
	Orange (String name) {
		this.name = name;
	}
	String name ;
}

class Pencil {
	Pencil () {}
	Pencil (String name) {
		this.name = name;
	}
	String name ;
}

class Goods2 {
	//필드
	private Object obj = new Object ();
	
	//getter : 필드의 값을 리턴.
	public Object getObj() {
		return obj;
	}
	
	
	//setter : 필드의 값을 할당.
	public void setObj (Object obj) {		//obj변수에 자바의 모든 클래스를 담을수 있다.
		this.obj = obj;
	}
	
}

public class UsintObject {

	public static void main(String[] args) {
		/*
		  	Object는 모든 클래스의 부모
		  	-모든 객체는 object타입으로 저장이 가능.
		  	-다운캐스팅하여 필드의 내용,메소드를 출력이 가능하다.
		  	-문제가 발생됨 : Object 업캐스팅 되어서 들어간 하위 타입을 알아내기가 어렵다.
		  	
		 */
		
		//Goods2 객체생성
		Goods2 g2 = new Goods2 ();
		
		//Goods2 (상품 ) : 바나나
		Banana b1 = new Banana("바나나");
		g2.setObj(b1);			//b1 : Banana -> Object타입으로 자동 업캐스팅
		
		Object o1 = g2.getObj();		//getter사용해서 객체를 가지고옴
		Banana bb1 = (Banana)o1 ;
		System.out.println(bb1.name);
		
		//Goods2 (상품) : 오렌지
		g2.setObj(new Orange ("오렌지"));		//Orange -> Objcet로 업캐스팅
		System.out.println(((Orange)g2.getObj()).name);
		
		//Goods2 (상품) : 펜
		
		g2.setObj(new Pencil("연필"));	//Pencil -> Object타입으로 업캐스팅
		System.out.println( ((Pencil)g2.getObj()).name  );
		
	}
}
