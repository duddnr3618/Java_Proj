package chapter18.ex05;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Summary {

	public static void main(String[] args) {

		/*
	  	map <K,V> 
	  		-K(Key) : 중복되면 안됨 , Set 관리됨 / 방번호 -> List
	  		-V(value) : 중복된 값을 넣을 수 있음
	  		-map : 인터페이스
	  		
	  	HashMap <K,V> : Key(HashSet)가 임의의 값으로 지정됨 , 싱글쓰레드(ArrayList)
	  		-자동으로 정렬됨
	  		
	  	HashTable <K,V> : Key(HashSet)가 임의의 값으로 지정됨 , 멀티쓰레드(Vector) , 모든 메소드가 동기화처리됨
	  	LinkedHashMap <K,V> : Key(LinkedHashSet) -> 넣은 순서대로 지정됨
	  	TreeMap <K,V> : Key(TreeSet)가 정렬되어서 지정됨 
	  		
	  		
	 */
		
		// 1. HashMap : 입력순서와 출력순서가 다르다. 싱글쓰레드 환경 -> ArrayList
		Map <String , Integer> hmap = new HashMap ();
		hmap.put("다", 30);
		hmap.put("마", 40);
		hmap.put("나", 50);
		hmap.put("가", 60);
		hmap.put("가", 70);		
		
		System.out.println(hmap);
		
		// 2. Hashtable : 입력순서와 출력순서가 다르다. 모든 메소드가 동기화 , 멀티쓰레드 환경 -> Vector
		Map <String , Integer> htmap = new Hashtable ();
		htmap.put("다", 30);
		htmap.put("마", 40);
		htmap.put("나", 50);
		htmap.put("가", 60);
		htmap.put("가", 70);		
		
		System.out.println(htmap);
	
		
		// 3. LinkedHashMap : 입력된 순서대로 출력된다.
		Map <String , Integer> lhmap = new LinkedHashMap ();
		lhmap.put("다", 30);
		lhmap.put("마", 40);
		lhmap.put("나", 50);
		lhmap.put("가", 60);
		lhmap.put("가", 70);		
		
		System.out.println(lhmap);
		
		// 4.TreeMap : key가 정렬되어서 입력됨 , 오름차순 정렬
		Map <String , Integer> tmap = new TreeMap ();
		tmap.put("다", 30);
		tmap.put("마", 40);
		tmap.put("나", 50);
		tmap.put("가", 60);
		tmap.put("가", 70);		
		
		System.out.println(tmap);
		
		
	}

}
