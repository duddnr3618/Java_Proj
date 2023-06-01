package chapter18.ex04;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMethod {

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

	// 1.Set선언
	Set<String> hSet1 = new TreeSet ();

	// 2.add (E element) : Set에 값을 추가함.
	hSet1.add("가"); hSet1.add("나"); hSet1.add("가");
	System.out.println(hSet1);		//set은 중복된 값을 넣을수 없다.

	//3.addAll( 다른 Set객체를 ) : 자신의 Set에 다른 Set에 저장된 값을 넣을수 있다.->중복된 값을 저장되지 않는다.
	Set<String> hSet2 = new TreeSet();
	hSet2.add("나");  hSet2.add("다");  
	hSet2.addAll(hSet1);
	System.out.println(hSet2);		//중복된 "나"는 제거되어 하나만 출력된다.

	// 4. remove (Objcet o ) : 값으로 삭제(방번호가 없어 삭제가 불가 -> 값으로 삭제)
	hSet2.remove("나");
	System.out.println(hSet2);
	System.out.println(hSet2.toString());	//컬렉션의 모든 구현체는 toString()이 재정의

	// 5.clear() : 모든 값을 제거
	hSet2.clear();
	System.out.println(hSet2);

	// 6.isEmpty() : set의 값이 비어있으면 - true / 아니면 - false
	System.out.println(hSet2.isEmpty());
	boolean b1 = hSet2.isEmpty();
	System.out.println(b1);

	// 7.contains( Object o ) : 메소드의 매개변수로 들어오는 값이 set에 존재하면 true / 존재x false
	Set<String> hSet3 = new TreeSet ();
	hSet3.add("가"); hSet3.add("나"); hSet3.add("다");
	System.out.println(hSet3.contains("가"));
	System.out.println(hSet3.contains("라"));

	// 8. size() : Set에 저장된 값의 갯수
	System.out.println(hSet3.size());

	System.out.println("======Iterator 출력 ===============");
	// 9.itarotr 를 사용해서 set에 저장된 값을 출력 -> set은 방번호가 없어서 for문을 사용할수가 없다.->while문
	// Iterator : Set에 저장된 값을 순회
	// hasNext () : set에 다음값이 존재하면 true / 존재하지 않으면 false
	// next () : 값을 출력하고 다음값으로 이동
	Iterator<String> iterator = hSet3.iterator();	//set객체에 Interator을 장착함.

	while (iterator.hasNext()) {		//다음 값이 존재하면 true
		System.out.print(iterator.next() + " ");
	}
	System.out.println();
	System.out.println();

	System.out.println("======향상된 for문 출력 ===============");
	// 10.향상된 for문을 사용해서 출력
	for (String k : hSet3) {
		System.out.print(k + " ");
	}
	System.out.println();

	System.out.println("======toArray 로 출력 ===============");
	// 11.toArray () : set에 저장된 값을 배열로 변환 , Object[]로 리턴
	Object [] obj = hSet3.toArray();
	System.out.println(Arrays.toString(obj));

	for (int i = 0 ;i < obj.length ; i++) {
		System.out.print(obj[i] + " ");
	}
	System.out.println();

	System.out.println("========-------------------==============");
	// 12.toArray(T[] t) : set에 저장된 값을 배열로 변환 해당타입으로 변환
	String [] str = hSet3.toArray(new String [0] );		//String배열로 끄집어냄 ->set에저장된 값에 따라서 방 크기를 지정
	System.out.println(Arrays.toString(str));

	for ( int i = 0 ; i < str.length ; i++) {
		System.out.print(str[i]+ " ");
	}
	System.out.println();
		
	}

}
