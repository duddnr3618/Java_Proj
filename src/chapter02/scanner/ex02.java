package chapter02.scanner;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		//1.스캐너 등록
		//2.우리가족의 이름(String) 및 몸무게(double)를 인풋 받고 몸무게 총 합과 평균을 구해서 프로그램을 작성
		//sc.nextDouble();
		
		Scanner sc = new Scanner(System.in);
		String name1 ;
		String name2 ;
		String name3 ;
		String name4 ;
		
		double weith1 ;
		double weith2 ;
		double weith3 ;
		double weith4 ;

		System.out.println("아버지의 이름의 이름을 입력하세요 >>> ");
		name1 = sc.next();
		System.out.println("어머니의 이름의 이름을 입력하세요 >>> ");
		name2 = sc.next();
		System.out.println("형제의 이름의 이름을 입력하세요 >>> ");
		name3 = sc.next();
		System.out.println("나의 이름의 이름을 입력하세요 >>> ");
		name4 = sc.next();
		

		System.out.println("아버지의 몸무게를 입력하세요 >>> ");
		weith1 = sc.nextDouble();
		System.out.println("어머니의 몸무게를 입력하세요 >>> ");
		weith2 = sc.nextDouble();
		System.out.println("형제의 몸무게를 입력하세요 >>> ");
		weith3 = sc.nextDouble();
		System.out.println("나의 몸무게를 입력하세요 >>> ");
		weith4 = sc.nextDouble();
		
		double sum = weith1 + weith2 + weith3 + weith4 ;
		double avg = sum / 4.0 ; 
		
		
		System.out.printf("우리 가족의 몸무게의 합은 %3.2f 이고 , 평균운 %3.2f 입니다."
				,sum,avg);		
				
	}


}
