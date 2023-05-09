package chatper04.ex05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		//스캐너로 받아서 출력 (4번을 누를떄까지 무한루프)
				//do while if for-for문
		//ctrl + shilf + f = 코드를 자동으로 정렬
		//ctrl + alt + 화살표(up,down) : 선택된 라인 복사
		//art + 화살표(up,down) : 선택라인을 이동 
				
				 Scanner sc = new Scanner(System.in);
				 int a ;
				
				 do {
					 
			
				 System.out.println("------------------------------------------------");
				 System.out.println("1.구구단출력 | 2.19단 출력 | 3.7배수단 출력 | 4.프로그램종료");
				 System.out.println("------------------------------------------------");
				 System.out.println("위의 번호를 입력 하세요.>>>>>>>>>>");
				 sc.nextInt();
				  
				 if(a==1) { 
					 System.out.println("-----구구단 출력-----");
					 for (int i=1; i<10 ; i++) {
						 System.out.println(i + "단");
					 for (int j = 1; j<10; j++) {
						 System.out.println(i + " * " + j + " = " + i*j);
					 }
					 System.out.println();
					 }
					 
				 }else if(a==2) {
					 for (int i=1; i<20 ; i++) {
						 System.out.println(i + "단");
					 for (int j = 1; j<20; j++) {
						 System.out.println(i + " * " + j + " = " + i*j);
					 }
				 }else if (a==3) {
					 System.out.println("7의 배수단 출력");
					 for (int i=1 ; i<20 ; i++) {
						 if(i%7 ==0) {
							 System.out.println(i+"단");
						for (int j=1; j<10;j++) {
							System.out.println(i + " * " + j + " = " + i*j);
						}
						 }
						 }
					
					 
					 
				 }else if(a==4) {
					 System.out.println("프로그램종료");
					 {break;}
					 
				 }else {
					 System.out.println("1~4까지의 정수만 입력하세요.");
					 
				 }
				  
				  
				  
				  
				  
				 }while (true);
				 System.out.println(" while 탈출");
				 sc.close();
				 
				
	}

}
