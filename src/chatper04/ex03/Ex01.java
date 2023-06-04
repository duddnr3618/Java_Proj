package chapter04.ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 스캐너로 1~9까지 정수를 인풋받아 for문을 사용해 
		 인풋 받은 단수를 출력 (println , printf)
		 */
		//println
		Scanner sc = new Scanner (System.in);
		int a;
		System.out.println("1~9까지 정수를 입력하세요.>>>");
		a = sc.nextInt();
		for (int b=1; b<10 ; b++ ) {
			System.out.println(a + " * " + b + " = " + a*b );
		}
	
		System.out.println("---------------------------------------------------------------");
		
		for (int b = 1; b<10 ; b++) {
			System.out.printf("%d * %d = %d \n" ,a,b,a*b );
		}
	sc.close();	
	}
/* 교수님 예시
  사용할 변수 선언 : i , j
 int i,j;
 system.out.printin("출력할 단수(1~9)정수를 입력하세요. ");
 i = sc.nextInt(); // 콘솔로부터 단수를 입력받아 i변수에 할당.
 
 for (j = 1 ; j<10 ; j++) {
 system.out.printin (i + " * " + j + " =  " +  i*j);
 system.out.printf ("%d * %d = %d \n" , i , j , i*j );
 } 

 */
}
