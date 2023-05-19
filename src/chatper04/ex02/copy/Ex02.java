package chatper04.ex02.copy;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 스캐너로 월을 인풋 받아서 (정수 1~12월)
		인풋받은 월을 "해당월  __월이고 , __일 까지 존재합니다."  
		1,3,5,7,8,10,12 : 31일 2: 28일 그외 : 30일 
		 */
		System.out.println("-------------------case 문 안에서 출력 --------------------------");
		Scanner sc = new Scanner(System.in);
		int month;
		int day = 30;
		System.out.println("정수로 1~12까지 월을 입력해주세요.");
		month = sc.nextInt();
		
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			System.out.println("해당 월은 " +month+"월이고 , 31일 까지 존재합니다.\n\n");
		break;
		case 2 :
			System.out.println("해당 월은 "+ month+"월이고 , 28일까지 존재합니다.\n\n");
			break;
			default :
				System.out.println("해당 월은 "+ month+"월이고 30일까지 존재합니다.\n\n");
	
		}
		
		/*
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
		  day = 31; // day +=1;
			System.out.printf("해당 월은 %d이고 , %d일 까지 존재합니다\n\n",month ,day);
			break;
		case 2 :
			day = 28; // day -=2;
			System.out.printf("해당 월은 %d이고 , %d일 까지 존재합니다.\n\n",month,day);
			break;
		default :
			day = 30; // 
				System.out.printf("해당 월은 %d이고 , %d까지 존자합니다.\n\n",month,day);
		
		 
		 */				
			System.out.println("-------------------case 문 밖에서 출력 --------------------------");
			
			System.out.printf("해당 월은 %d이고 , %d까지 존재합니다.\n\n",month,day);		
										
		
		
		sc.close();
		
	}

}
