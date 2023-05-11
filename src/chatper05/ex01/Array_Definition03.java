package chatper05.ex01;

public class Array_Definition03 {
	public static void main(String[] args) {
		
		/*
		 	1차원 배열 선언 3가지 방법
		 */
		
		System.out.println("1.방법");
		int[] arr1;			//배열변수 선언
		arr1 = new int [3];	//배열 방의 크기를 생성

		int arr4 [ ];
		arr4 = new int [3];
		
		int [] arr2 = new int [3];	//선언과 동시에 배열방 크기생성 
		
		int arr3 [] = new int [3];
		
		arr4[0]=1; //방에 값을 할당.
		
		System.out.println("2.방법");
		//배열을 선언과 동시에 값을 할당.
		//방 크기를 지정하면 안된다.
		int [] arr5 = new int [] {10,20,30}; // 배열 선언과 동시에 값을 할당.
		
		int [] arr6 ;
		arr6 = new int [] {10,20,30,};

		
		System.out.println("3.방법");
		// 선언과 동시에 값을 바로 할당.
		int [] arr7 = {10,20,30};
		int [] arr8;
		//arr8 = {10,20,30};		//오류발생
		arr8 = new int []{10,20,30};
	}

}
