package chapter18.ex04;

import java.util.Set;
import java.util.TreeSet;

//일반 클래스는 TreeSet에 넣을경우 정렬이 되지 않는다.
class MyClass {
	int data1;
	int data2;
	
	//생성자로부터 필드에 값 할당.
	MyClass (int data1 , int data2) {
		this.data1 = data1;
		this.data2 = data2;
				
	}
	@Override
	public String toString() {
		return data1 + " ";
	}
	
}

//MyClass2는 TreeSet에 넣을때 특정필드가 정렬되어 저장하기 
class MyClass2 implements Comparable <MyClass2> {
	
	int data1;
	int data2;
	
	//생성자로부터 필드에 값 할당.
	MyClass2 (int data1 , int data2) {
		this.data1 = data1;
		this.data2 = data2;
				
	}
	
	//comparable을 오버라이딩 하여 compareTo로 재정의 
	
	//오름차순 or 내림차순 둘중 하나만 적용 가능
	@Override
	public int compareTo(MyClass2 o) {
		/*
		//오름차순 정렬해서 저장
		if (this.data1 < o.data1 ) {
			return -1;
			
		}else if (this.data1 == o.data1) {
			return 0;
			
		}else {
			return 1;
			
		}
		*/
		//내림차순 정렬해서 저장
		if (this.data1 < o.data1 ) {
			return 1;
			
		}else if (this.data1 == o.data1) {
			return 0;
			
		}else {
			return -1;
			
		}
		
		
	}
	
	@Override
	public String toString() {
		return data1 + " ";
	}
	
}

class MyClass3 implements Comparable<MyClass3> {
	String data1;
	String data2;
	
	//생성자를 사용해서 필드의 값 입력
	MyClass3 (String data1 , String data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public int compareTo(MyClass3 o) {
		
	//방법1	
		return (this.data1).compareTo(o.data1); 		//오름차순정렬
	}
	@Override
	public String toString() {
		return " " + data1 + " ";
	}
	 
	//방법2
	/*
	 	//오름차순 정렬
		
		if(this.data1.charAt(0) < o.data1.charAt(0)) {
			return -1;
		}else if (this.data1.charAt(0) == o.data1.charAt(0)) {
			return 0;
		}else {
			return 1;
		}
		
		//내림차순 정렬
		 
		if(this.data1.charAt(0) < o.data1.charAt(0)) {
			return 1;
		}else if (this.data1.charAt(0) == o.data1.charAt(0)) {
			return 0;
		}else {
			return -1;
		}
		*/
		
		
}



public class TreeSetMethod03 {

	public static void main(String[] args) {
		
		/*
		 	TreeSet <E> 
		 		-Set 인터페이스를 구현한 클래스
		 		-중복된 값을 넣을수 없다.
		 		-방번호 존재하지 않는다.
		 		-값이 정렬되어서 저장된다(오름차순정렬).
		 		-검색/정렬의 기능(메소드)이 있다.
		 		
		 		-wapper class / String : 자동으로 정렬된다.
		 		-일반 클래스를 TreeSet에 저장할때 특정 컬럼은 정렬해서 저장되도록 하기 위해서 Comparable<E> 인터페이스 사용
		 		-Comparable<E> 인터페이스를 구현해서 compareTo()메소드를 오버라이딩해 특정컬럼이 정렬되어 들어가도록 설계
		 		 
		 		
		 */
		
		//Wapper class TreeSet에 저장하면 자동으로 오름차순으로 정렬되어 저장
		Set<String> set1 = new TreeSet ();
		set1.add("하"); set1.add("카"); set1.add("a"); set1.add("b"); set1.add("c");set1.add("가"); 
		System.out.println(set1);
		
		Set<Integer> set2 = new TreeSet ();
		set2.add(1); set2.add(2); set2.add(864); set2.add(55); set2.add(2); set2.add(300);
		System.out.println(set2);
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		//특정 객체를 TreeSet에 넣으면 정렬되어 저장되지 않는다.
		// -Comparable <E> 인터페이스를 구현해서 compareTo() 메소드를 오버라이딩 해서 특정 컬럼이 정렬되도록 설계
		// -중복되지 않기 위해서는 Object 클래수의 equals() , hashCode() 메소드를 정의해야한다.
		
		
	
		//MyClass2은 정렬되어 들어간다. ->Comparable인터페이스의 compareTo() 오버라이딩으로 재정의 하여 정렬되게함. 
		Set<MyClass2> mset2 = new TreeSet ();
		mset2.add(new MyClass2 (1,1)); mset2.add(new MyClass2 (2,2)); 
		mset2.add(new MyClass2 (3,3)); mset2.add(new MyClass2 (5,5));
		mset2.add(new MyClass2 (2,2)); 
		System.out.println(mset2);
		
		System.out.println();
		System.out.println("=================================");
		Set<MyClass3> mset3 = new TreeSet ();
		mset3.add(new MyClass3 ("다" , "다"));
		mset3.add(new MyClass3 ("나" , "다"));
		mset3.add(new MyClass3 ("가" , "다"));
		mset3.add(new MyClass3 ("마" , "다"));
		mset3.add(new MyClass3 ("라" , "다"));
		System.out.println(mset3);
		
	}

}
