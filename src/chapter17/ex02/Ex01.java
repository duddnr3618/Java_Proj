package chapter17.ex02;

class Tiger {
	String name = "호랑이";
}

class Lion {
	String name = "사자";
}

class Eagle {
	String name = "독수리";
}


class Animal {
	private Object obj ;
	
	//getter : 객체정보 출력
	public Object getObj() {
		return obj;
	}
	
	//setter : obj필드의 값을 적용
	public void setObj (Object obj) {
		this.obj = obj;
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		/*
		 	Animal클래스의 호랑이 사자 독수리 객체를 setter주입하고 getter로 name필드를 출력
		 */

		Animal a1 = new Animal ();
		//호랑이
		Tiger t1 = new Tiger ();
		a1.setObj(t1);
		
		Object o1 = a1.getObj();
		Tiger tt1 = (Tiger)o1;
		System.out.println(tt1.name);
		
		//사자
		Lion l1 = new Lion();
		a1.setObj(l1);
		Object o2 = a1.getObj();
		Lion ll1 = (Lion)o2;
		System.out.println(ll1.name);
		
		//독수리
		Eagle e1 = new Eagle();
		a1.setObj(e1);
		Object o3 = a1.getObj();
		Eagle ee1 = (Eagle) o3;
		System.out.println(ee1.name);
		
		
		
		
	}

}
