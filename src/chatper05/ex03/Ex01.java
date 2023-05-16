package chatper05.ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;		//프로그램을 선택하는 변수 (1,2,3,4)

		do {

			System.out.println("                      1~4번 중 선택하여 번호를 입력하세요");
			System.out.println("=======================================================================");
			System.out.println("1.인풋값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
			System.out.println("2.인풋값을 받아서 방의 크기를 지정하고 1씩증가하도록 값을 넣어주는데 4배수만 뺴고 저장후 출력");
			System.out.println("3.인풋값을 받아서 방의 크기를 지정하고 3의 배수만 지정하는데 그 중 6의 배수인 경우 빼고 저장후 출력");
			System.out.println("4.프로그램 종료");
			System.out.println("========================================================================");
			a = sc.nextInt();

			if (a == 1) {
				int b;
				System.out.println("1.인풋값을 받아서 방의 크기를 지정하고 7,8의 배수를 저장후 출력");
				System.out.println("방의 크기를 정수로 지정해주세요.");
				b = sc.nextInt();
				int[] arr1 = new int[b];
				for (int i = 0; i <= b; i++) {
					if (i%7==0) {
						System.out.println(i + " ");
					}
					 
					

					}

				

			} else if (a == 2) {
				int c;
				System.out.println("인풋 값을 받아서 정수로 방의 크기를 지정해주세요.");
				c = sc.nextInt();
				for (int i = 0; i <= c; i++) {
					if (i % 4 != 0) {
						System.out.print(i + " ");
					}
				}

			} else if (a == 3) {
				int d;
				System.out.println("인풋값을 받아서 정수로 방의 크기를 지정하세요.");
				d = sc.nextInt();
				
				for (int i = 0 ; i <=d ; i++) {
					if(i%3==0 & i%6 !=0) {
						System.out.print(i + " ");
					}
				}

			} else if (a == 4) {
				System.out.println(" 포로그램 종료합니다. ");
				break;
			} else {
				System.out.println("1~4까지 정수를 다시 입력해주세요.");

			}

		} while (true);
		sc.close();
	}

}
