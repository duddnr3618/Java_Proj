package chapter18.ex04;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// hashCode () , equals() 를 재정의 하지 않은 상태
class A {		//data 필드에 들어오는 값으로 각 객체를 식별하기 위해서는 : hashCode(),equals()가 
				//재정의 되어있어야 set에 넣을때
	int data;
	
	A (int data ) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return " " + data + " ";
	}
}

//hashCode() , equals() 를 재정의 한 상태
class B {
	
	int data;
	
	B (int data) {
		this.data = data;
	}
	
	//equals() 재정의 : set에 중복된 값을 넣지 않도록 식별자생성 -> Object의 equals()는 stack의 주소비교
	//data필드의 heap의 값을 비교하도록 재정의 해주어야 한다.
	@Override
	public boolean equals(Object obj) {			//b1.equals(b2)
		if(obj instanceof B ) {		//다운캐스팅하기전에 obj는 Object타입이므로 해당타입이 존재하는지 확인후 B타입으로 다운캐스팅
			if(this.data == ((B)obj).data) {	//heap에 저장된 data 필드의 값을 비교하도록 오버라이딩.
				return true;
		}else {
			return false;
		}
		
	}
		return false;
	}	
	
	// 2.HashCode() 를 재정의 : data필드의 값으로 hashCode를 생성하도록 재정의
		//data필드의 값이 동일하면 동일한 hashCode()가 생성됨
	@Override
	public int hashCode() {
		return Objects.hashCode(data);	//data필드의 값으로 hashCode() 생성
	}
	
	
	//객체를 출력시 data필드의 값을 출력
	@Override
	public String toString() {
		return " " + data + " " ; 
	}
	
}

public class Set_Machanism {

	public static void main(String[] args) {

		/*
		 	Set<E> : 1.방번호[index]가 존재하지 않는다
		 			 2.중복된 값을 넣을수 없다.
		 	 -set에 중복된 값을 넣지 못하도록 하기 위해서는 Object의 2개의 메소드가 재정의 되어있어여한다.
		 	 -객체의 특정필드의 hashCode() , equals() 메소드 두개가 재정의 되어있어야한다.
		 	 -wapper class : Boolean , Byte , Short , Integer , Long , Float , Double , Charter / String
		 	 -자신이 생성한 특정한 클래스(타입)를 set에 넣을 경우 : Object의 hashCode() , equals() 메소드를 재정의해야한다.
		 	 
		 	 
		 */
		
		// 1.Set Wapper class 사용한 경우
		Set<Integer> hset1 = new HashSet();
		hset1.add(22); hset1.add(33); hset1.add(22); hset1.add(33); hset1.add(33);
		System.out.println(hset1);
		System.out.println(hset1.size());
		
		// 2. Set에 wapper class가 아닌 일반 클래스를 사용한 경우
		Set<A> hset2 = new HashSet();
		hset2.add(new A (22)); hset2.add(new A (22)); hset2.add(new A (22));
		hset2.add(new A (22)); hset2.add(new A (22));
		System.out.println(hset2.size());
		
		// 3.Set의 data필드에 대해서 hashCode() ,equals() 재정의
		Set<B> hset3 = new HashSet();
		hset3.add(new B (33)); hset3.add(new B (33)); hset3.add(new B (33)); 
		hset3.add(new B (33)); hset3.add(new B (33));
		System.out.println(hset3);
		System.out.println(hset3.size());	//동일한 값들이 (중복) 제거되 출력
		
		
	}

}
