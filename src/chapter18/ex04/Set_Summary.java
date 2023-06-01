package chapter18.ex04;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Summary {

	public static void main(String[] args) {

		/*
	 	Set<E> : 인터페이스 , 객체화 할수 없다.->자식을 객체화해서 타입은 지정가능
	 		-선언만 된 메소드 : 자식클래스가 선언만 된 메소드를 오버라이딩해 구현
	 		-인터페이스의 메소드 홏출시 자식클래스의 오버라이딩된 메소드가 작동
	 		-방번호가 없다 -> index번호가 없다. : 중복된 값을 넣을수 없다. ( ID , 주민번호 등...)
	 		-Set에 값을 넣어 중복된 값을 제거 할때 사용.
	 		
	 		HashSet<E> : 입력 순서대로 출력되지 않고 랜덤하게 값이 출력
	 		
	 		LinkedHashSet<E> : 입력 순서대로 값이 출력
	 		
	 		TreeSet<E> : 검색을 빠르게 하기 위해서 만들어짐.
	 			-값을 저장할때 정렬해서 저장이된다. ->오름차순(ASC) / 내림차순(DESC)
	 		
	 */
		//객체생성
		Set <String> hset = new HashSet() ;
		Set <String> lset = new LinkedHashSet ();
		Set <String> tset = new TreeSet ();
		
		//값 입력
		hset.add("다"); hset.add("마"); hset.add("나"); hset.add("가");
		System.out.println(hset);		//임의의 순서로 출력
		
		lset.add("다"); lset.add("마"); lset.add("나"); lset.add("가");
		System.out.println(lset);		//입력한 순서대로 출력
		
		tset.add("다"); tset.add("마"); tset.add("나"); tset.add("가");
		System.err.println(tset);		//오름차순으로 정렬되어 출력
	}

}
