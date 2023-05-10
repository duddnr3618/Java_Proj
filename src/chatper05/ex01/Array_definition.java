package chatper05.ex01;

public class Array_definition {
	public static void main(String[] args) {
		
		/*
		 	자료형 : 자바는 변수명 앞에 반드시 자료형이 선언되어야 한다.
		 	-기본자료형 : boolean, 정수(byte,short,int,long) , 실수(float,double),문자(char)
		 		->변수명과 같이 stack메모리 영역에 저장됨.
		 		->사용전에 반드시 초기값이 할당 되어 있어야한다.
		 		->첫자가 소문자로 되어있다.
		 		-> == : stack영역의 갑을 비교하는 연산자.
		 	-참조 자료형 :배열/열거/객체(class)/인터페이스
		 		->무한대로 만들수 있다.
		 		->변수명(stack) : Heap영역의 참조 주소값이 변수명에 저장되어있다.
		 		->값 (heap)
		 		-> 참조자료형에서는 == : stack의 값을 비교 (heap에 주소를 비교)
		 		->heap의 값을 비교할때는 equals()를 사용
		 		-heap 영역은 반드시 초기값이 들어 있어야 한다.
		 		-변수 선언만 하고 초기값을 넣지 않더라도 강제로 할당이 됨.
		 		-boolean (false) , 정수(byte,short,int,long) : 0 "초기값" , 실수(float,double) : 0.0 초기값
		 		
		 	배열 : 하나의 배열 변수에 여러개의 값을 할당할수가 있다.
		 		-반드시 방의 갯수를 선언해야된다.
		 		-한번 방의 갯수가 지정되면 늘리거나 줄일수 없다.
		 		-배열의 방번호 : index [0 , 1 ,2 ,...]
		 		-배열의 방 의 갯수 : 배열변수명.length()
		 		-초긱밧을 설정하지 않더라도 자동으로 기본값이 들어감.
		 */
		
		//1.변수 선언 : 하나의 값만 저장됨. 변수에 다른값을 저장할수 없다.
		int a=10;
		int b;
		b=20;
		b=50;
		
		
		//2.배열 선언 : 선언과 동시에 방의 크기를 지정
		int [] arr1 = new int[3];	
		// int [] : 배열 변수에 저장할 자료형 / new : 변수의 값을 Heap영역에 저장하겠다.
		// int [3] : 배열의 방의 갯수를 3개로 지정 / arr1 : 배열변수명
		// index (0,1,2)
		
		//3.배열의 기본값을 출력 : 선언만 해도 강제로 초기값이 heap에 저장됨
		System.out.println(arr1[0]); // arr1배열 변수의 0번방의 값을 출력
		System.out.println(arr1[1]); // arr1배열 변수의 1번방의 값을 출력
		System.out.println(arr1[2]); // arr1배열 변수의 2번방의 값을 출력
		
		//4.배열 방의 값을 저장
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		System.out.println(arr1[0]);	//배열 0방의 값을 출력
		System.out.println(arr1[1]);	//배열 1방의 값을 출력
		System.out.println(arr1[2]);	//배열 2방의 값을 출력
		
		System.out.println("============================================");
		double[] arr2;			//배열변수 선언
		arr2 = new double[6];	//선언 후 방 크기 지정 ->6개방 지정 / index(방번호) :0,1,2,3,4,5
		System.out.println(arr2[0]);	//0.0 기본값.
		
		//배열 변수 arr2 의 각방에 실수를 지정
		arr2[0] = 10.0;
		arr2[1] = 20.0;		//컴파일 오류 : 이클립스에서 자동으로 감지
		arr2[2] = 30.0;		//실행 오류 : 실행시 오류 발생
		arr2[3] = 40.0;
		arr2[4] = 50.0;
		arr2[5] = 60.0; 	//arr[6]을 선언할시 : ArryIndexOutOfBound Exception : 배열의 방번호를 알수 없다
		System.out.println("arr2의 0번째 방의 값 : " + arr2[0]);
		System.out.println("arr2의 1번째 방의 값 : " + arr2[1]);
		System.out.println("arr2의 2번째 방의 값 : " + arr2[2]);
		System.out.println("arr2의 3번째 방의 값 : " + arr2[3]);
		System.out.println("arr2의 4번째 방의 값 : " + arr2[4]);
		System.out.println("arr2의 5번째 방의 값 : " + arr2[5]);
		
		System.out.println("==============for문을 사용해서 배열에 값을 할당 후 출력하기===============");
		//1붙터 100까지 배열 변수에 저장후 합계값을 출력.
		int[] arr3 = new int [100];
		System.out.println(arr3.length); // 배열 방의 갯수를 출력
		//for문을 사용해서 배열 변수의 값을 할당.
		for (int i=0 ; i<100 ; i++) {
			arr3[i] = i+1;					//배열의 각 방에 1,2,3,4,...값을 할당.
			System.out.println("arr3 변수의 [" + i + "] 번째 방의 값을 출력 : " + arr3[i]);	//배열의 각 방에 내용을 출력
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
