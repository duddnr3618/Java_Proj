package chapter18.ex04;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMethod02 {

	public static void main(String[] args) {
		
		/*
		  	TreeSet : Set<E> , SortedSet<E>-정렬 , NavigableSet<E>-검색 인터페이스를 구현한 클래스
		  		-TreeSet을 객체화해서 Set타입으로 선언한 경우 Set메소드만 사용 가능
		  		-TreeSet을 객체화해서 TreeSet타입으로 선언한 경우 정렬/검색 기능을 추가적으로 사용가능
		  		-값을 저장할때 오름차순으로 정렬되어서 값이 저장.( 1-->9 , A-->Z ...)
		  	
		  	
		 */
		
		
		//TreeSEt을 객체화 해서 TreeSet타입으로 지정
		TreeSet<Integer> treeSet = new TreeSet();
		
		//TreeSet에 값을 입력 : 50 ~ 2씩감소 하면서 저장
		for ( int i = 50 ; i > 0 ; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);	//0~50까지 정렬되어서 입력된다.
		
		System.out.println("================================");
		//출력 : Iterator 
		Iterator <Integer> ir = treeSet.iterator();
		
		while (ir.hasNext()) {
			System.out.print(ir.next() + " ");
		}
		System.out.println();
		
		System.out.println("========= 검색 기능 가져오기 ===========");
		//1.first () : 제일 처음 값 가져오기
		System.out.println(treeSet.first());
		//2.last () : 제일 마지막 값 가져오기
		System.out.println(treeSet.last());
		//3.lower (E element) : element보다 작은값 출력
		System.out.println(treeSet.lower(29));
		//4.higher (E element) : element보다 큰 값 출력
		System.out.println(treeSet.higher(15));
		//5.floor (E element ) : element를 포함해서 작은값 출력
		System.out.println(treeSet.floor(20));
		//6.ceiling (E element ) : element를 포함해서 큰값 출력
		System.out.println(treeSet.ceiling(45));
		
		System.out.println("====== 데이터 꺼내기(값을 꺼내서 제거) ===========");
		System.out.println();
		
		
		//7.pollFirst() : 제일 첫번째 값 꺼내기
		int treeSetSize = treeSet.size();
		System.out.println("treeSet의 갯수 : " + treeSet.size());
		for ( int i = 0 ; i < treeSet.size() ; i ++) {
			System.out.println(treeSet.pollFirst());
		}
		System.out.println();
		
		
		//8.pollLast() : 제일 마지막 값 꺼내기 
		for ( int i = 50 ; i > 0 ; i-=2) {
			treeSet.add(i);
		}
		System.out.println("treeSet의 갯수 : " +treeSet.size());
		for ( int i = 0 ; i < treeSet.size() ; i ++) {
		System.out.println(treeSet.pollLast());		
		}
		System.out.println(treeSet);
		
		System.out.println();
		System.out.println("=========== 정 렬 ==================");
		System.out.println();
		
		System.out.println("======== 9. SortedSet =================");
		// 9.SortedSet<E> headSet (E element) : element 값의 Head쪽으로 정렬해서 값을 저장(element는 미포함)
		for ( int i = 50 ; i > 0 ; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		//SortedSet<Integer> sSet = treeSet.headSet(20)
		SortedSet<Integer> sSet = treeSet.headSet(20);
		System.out.println(sSet);
		
		System.out.println("=============== 10. NavigableSet ==========");
		// 10.NavigableSet<E> headSet(E element) : element 값을 Head 쪽으로 값을 가져온다.(element 선텍)
		for ( int i = 50 ; i > 0 ; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		NavigableSet<Integer> nSet = treeSet.headSet(20 , true);	//true : 포함 / false : 미포함
		System.out.println(nSet);
		
		System.out.println("=========================================");
		
		// 11.SortedSet <E> tailSet (E element) : element값의 Tail쪽으로 정렬해서 값을 저장 (element 포함)
		for ( int i = 50 ; i > 0 ; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		SortedSet<Integer> sSet2 = treeSet.tailSet(12);
		System.out.println(sSet2);
		
		// 12.NavigaableSet <E> tialSet (E element) : element값의 Tail쪽으로 정렬해서 값을 저장 (element 선택)
		for ( int i = 50 ; i > 0 ; i-=2) {
			treeSet.add(i);
		}
		NavigableSet<Integer> nSet2 = treeSet.tailSet(12,true);
		System.out.println(nSet2);
		
		System.out.println("============= 특정 범위의 값 가져오기 =================");

		// 13.
		for ( int i = 50 ; i > 0 ; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		SortedSet sSet3 = treeSet.subSet(10,20);	// 10 : 포함 / 20 : 미포함	
		System.out.println(sSet3);
		
		NavigableSet nSet4 = treeSet.subSet(10, false, 20, false);	//10 : 미포함 / 20 : 미포함
		System.out.println(nSet4);
	
		
		System.out.println();
		System.out.println("======= 반대로 정렬 하기 =============");
		for ( int i = 50 ; i > 0 ; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		NavigableSet <Integer> des = treeSet.descendingSet();
		System.out.println(des);
		
		// des는 내림차순으로 정렬되어있다.
		// des를 다시 descending하게 되면 다시 오름차순으로 정렬된다.
	}

}
