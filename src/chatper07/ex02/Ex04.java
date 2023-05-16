package chatper07.ex02;

class F { // 메소드 생성
	// 1.두배열의 각 방에 내용을 더해서 출력하는
	// 2.두배열의 각 방에 내용을 뺴서 출력하는
	// 3.두배열의 각 방에 내용을 곱해서 출력하는
	// 4.두배열의 각 방에 내용을 나누어서 출력하는
	void plus(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + b[i] + " ");
		}

	}

	void minus(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] - b[i] + " ");
		}

	}

	void mul(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] * b[i] + " ");
		}

	}

	void div(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			System.out.print((double) (a[i] /(double)  b[i]) + " ");
		}

	}

}

public class Ex04 {

	public static void main(String[] args) {
		// 1. 정수를 담는 배열방 arr1의 방100개 생성 : 7의 배수만 저장
		// 2. 정수를 담는 배열벙 arr2의 방100개 생성 : 4의 배수만 저장 , 8의 배수는 제외
		// 3. 각 메소드 호출후 출력
		// 1.정수를 담는 배열 arr1방 100개를 생성
		int[] arr1 = new int[100];
		// for문을 사용해서 7의 배수를 저장 / j : 7의 배수를 저장하는 변수
		for (int i = 0, j = 7; i < arr1.length; i++, j += 7) {
			arr1[i] = j;
			System.out.print(j + " ");

		}
		System.out.print("\n\n");

		int[] arr2 = new int[100];
		for (int i = 0, j = 4; true; j += 4) {
			if (j % 8 != 0) {
				arr2[i] = j;
				i++;
				System.out.print(j + " ");
			}
			if (i == 100)
				break;
		}
		System.out.print("\n\n");
		System.out.println("마지막 방 출력 : " + arr1[99]);
		System.out.println("마지막 방 출력 : " + arr2[99]);

		System.out.print("\n\n");
		F f1 = new F();
		f1.plus(arr1, arr2);
		
		System.out.print("\n\n");
		f1.minus(arr1, arr2);

		System.out.print("\n\n");
		f1.mul(arr1, arr2);

		System.out.print("\n\n");
		f1.div(arr1, arr2);

	}
}
