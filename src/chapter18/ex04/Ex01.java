package chapter18.ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 
		 for문을 사용해서 1~100까지 hSet에 값을 저장
		 Iterator을 사용해서 hashset에 저장된 값을 출력
		 Enhancefor문을 사용해서 출력
		 hashset에 저장된 값을 배열로 변환 -> 일반 for문사용해서 출력
		 
		 
	
		 */
		Set <Integer> hset = new HashSet (); 
		
		for ( int i = 1 ; i <= 100 ; i++) {
			hset.add(i);
		}
		System.out.println("==========Iterator 사용해서 출력 ============");
		Iterator < Integer > iterator = hset.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("========== 향상된 for문 ===========");
		for ( Integer k : hset) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("======= 배열로 변환해서 for문을 사용해서 출력 =========");
		Integer [] arr = hset.toArray(new Integer[0]);
		for ( int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
	}

}
