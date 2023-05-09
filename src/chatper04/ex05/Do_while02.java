package chatper04.ex05;

import java.util.Scanner;

public class Do_while02 {
	public static void main(String[] args) {
		/*
		 do while문을 사용하여 무한루프를 돌린다.
		 do while문 내에서 if를 사용
		 4번을 누르면 무한루프 종료하게 프로그램밍 ( 4번을 누르기 전까지 무한 루프)
		 스캐너에서 정수 값을 입력 
		 1번 : " 평균출력 "
		 2번 : " 합계출력 "
		 3번 : " 이름출력 "  
		 */
		
		Scanner sc = new Scanner (System.in);
		int a ;
		System.out.println("-------------------------------------------");
		System.out.println("1.평균출력 | 2.합계출력 | 3.이름출력 | 4.프로그램종료");
		System.out.println("-------------------------------------------");
		System.out.println("위의 번호를 입력 하세요.>>>>>>>>>>");
		a = sc.nextInt();
		
		do {
			if (a ==1 ) {
			System.out.println("평균출력");
			} else if (a==2) { 
			System.out.println("합계출력");
			} else if (a==3) {
			System.out.println("이름출력");
			} else {
				System.out.println("프로그램종료");
				{break;}
			}
		}while (true);
		 System.out.println ("while문을 빠져나왔습니다.");
		 System.out.println ("프로그램이 종료되었습니다.");
		 
		
	
		sc.close();
	}

}
/*
 * ex0참조
  Scanner sc = new Scanner(system.in);
  int a ;
  do {
	  
	  System.out.println("-------------------------------------------");
	  System.out.println("1.평균출력 | 2.합계출력 | 3.이름출력 | 4.프로그램종료");
	  System.out.println("-------------------------------------------");
	  System.out.println("위의 번호를 입력 하세요.>>>>>>>>>>");
	  a = sc.nextInt(); // 콘솔에서 정수를 인풋받아서 a변수에 할당.
	  
	  if (a==1) {
	  System.out.println ("평균출력");
	  }else if (a==2) {
	  System.out.println ("합계출력");
	  }else if (a==3) {
	  System.out.println ("이름출력");
	  }else if (a==4) {
	  System.out.println ("프로그램 종료");
	  {break;}
	  }else {
	  System.out.println ("잘못입력했습니다.(1~4번까지 정수를 입력하세요)");
	  }
	  
  }while (true);
	 
	 System.out.println ("while문을 빠져나왔습니다.");
	 System.out.println ("프로그램이 종료되었습니다.");
 
 		sc.close();
*/
