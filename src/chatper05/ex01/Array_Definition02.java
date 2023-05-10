package chatper05.ex01;

public class Array_Definition02 {
	public static void main(String[] args) {
		/*
		 * 배열 선언 3가지 방법
		 */

		System.out.println("========== 1.배열 선언과 동시에 값을 할당. =============");

		int[] arr1 = new int[] { 10, 20, 30, 40, 50 };

		// 출력 for문을 사용
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\n\n");

		// 출력 Enhanced for를 사용해서 출력

		for (int c : arr1) {
			System.out.print(c + " ");
		}
		System.out.println("\n\n");
		
		System.out.println("================= 2.배열 선언과 동시에 값 할당.================== ");
		
		int [] arr2 = {11,22,33,44,55,66,77};
		//for문으로 출력
		for (int i = 0 ; i<arr2.length ; i++) { 
			System.out.print(arr2[i] + " ");
		}
		System.out.println("\n\n");
	
		//Enhanced for문으로 출력
		for (int k : arr2) { 
			System.out.print(k + " ");
		}
		System.out.println("\n\n");
		
		
	
	}

}
