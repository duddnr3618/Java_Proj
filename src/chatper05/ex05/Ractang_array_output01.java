package chatper05.ex05;

import java.util.Arrays;

public class Ractang_array_output01 {

	public static void main(String[] args) {
		/*
		 * 정방형 배열 출력 방법 
		 * -for문으로 출력 다중for문 
		 * - Enhanced for문-Enhanced for -
		 * Array.toString(배열변수) 
		 */
		// 배열 : 행 3개 열 100개 (index : 0~99번방)
		// 0행 : 1~100까지
		// 1행 : 2의 배수
		// 2행 : 3의 배수

		// 배열선언
		int[][] arr1 = new int[3][100];
		System.out.println(arr1.length); // 행의 갯수 : 3
		System.out.println(arr1[0].length); // 열의 갯수 : 100
		System.out.println(arr1[1].length); // 열의 갯수 : 100
		System.out.println(arr1[2].length); // 열의 갯수 : 100

		// 배열의 각 방에 값 지정
		for (int i = 0; i < arr1.length; i++) { // 행을 루프
			if (i == 0) { // 1~100까지 각 방에
				for (int j = 0; j < arr1[i].length; j++) { // 한 행의 열을 루프
					arr1[i][j] = 1 + j;
				}

			} else if (i == 1) {
				for (int j = 0; j < arr1[i].length; j++) {
					arr1[i][j] = (1 + j) * 2;
				}

			} else if (i == 2) {
				for (int j = 0; j < arr1[i].length; j++) {
					arr1[i][j] = (1 + j) * 3;
				}

			}
		}
		
		System.out.println("============================1.2중 for문 사용================================");
		for (int i = 0 ; i < arr1.length ; i++) {
			for (int j = 0 ; j < arr1[i].length ; j++) {
				if(j<99) {
				System.out.print(arr1[i][j] + ", " );
			}else {
				System.out.print(arr1[i][j]);
				
			}
			}	
			System.out.println();
		}
		
		System.out.println("============================2.Enhanced for문 사용================================");
		for (int[] k : arr1 ) {
			for (int a : k) {
				System.out.print(a + ", ");
			}
			System.out.println();
		}
		
		
		System.out.println("============================3.Arrays사용================================");
		// Arrays.toString()
		System.out.println(Arrays.toString(arr1[0])); // 0행의 값
		System.out.println(Arrays.toString(arr1[1])); // 1행의 값
		System.out.println(Arrays.toString(arr1[2])); // 2행의 값
	}
}
		
