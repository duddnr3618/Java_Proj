package chapter10.ex07;

class Aa {	//extends Object 생략되어있다.
	//필드
	String name;
	Aa (String name) {
		this.name = name;
	}
	
}

class Bb {	//extends Object 생략되어있다.
	//object클래스의 equals()를 재정의해서 Heap의 값을 비교하도록 재정의
	
	String name ; 
	
	Bb (String name) {
		this.name = name;
	}
	
	//object의 메소드를 재정의 : Heap영역에 값을 비교하도록 재정의
	@Override
		public boolean equals(Object obj) {
		if (this.name == ((Bb)obj).name) {
			return true ;
		}else {
			return false;
		}
		
		}
}
public class Object_class02 {

	public static void main(String[] args) {
		/*
		 	object클래스의 equals() 메소드 : 기본적으로 Stack의 주소를 비교하도록 설정.
		 	equals() 메소드는 heap의 값을 비교하는 것이 아니라 stack메모리의 참조주소를 비교하도록 셋팅
		 	->equals() 메소드는 heap의 값을 비교 할수 있도록 재정의 해줘야한다.
		 	
		 	String 클래스는 equals() 메소드가 heap의 값을 비교하게 재정의 되있다.
		 */
		
		//Aa 객체 생성
		
		Aa a1 = new Aa ("안녕");
		Aa a2 = new Aa ("안녕");
		System.out.println("Stack의 주소 : " + a1);
		System.out.println("Stack의 주소 : " + a2);
		// 둘다 false
		System.out.println(a1==a2);			//Stack에 저장한 Heap의 주소를 비교함
		System.out.println(a1.equals(a2));	//Stack에 저장한 Heap의 주소를 비교함
		
		System.out.println("=======================");
		
		String s1 = new String ("안녕");
		String s2 = new String ("안녕");
		// fasle , true
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));		//Object 클래스의 equals를 재정의해서 heap값을 비교
		
		
		System.out.println("========재정의=======");
		Bb b1 = new Bb ("안녕");
		Bb b2 = new Bb ("안녕");
		//각 주소는 다르다.
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(b1==b2);	//false : Stack의 주소값을 비교
		System.out.println(b1.equals(b2));	//true : heap의 값을 비교
		
		
		
		
	}

}
