package chatper04.ex06.copy;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 스캐너로 번호를 입력 받고 각 프로그램을 작성
		// for문 내에서 스캐너를 인풋받는다.

		Scanner sc = new Scanner(System.in);
		int a;
		do {
			System.out.println("===============================================================");
			System.out.println("1)1~20까지 홀수를 차례대로 출력하는 프로그램");
			System.out.println("2)10이하의 정수를 입력하면 정수만큼 \"JAVA프로그래밍\" 이라고 출력하는 프로그램");
			System.out.println("3)10개의 정수를 입력받아 그 수들중에 짝수의 개수가 몇개인지 출력하는 프로그램");
			System.out.println("4)입력받은 정수만큼 성적을 입력 받아서 총점과 평균을 출력하는 프로그램");
			System.out.println("5)프로그램 종료");
			System.out.println("===============================================================");

			a = sc.nextInt();
			if (a == 1) {
				System.out.println("1)1~20까지 홀수를 차례대로 출력하는 프로그램");
				for (int i = 1; i <=20; i+=2) {
					System.out.print(i+ " ");
					}
				System.out.println("\n\n");
				System.out.println("Type 2----------------------------------------------------");
				for (int i = 1; i<=20 ; i++) {
					if (i % 2 != 0) {
						System.out.print(i+" ");
					}
				}
				System.out.println("\n\n");
				
				

			} else if (a == 2) {
				System.out.println("2)10이하의 정수를 입력하면 정수만큼 \"JAVA프로그래밍\" 이라고 출력하는 프로그램");
				int b;		//스캐너로 10이하의 정수 값을 인풋 받는 변수.
				System.out.println("10이하의 정수를 입력하세요>>>>>");
				b = sc.nextInt();
				for (int i = 1 ; i<=b ; i++) {
					if ( b <= 10 ) {
						System.out.println("JAVA 프로그래밍 : " + i);
					} 
					}
					

					
				

			} else if (a == 3)  {
				System.out.println("3)10개의 정수를 입력받아 그 수들중에 짝수의 개수가 몇개인지 출력하는 프로그램");
				int c , count=0 ;			//c : 스캐너로 받아서 저장하는 변수 , count : 짝수만 카운팅하는 변수
				for (int i = 1 ; i <= 10 ; i++) { //기본변수형일때는 초기값을 미리 선언해야한다.
					c = sc.nextInt();
					if (c==0) {
						continue ;
						}
					if (c%2==0) {
						count++;
					}
				}
				System.out.printf("입력받은 짝수는 %d입니다.",count);
				System.out.print("\n\n");
				
				
				
			} else if (a == 4) {
				System.out.println("4)입력받은 정수만큼 성적을 입력 받아서 총점과 평균을 출력하는 프로그램");
				System.out.println("몇개의 성적을 작성할지 정수로 입력해주세요.");
				int d ,e , sum = 0 , count = 0; //d : 성적의 갯수 / e : 점수를 담을 변수 -> for문을 사용해서 스캐너로 인풋
				d=sc.nextInt();					//sum : 인풋받은 점수를 합하는 변수 /count : 각 과목의 갯수 == d 
				System.out.println("각 과목의 점수를 입력한 갯수만큼 공백을 사용하여 넣어주세요");
				for (int i = 1 ; i <= d ; i++) {
					e = sc.nextInt();
					sum += e; //sum = sum + e
					count ++;
				}
				double avg = (double) sum/count; //정수/정수이기때문에 정수가 나온다.
				System.out.printf("입력 과목의 수는%d이고 합계는 %d이고 평균은 %2.1f입니다.",count,sum,avg);
				

			} else if (a == 5) {
				System.out.println("5)프로그램 종료");
				break;
			} else
				System.out.println("잘못 입력했습니다. 1~5사이의 정수를 입력해주세요.");

		} while (true);
		System.out.println("while문을 빠져나왔습니다.");
		System.out.println("프로그램이 종료되었습니다.");

		sc.close();
	}
}