package chapter18.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListMethod {

	public static void main(String[] args) {
		/*
		 	List<E> : 인터페이스 -> 메소드만 선언되어있고 구현되어있지 않다. / 방번호를 가지고 있다.(Index를 가지고있다) 
		 			 중복된 값을 저장할 수 있다.
		 			 컬렉션은 값을 추가,제거 및 수정할때 메소드를 사용한다.
		 		- ArrayList<E> : 싱글 쓰레드 환경에서 사용
		 		- Vector<E>	: 멀티 쓰레드 환경에서 사용 , 모든 메소드가 동기화 처리 되어있다.-> 멀티쓰레드 환경에 유리
		 						중간에 어떤 값을 넣거나 제거할 경우 부하가 많이 발생된다.
		 						빈번하게 값을 수정하는 경우 좋지 않다.
		 		-LinkedList<E> : 중간에 값을 수정 및 제거하더라도 부하가 많이 발생하지 않는다.
		 						빈번하게 값이 변경되는 경우 사용하는 자료형.
		 						
		 */
		
		//List에서 사용되는 메소드
		//자식의 구현 클래스가 객체화 해서 List타입으로 선언 : 인터페이스의 메소드를 호출하면 오버라이딩된 메소드가 호출된다.
		List<Integer> aList = new ArrayList <> ();		//ctrl + shitf + o : 임포트
		
		//메소드 : ArrayList -> List의 값을 추가
		// 1. add (E element -> 제너릭 타입을 지징) : 마지막방에 값을 추가함.
		System.out.println(aList);
		System.out.println(aList.size()); 	//컬렉션의 저장된 방의 갯수
		System.out.println();
		
		aList.add(3); 
		aList.add(4);
		aList.add(5);
		System.out.println(aList);
		System.out.println(aList.size()); 	//컬렉션의 저장된 방의 갯수
		System.out.println();
		
		// 2.add (int index , E element ) : index 방번호에 값을 추가함. -> 중간에 새로운 방에 값을 추가
		aList.add(1, 50);		// (1 : 방번호-index , 6 : 값 )
		System.out.println(aList);
		System.out.println(aList.size());
		System.out.println();
		
		// 3.addAll (다른 리스트객체) : 자신의 마지막 방에 다른 컬렉션 객체의 값을 모두 추가.
		List <Integer> aList2 = new ArrayList ();
		aList2.add(1); aList2.add(2);
		System.out.println(aList2);

		aList2.addAll(aList);
		System.out.println(aList2);
		System.out.println();
		
		// 4.addAll (int index , 다른 리스트객체 )
		List <Integer> aList3 = new ArrayList ();
		aList3.add(1); aList3.add(2);
		System.out.println(aList3);
		
		aList3.addAll(0, aList2);
		System.out.println(aList3); 		//자기 자신의 객체를 인풋할수도 있다.
		System.out.println();
		
		// 컬렉션 : List , Set , Map 
		//List의 갑 수정 : set()
		
		// 5.set(int index , E element) : index 방번호에 있는 값을 element로 들어온 인자로 수정
		aList3.set(1, 5);		// 1: 방번호 , 5 : 수정값
		aList3.set(3, 6);
		System.out.println(aList3);
		System.out.println();
		
		//List 갑 삭제 : remove (int index) : index : 방 번호의 값을 삭제 -> 삭제후 뒤에 있는 값이 앞으로 당겨진다.
		// 6. remove (int index)
		aList3.remove(2);
		System.out.println(aList3);
		System.out.println();
		
		// 7. remove (Object o ) : 방번호로 삭제하는 것이 아니고 리스트에 저장된 값을 식별해서 삭제
		aList3.remove(new Integer(6));
		System.out.println(aList3);
		System.out.println();
		
		// 8. clear () : 리스트의 모든 값을 삭제
		aList3.clear();
		System.out.println(aList3);
		System.out.println();
		
		// 9.isEmpty () : 리스트에 값이 존재하지 않을경우 true , 존재하는 경우 false
		System.out.println(aList3.isEmpty());
		System.out.println();
		
		// 10. size() : 방의 갯수
		System.out.println(aList2.size());
		System.out.println(aList3.size());
		System.out.println();
		
		// 리스트에 저장된 값을 가져오기
		// 11. get (int index ) : index의 방번호에 값을 가져오기
		System.out.println(aList2.get(0));
		System.out.println(aList2.get(1));
		System.out.println(aList2.get(2));
		System.out.println(aList2.get(3));
		System.out.println(aList2.get(4));
		System.out.println(aList2.get(5));
		
		System.out.println("====== 리스트의 값을 for문을 사용해서 출력 ===========");
		for (int i = 0 ; i < aList2.size() ; i++) {
			System.out.print(aList2.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("====== 리스트의 값을 향상된 for문을 사용해서 출력 =========");
		for (int k : aList2) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println();
		
		//리스트의 값을 배열로 변환
		// 12.toArray () : 리스트에 저장된 값을 배열로 변환해주는 메소드 ->리턴타입이 Object이기 때문에 다운캐스팅해서 처리
		Object [] obj1 = aList2.toArray();		//Object 타입으로 받아야한다.
		System.out.println(Arrays.toString(obj1));
		System.out.println();
		
		// 13.toArray (T [] t) : 리스트 ->배열로 지정 , T [] : 제너릭 타입 -> 리스트를 배열로 끄집어 낼때 해당타입의 배열로 바로 끄집어낸다.
		Integer [] int1 = aList2.toArray(new Integer [0]);		//[0] : 방의 갯수를 지정함. 리스트의 값이 존재할 경우 리스트의 방크기로 지정됨
		System.out.println(Arrays.toString(int1));
		Integer[] int2 = aList2.toArray(new Integer [10]);
		System.out.println(Arrays.toString(int2));
		
		
		
		
		
	}

}
