package chatper05.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr1; // 배열 변수 선언
		int n;
		int idx; // 배열 변수에서 방의 크기를 저장하는 변수
		do {

			System.out.println("                      1~4번 중 선택하여 번호를 입력하세요");
			System.out.println("=======================================================================");
			System.out.println("1.인풋값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
			System.out.println("2.인풋값을 받아서 방의 크기를 지정하고 1씩증가하도록 값을 넣어주는데 4배수만 뺴고 저장후 출력");
			System.out.println("3.인풋값을 받아서 방의 크기를 지정하고 3의 배수만 지정하는데 그 중 6의 배수인 경우 빼고 저장후 출력");
			System.out.println("4.프로그램 종료");
			System.out.println("========================================================================");
			n = sc.nextInt();
			if (n == 1) {
				System.out.println("인풋값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
				System.out.println("배열 방의 크기를 정수 값으로 입력하세요.");
				idx = sc.nextInt();
				arr1 = new int[idx]; // 입력 받은 배열방의 크기를 지정
				int a = 0; // 배열 방의 번호
				for (int i = 1;; i++) { // 조건을 생략하면서 무한루프가 실행 ->배열의 방에 7의 배수와 8의 배수의 값을 저장
					if (i % 7 == 0 | i % 8 == 0) { // i가 계속 루프돌아가면서 7,8의 배수일때
						arr1[a] = i;
						a++; // a : 배열의 방 번호
					}
					if (a == idx)
						break;
				}
				// for문을 사용해서 배열의 각 방의 내용을 출력
				for (int i = 0; i < arr1.length; i++) {
					System.out.print(arr1[i] + " ");
				}
				System.out.print("\n\n");

				// Enhanced for문을 사용해서 출력
				for (int k : arr1) {
					System.out.print(k + " ");
				}
				System.out.println("\n\n");

				// Arrays.toString ()으로 출력
				System.out.println(Arrays.toString(arr1));
///////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (n == 2) {
				System.out.println("인풋값을 받아서 방의 크기를 지정하고 1씩증가하도록 값을 넣어주는데 4배수만 뺴고 저장후 출력");
				System.out.println("배열 방의 크기를 입력하세요.");
				idx = sc.nextInt(); // 배열방의 크기를 입력
				arr1 = new int[idx]; // 배열의 방 크기를 지정
				int i = 0; // 방번호를 지정하는 변수
				int a; // 배열 방에 들어갈 값을 저장하는 변수
				// 배열의 각 방에 값을 저장하는 for문
				for (a = 1;; a++) {
					if (a % 4 == 0)
						continue;
					arr1[i] = a;
					i++;

					if (i == idx)
						break;
				}
				// 배열의 값을 출력 (3가지)
				// 배열의 저장된 내용을 for문으로 출력
				for ( i = 0; i < arr1.length; i++) {
					System.out.print(arr1[i] + " ");
				}
				System.out.println("\n\n");
				// 배열의 저장된 내용을 Enhanced for문으로 출력
				for (int k : arr1) {
					System.out.print(k + " ");
				}
				System.out.println("\n\n");
				// 배열의 저장된 내용을 Arrays.toString 문으로 출력
				System.out.println(Arrays.toString(arr1));
				//////////////////////////////////////////////////////////////////////

			} else if (n == 3) {
				System.out.println("인풋값을 받아서 방의 크기를 지정하고 3의 배수만 지정하는데 그 중 6의 배수인 경우 빼고 저장후 출력");

			} else if (n == 4) {
				System.out.println(".프로그램 종료");

			} else {
				System.out.println("1~4까지 정수를 입력하세요");
			}

		} while (true);
	}
}
