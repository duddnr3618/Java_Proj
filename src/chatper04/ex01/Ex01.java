package chatper04.ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		// 스캐너로 money를 인풋받아 0~3000 : "걸어서 다닙니다"
		// 3001~30000 : " 지하철을 타고 다닙니다."
		//30000~100000 : "택시를 타고 다닙니다."
		//100000 ~ " 비행기를 타고 다닙니다."
		
		Scanner sc = new Scanner(System.in);
		
		int money;
				
		System.out.println("금액을 입력하세요 >>>");
		
		money = sc.nextInt();
		
		if (money > 0 && money <= 3000) {
			System.out.println("걸어서 다닙니다.");
		} else if (money > 3001 && money <= 30000) {
			System.out.println("지하철을 타고 다닙니다.");
		} else if (money > 30001 && money < 100000) {
			System.out.println("택시를 타고 다닙니다.");
		} else {
				System.out.println("비행기를 타고 다닙니다.");
			}
	sc.close(); // 스캐너 종료 , 메모리에서 삭제	
		
		
	}

}
