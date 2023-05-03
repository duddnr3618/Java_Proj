package chapter02.scanner;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 1. Scanner 등록
		// 2. 아버지 이름, 어머니 이름 , 형제 이름 , 자신 이름 : sc.next();
		// 3. 아버지 나이 , 어머니 나이 , 형제 나이 , 자신 나이 : sc.nextInt();
		// 4. 스캐너로 받은 변수의 값을 출력
		// 5. 전체 나이의 합과 평균을 소수점 2자리수 이하로 출력
		
		Scanner sc = new Scanner(System.in);
		
		String name1 ; 
		String name2 ;
		String name3 ;
		String name4 ; 
		
		int age1 ;
		int age2 ;
		int age3 ;
		int age4 ;
		
		System.out.println("아버지의 이름을 입력하세요 >>> ");
		name1 = sc.next();
		System.out.println("어머니의 이름을 입력하세요 >>> ");
		name2 = sc.next();
		System.out.println("형제의 이름을 입력하세요 >>>");
		name3 = sc.next();
		System.out.println("자신의 이름을 입력하세요 >>>");
		name4 = sc.next();
		
		//한번에 인풋 받기
		//system.out.println("아버지이름 어머니이름 형제이름 나의이름을 공백을 구분해서 입력을 해서요 >>>>")
		//name1 = sc.next();
		//name2 = sc.next();
		//name3 = sc.next();
		//name4 = sc.next();
		
		
		System.out.println("아버지의 나이를 입력하세요 >>> ");
		age1 = sc.nextInt();
		System.out.println("어머니의 나이를 입력하세요 >>> ");
		age2 = sc.nextInt();
		System.out.println("형제의 나이를 입력하세요 >>> ");
		age3 = sc.nextInt();
		System.out.println("나의 나이를 입력하세요 >>> ");
		age4 = sc.nextInt();
		
		int sum = age1 + age2 + age3 + age4 ;
		double avg = sum / 4.0 ;
		
		System.out.printf("입력한 아버지의 이름은 %s , 나이는 %d 이고 , 어머니의 이름은 %s , 나이는 %d 이고, 형제의 이름은 %s , 나이는 %d 이고, 나의 이름은 %s , 나이는 %d 입니다.\n"
				,name1,age1,name2,age2,name3,age3,name4,age4);
		System.out.printf("전체 나이의 합계는 %d 이고 , 평균은 %3.2f 입니다.",sum,avg);
								
		
		
		
	}

}
