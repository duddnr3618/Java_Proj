package chatper05.ex06;

import java.util.Arrays;

public class Non_Raectang01 {

	public static void main(String[] args) {
		/*
		 * 2차월 배열 -정방형 배열 : 각 행의 대해서 열의 갯수가 같은배열 
		 * -비정방형 배열 : 각 행의 대해서 열의 갯수가 각 각 다른 배열
		 */
		// 1.비정방형 배열 선언 : 배열 변수를 생성시 행의 방번호만 지정후 나중에 각 행에대해서 열의 방 번호를 지정한다.
		int[][] arr1 = new int[3][]; // 행의 크기만 지정
		arr1[0] = new int[5]; // 0번 행의 열의 갯수를 지정한다. -> 0번 행의 5개 열 지정
		arr1[1] = new int[2]; // 1번 행의 열의 갯수를 지정한다. -> 1번 행의 2개 열 지정
		arr1[2] = new int[4]; // 2번 행의 열의 갯수를 지정한다. -> 2번 행의 4개 열 지정

		// 직접 값을 할당.
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		arr1[0][3] = 40;
		arr1[0][4] = 50;

		arr1[1][0] = 11;
		arr1[1][1] = 12;

		arr1[2][0] = 100;
		arr1[2][1] = 200;
		arr1[2][2] = 300;
		arr1[2][3] = 400;
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		System.out.println(Arrays.toString(arr1[2]));

		System.err.println("=====================================");
		int[][] arr2 = new int[3][]; // 비정방형배열 선언
		arr2[0] = new int[100]; // 10의배수
		arr2[1] = new int[200]; // 20의배수
		arr2[2] = new int[300]; // 30의 배수

		System.out.println(arr2.length); // 행의 갯수 출력 : 3개
		System.out.println(arr2[0].length); // 0행의 열의 갯수 출력 : 100개
		System.out.println(arr2[1].length); // 1행의 열의 갯수 출력 : 200개
		System.out.println(arr2[2].length); // 1행의 열의 갯수 출력 : 300개

		// 2중 for문을 사용 해서 값을 저장
		for (int i = 0; i < arr2.length; i++) {
			if (i == 0) {
				for (int j = 0, a = 10; j < arr2[i].length; j++, a += 10) {
					arr2[i][j] = a;
				}
			} else if (i == 1) {
				for (int j = 0, a = 20; j < arr2[i].length; a += 20, j++) {
					arr2[i][j] = a;
				}

			} else if (i == 2) {
				for (int j = 0, a = 30; j < arr2[i].length; j++, a += 30) {
					arr2[i][j] = a;
				}

			}

		}
		System.out.println("============for문을 사용해서 출력===============");
		for(int i=0 ; i <arr2.length; i++) {
			for(int j=0 ; j <arr2[i].length; j++) {
				
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("============E-for문을 사용해서 출력===============");
		for(int [] k : arr2 ) {
			for (int a : k) {
				System.out.print(a + " ");
			}
		}
		System.out.println();

			
			System.out.println("============Arrays 사용해서 출력===============");
			for (int i = 0 ; i < arr2.length ; i++) {
				System.out.println(Arrays.toString(arr2[i]));
				
					
				
			}
	}

}
