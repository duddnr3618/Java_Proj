package chapter18.ex03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_Vs_LinkedList {

	public static void main(String[] args) {

		/*
		 	List<E>
		 	-ArrayList<E> , Vector<E> : 검색시 성능이 빠르다 , 추가(add/삭제 : 부하가 많이 걸린다.)
		 	-LinkedList<E> : 검색이 느리다. , 추가/제거시 부하가 걸리지 않는다.
		 	
		 */
		
		// 1.데이터를 추가할떄 성능비교
		List<Integer> aList = new ArrayList();
		List<Integer> linkedList = new LinkedList();
		
		// 성능체크를 하는 변수를 선언
		long startTime = 0 , endTime = 0;
		
		//ArrayList 성능
		startTime = System.nanoTime();	//현재시간을 나노로 변환해서 전수형으로 저장
		System.out.println(startTime);
		
		//ArrayList에 1부터 1씩 증가하면사 100,000개의 값을 저장
		for ( int i = 0 ; i < 100000 ; i++) {
			aList.add(0,i);
		}
		endTime = System.nanoTime();
		
		//프로그램을 실행시 나노타입 출력
		System.out.println(endTime);
		System.out.println(endTime - startTime); 		//263176800 nano 초 : ArrayList
				
		System.out.println("=============================");
		
		//LinkedList 성능
		startTime = System.nanoTime();
		for ( int i = 0 ; i < 100000 ; i++) {
			linkedList.add(0,i);
		}
		endTime = System.nanoTime();
		
		//프로그램을 실행시 나노타입 출력
		System.out.println(endTime - startTime); 		//3636600 nano 초 : LinkedList
		
		System.out.println("======값을 겅색시 차이=====");
		//ArrayList 성능
		for ( int i = 0 ; i < 100000 ; i++) {
			System.out.println(aList.get(i));
			aList.get(i);
		}
		endTime = System.nanoTime();
		
		System.out.println(endTime);
		System.out.println(endTime - startTime);
		
		System.out.println("================================");
		//ArrayList 성능
		for ( int i = 0 ; i < 100000 ; i++) {
			System.out.println(aList.get(i));
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		
		System.out.println(endTime);
		System.out.println(endTime - startTime);
				
		
	}

}
