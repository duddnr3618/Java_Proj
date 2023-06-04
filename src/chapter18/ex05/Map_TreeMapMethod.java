package chapter18.ex05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_TreeMapMethod {

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
		
		// 1.Map 선언
		Map<Integer , String> hmap1 = new TreeMap ();
		
		// 2.put(K,V) 메소드 : Map에 값을 추가할때 사용 <-> Set : add
		hmap1.put(2, "나다라"); 		// Key : 2 (방번호-중복 불가) Value : "나다라" (값-중복가능)
		hmap1.put(1, "가나다");
		hmap1.put(3, "다라마");		
		hmap1.put(3, "가가가");
		System.out.println(hmap1);
		
		// 3.putAll (다른 Map객체) : 같은 타입이여야 한다.<Integer , String>
		Map<Integer , String> hmap2 = new TreeMap ();
		hmap2.put(1, "랄랄라");
		System.out.println("putAll 이전  >>>  "+hmap2);
		hmap2.putAll(hmap1);
		System.out.println("putAll 이후  >>>  " + hmap2);
		hmap2.put(4, "캬캬캬");
		System.out.println(hmap2);
		System.out.println();
		
		// 4-1.replace (K key , V value) : 해당 key를 value로 수정(방번호안의 value 값을 수정)
		hmap2.replace(1, "두두두");
		hmap2.replace(5, "두두두");		//수정할 방번호가 없으면 예외가 발생됨.
		System.out.println("replace1 이후  >>>  "+hmap2);
		
		// 4-2 replace (K key , V oldValue , V newValue) : oldValue 값을 newValue로 수정
		hmap2.replace(2, "나다라", "샤샤샤");
		System.out.println("replace2 이후  >>>  " + hmap2);	//oldValue를 정확히 입력 안했을시 작동오류
		System.out.println();
		
		// 5.get(Object key) : key의 값을 넣고 key에 해당하는 값을 가져온다.
		System.out.println(hmap2.get(1));		//방번호를 입력하면 해당 방의 값을 가져온다.
		System.out.println();
		
		// 6.containskey (Object key) : 해당 key가 존재하면 true / 없으면 false
		System.out.println(hmap2.containsKey(2));
		System.out.println(hmap2.containsKey(5));
		System.out.println();
		
		// 7. containsvalue (Object value ) : 해당 값이 존재하면 true / 없으면 false
		System.out.println(hmap2.containsValue("두두두"));
		System.out.println(hmap2.containsValue("뱅뱅뱅"));
		System.out.println();
		
		// 8.Set<K> ketSet() : 키만 추출
		Set<Integer> keyset = hmap2.keySet() ;
		System.out.println(keyset);
		System.out.println();
		
		// 9. Set<Map.Entry<K,V> entrySet(); : Key와 Value -->entry 추출
		Set<Map.Entry<Integer , String>> entrySet = hmap2.entrySet();
		System.out.println(entrySet);
		System.out.println();
		
		// 11.size () : 총 방의 갯수
		System.out.println(hmap2.size()); 		// = entry값이 4
		System.out.println();
		
		// 12-1.remove (Object key) : Key로 값을 삭제
		hmap2.remove(1);
		System.out.println("삭제후  >>>  "+hmap2);
		hmap2.remove(5);
		System.out.println("삭제후  >>>  "+hmap2); 		//방번호가 없어도 오류가 발생되지 않는다.
		
		// 12-2. remove (Object key , Object value ) : key와 value가 정확히 일치해야지만 삭제가된다.
		hmap2.remove(2, "샤샤샤");
		System.out.println("삭제후  >>>  " + hmap2 );
		hmap2.remove(3, "쿵쿵쿵");
		System.out.println("삭제후  >>>  " + hmap2 );		//삭제되지 않는다.
		System.out.println();
		
		// 13.clear : 전체 삭제
		hmap2.clear();
		System.out.println(hmap2);
		
	}

}
