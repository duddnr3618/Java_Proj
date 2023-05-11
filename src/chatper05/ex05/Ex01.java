package chatper05.ex05;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		// 2차원 정방형 배열
		// 4행 200열 배열 선언
		// 0행 : 5의배수
		// 1행 : 3의배수
		// 2행 : 7,8의배수
		// 3행 : 4와7의배수
		// 출력 for / E-for / Arrays

		int[][] arr1 = new int[4][200];
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {
				for (int j = 0; j < arr1[i].length; j++) {
					arr1[i][j] = (1 + j) * 5;
				}

			} else if (i == 1) {
				for (int j = 0; j < arr1[i].length; j++) {
					arr1[i][j] = (1 + j) * 3;
				}

			} else if (i == 2) {
				for (int j = 0, a = 1; j < arr1[i].length; a++) {
					if (a % 7 == 0 || a % 8 == 0) {
						arr1[i][j] = a;
						j++;
					}

				}

			} else if (i == 3) {
				for (int j = 0; j < arr1[i].length; j++) {
					arr1[i][j] = (1 + j) * 28;
				}

			}
		}
		System.out.println("1.for문 사용");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println("\n");
		}
		System.out.println("============================================");
		System.out.println("2.E-for문 사용");
		for (int[] k : arr1) {
			for (int a : k) {
				System.out.print(a + " ");
			}
			System.out.println("\n");
		}
		System.out.println("=============================================");
		System.out.println("3.Arrays 사용");
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		System.out.println(Arrays.toString(arr1[2]));
		System.out.println(Arrays.toString(arr1[3]));

	}

}
