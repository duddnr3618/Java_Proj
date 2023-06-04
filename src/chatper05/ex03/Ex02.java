package chatper05.ex03;

public class Ex02 {
	public static void main(String[] args) {

		/*
		 * 배열방 1000개 생성(정수) 4의 배수 값으로 지정 / 8의 배수는 x 출력 = 10개씩 끊어서 출력 (for문)
		 * 
		 */
		int[] arr1 = new int[1000]; // 배열방 1000개 생성 , index : 0 ~ 999

		// 각 배열 방에 값을 할당.
		for (int i = 0, a = 1;; a++) { // i : 배열의 방번호 / a: 배열의 값.
			if (i == 1000)
				break;

			if (a % 4 == 0 && a % 8 != 0) {
				arr1[i] = a;
				i++;

			}

		}
		for (int i = 0; i < arr1.length; i++) { //출력
			System.out.print(arr1[i] + " ");
			if ( (i +1)%10 ==0 ) {
				System.out.println("\n");
			}
			
		}

	}
}