package chapter18.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		/*
		 	배열 / 컬렉션(프레임워크) 
		 	배열
		 	-하나의 변수에 많은 값을 저장.
		 	-배열에 동일한 타입의 값을 저장해야한다.
		 	-배열을 선언시 방의 크기를 지정
		 	-배열은 방의 크기가 지정이 되면 수정이 불가능 하다 ->삭제후 새로 생성해야함.
		 	
		 	컬렉션(프레임워크)
		 	-방의 크기를 지정하지 않는다 ( 동적으로 늘어나고 줄어든다)
		 	-동일한 타입의 값을 저장한다.
		 	-제너릭 타입
		 	-제너릭 타입: List<E> : 인터페이스-> 객체화가 불가능 -> 자식을 객체화 하여 타입으로 지정 가능하다.
		 		-index[방번호]를 가진다.
		 	-ArrayList<E> , Vector<E> , LinkedList<E>
		 	
		 */
		
		//1.배열
		String [] arr = new String [] {"가" , "나 " , "다" , "라" , "마" , "바" , "사" };
		System.out.println(arr.length);		// 7개
			
			//배열의 방의 중간의 값을 제거시 자동으로 축소되거나 늘어나지 않는다.
		arr[2] = null;
		arr[5] = null;
		System.out.println(Arrays.toString(arr));		//배열의 중간의 값을 자동으로 제거 되지 않는다.
		
		//2.컬렉션 List<E> 
		List<String> aList = new ArrayList<String>();
		//인터페이스				//List의 메소드를 구현한 구현채
		System.out.println("List의 방의 크기 : " + aList.size()); //방의 크기를 출력
		aList.add("가"); aList.add("나"); aList.add("다"); aList.add("라"); aList.add("마");aList.add("사");
		System.out.println("List의 방의 크기 : " + aList.size());
		
		aList.remove("다");
		aList.remove("바");
		System.out.println("List의 방의 크기 : " + aList.size());
		System.out.println(aList);
		
		
	}

}
