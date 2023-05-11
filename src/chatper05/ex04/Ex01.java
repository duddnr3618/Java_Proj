package chatper05.ex04;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * arr1 : 4행 100열의 2차원 배열 방을 생성
		 *  0행 : 10의 배수만 저장 
		 *  1행 : 3의 배수만 저장 
		 *  2행 : 3의 배수지만6의배수는 저장x 
		 *  3행 : 7의 배수 8의 배수 저장 for문을 통해서 출력
		 */
		// 1.배열선언
		int[][] arr1 = new int[4][100];
		System.out.println("행의 갯수 : " + arr1.length);
		System.out.println("0행의 갯수 :" + arr1[0].length);
		System.out.println("1행의 갯수 :" + arr1[1].length);
		System.out.println("2행의 갯수 :" + arr1[2].length);
		System.out.println("3행의 갯수 :" + arr1[3].length);

		// 2.배열의 각 행에 값을 저장
		for (int i = 0; i < arr1[0].length; i++) { // i : 행을 루프 돌린다.
			
			
			arr1[0][i] = (i + 1) * 10;
		}
		for (int i = 0; i < arr1[0].length; i++) {
			if (arr1[0][i] % 10 == 0) {
				System.out.print(arr1[0][i] + " ");
			}

		}

		System.out.println("");
		System.out.println("================================================");
		for (int i = 0; i < arr1[1].length; i++) {
			arr1[1][i] = (i + 1) * 3;
		}

		for (int i = 0; i < arr1[1].length; i++) {
			if (arr1[1][i] % 3 == 0) {
				System.out.print(arr1[1][i] + " ");
			}
		}

		System.out.println("");
		System.out.println("================================================");
		for (int i = 0; i < arr1[2].length; i++) {
			arr1[2][i] = (i + 1) * 3;
			;
		}
		for (int i = 0; i < arr1[2].length; i++) {
			if (arr1[2][i] % 3 == 0 && arr1[2][i] % 6 != 0) {
				System.out.print(arr1[2][i] + " ");
			}
		}

		System.out.println("");
		System.out.println("==================================================");
		for (int i = 0; i < arr1[3].length; i++) {
			arr1[3][i] = (i + 1) * 3;
			;
		}
		for (int i = 0; i < arr1[3].length; i++) {
			if (arr1[3][i] % 7 == 0 || arr1[3][i] % 8 == 0) {
				System.out.print(arr1[2][i] + " ");
			}
		}
	}

}
