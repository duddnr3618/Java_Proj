package chapter03.ex04;

public class ReationOperator {
	public static void main(String[] args) {
		/*
		 크기 비교 연산자 (<,>,<=,>=,!=,==) / 등가 비교 연산자 (==,!=)
	
		 */
		//1.크기비교 연산자
		System.out.println(5>2); //true
		System.out.println(5<2); //false
		System.out.println(5>=2); //true
		System.out.println(5<=2); //false
		
		System.out.println("----------------------------");
		
		//2.등가비교 연산자. (Stack 메모리의 값을 비교,기본자료형에서 사용)
			//참조 자료형의 값을 비교할때 str1.equals(str2) : Heap영역의 값을 비교한다.
		int a = 5;
		int b = 2;
		int c = 5;
		System.out.println(a==b);	//false
		System.out.println(a!=b);	//true
		System.out.println(a==c);	//true
		System.out.println(a!=c);	//flase
		
		System.out.println("---------------------------------");
		
		//3.참조 자료형일때 등가 연산자의 비교 
		//변수 값은 stack에 저장 Heap의 저장된 값의 주소를 가지고 있다.
		//참조 자료형일때 Heap에 저장된 값을 비교할때는 equals()를 사용한다.
		String str1 = new String ("안녕");
		String str2 = new String ("안녕");
		System.out.println(str1);
		System.out.println(str2);
		//==stack의 str1의 값이 아니라 주소의 값이 들어가 있다.->실제 값은 Heap에 저장되어있다.
		System.out.println(str1 == str2);  // false가 나온다.
		
		//참조 자료형일때 Heap에 저장된 값을 비교하는 메소드 equals()를 사용해서 비교함.
		System.out.println(str1.equals(str2));
		
		
		
	}

}
