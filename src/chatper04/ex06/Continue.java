package chapter04.ex06;

public class Continue {
	public static void main(String[] args) {
		/*
		 * continue : 제어문 내에서 break와 비슷하게 사용되는 키워드 break : 실행문을 탈출 / continue : 아래구문을
		 * 실행시키지 않고 증감식을 실행
		 */

		// 1.단일 loop에서 continue
		System.out.println("========1.단일 loop에서 continue========");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			continue;
			// System.out.println(i); //도달할수 없는 코드 이므로 오류발생 : if조건을 사용
		}
		System.out.println("======if조건과 continue를 같이 사용=========");
		for (int i = 0; i < 5; i++) {
			System.out.println("continue 작동전 - " + i);
			if (i == 3)
				continue;
			System.out.println("continue 작동후 - " + i);
		}

		// 2. 다중(2중) loop에서 continue : 한 단계만 continue된다.
		System.out.println("========= 다중(2중) loop에서 continue ========");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 3)
					continue;
				System.out.println(i + " , " + j);

			}
		}

		// 3. 다중(이중) loop에서 continue : LABLE을 사용해서 점프가 작동됨.
		System.out.println("=====다중(이중) loop에서 continue : LABLE을 사용해서 점프가 작동됨.=====");
		pos2:for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2)
					continue pos2; // j가 2가 되며는 다시 i로 넘어가 i는 증가하지만 j는 3,4가 출력되지 않는다.
				System.out.println(i + " , " + j);
			}
		}

	}

}
