package chatper04.ex05.copy;

import java.util.Scanner;

public class ex0 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
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
			  
		  } while (true);
			 
			 System.out.println ("while문을 빠져나왔습니다.");
			 System.out.println ("프로그램이 종료되었습니다.");
		 
		 		sc.close();
		
	}

}
