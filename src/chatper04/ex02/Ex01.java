package chapter04.ex02;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	/*
	 1.스캐너로 정수 1,2,3을 인풋받아서 
	 1 : 금매달입니다.
	 2 : 은매달입니다.
	 3 : 동매달입니다.
	 4 : 그외 모두 정수 : 메달이 없습니다.
	 -------------------------------------------------------
	 2.스캐너로 문자열 "gold" , "sliver" , "bronze"
	 1.gold : 금메달입니다.
	 2.silver : 은메달입니다.
	 3. bronze : 동메달입니다.
	 4.그외 메달이 없습니다.
	 */
	Scanner sc = new Scanner(System.in);
	int val1;
	
	System.out.println("정수를 입력하세요 >>>");
	val1 = sc.nextInt();
	
	
	switch (val1) {
	case 1 : 
		System.out.println("금메달 입니다.");
		break;
	 case 2 : 
		System.out.println("은메달 입니다.");
		break;
	 case 3 : 
		System.out.println("동메달 입니다.");
		break;
	 default : 
		 System.out.println("메달이 없습니다.");
	} 
	
	System.out.println("-----------------------------------------------");
	
	String str1;
	System.out.println("문자열 gold,silver,bronze를 입력하세요.");
	str1 = sc.next();
	
	switch (str1) {
	case "gold" : //GOLD , Gold 
		System.out.println("금메달 입니다.");
		break;
	case "silver" : 
		System.out.println("은메달 입니다.");
		break;
	case "bronze" : 
		System.out.println("동메달 입니다.");
		break;
	default : 
		System.out.println("메달이 업습니다.");
			}
	
	
	
	
	
}
}
