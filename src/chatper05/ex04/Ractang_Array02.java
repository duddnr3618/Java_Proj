package chatper05.ex04;

public class Ractang_Array02 {

	public static void main(String[] args) {
		/*
		 	2차원 정방형 배열 : 선언방법 3가지
		 	
		 */
		System.out.println("=== 선언방법(1)=== ");
		//선언후 방크기 지정
		int [][] arr1; // 배열변수 선언
		arr1 = new int[3][4] ; // 방크기 지정
		// 선언과 동시에 방크기 지정
		int[][] arr2 = new int[3][4];
		int arr3[][] = new int [3][4];
		int [] arr4 [] = new int [3][4];
		
		System.out.println("=== 선언방법(2)=== ");
		//선언과 동시에 값 넣기
		int [][] arr5 = new int [][] {{1,2,3,4},{10,20,30,40}};
		
		int [][] arr6;
		arr6 = new int [][] {{1,2,3} , {11,22,33},{100,200,300},{1000,2000,3000}};
		
		System.out.println("=== 선언방법(3)=== ");
		//선언과 동시에 값넣기
		int [][] arr7 = { {1,2,3,4,5} , {11,22,33,44,55} , {10,20,30,40,50} , {12,13,14,15,16} };
		
		//오류발생
		int [][] arr8 ;
		//arr8 = { {1,2,3,4,5} , {11,22,33,44,55} , {10,20,30,40,50} , {12,13,14,15,16} }; 
		//오류발생
		
		
	}

}
