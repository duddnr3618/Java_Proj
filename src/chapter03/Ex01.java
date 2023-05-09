package chapter03;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	
	/*
	  문제1) 삼항 연산자를 사용하여 스캐너로 정수값을 인풋 받고 그 값이 홀수인경우 홀수 짝수인 경우 짝수
	  로 출력 :  " 지금 넣은 값은 ----이고 홀수/짝수 입니다. " 
	  
	  문제2) 스캐너로 인풋받은 값이 3,,6,9 의 배수이면 " 3,6,9의 배수입니다."
	  "지금 넣은 값이 3,6,9의 배수가 아닙니다"
	 */
	
	//ex1)
	Scanner sc = new Scanner(System.in);
	
	int val1 ;  //입력 받은 수
	System.out.println("정수 값을 입력하세요 >>> ");
	val1 = sc.nextInt();
	System.out.println((val1%2==0) ? "짝수입니다" : " 홀수 입니다.");
	
	//ex2)
	System.out.println("또 다른 정수 값 하나를 넣어주세요 >>>");
	val1 = sc.nextInt();
	System.out.println((val1%3==0 || val1%6==0 || val1%9==0) ?  "369의 배수입니다." : "369의 배수가 아닙니다.");
	
	
	
}
	
}
