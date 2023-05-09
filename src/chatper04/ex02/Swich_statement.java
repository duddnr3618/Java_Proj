package chatper04.ex02;

public class Swich_statement {
public static void main(String[] args) {
	/*
	 switch	- if문은 참()일경우 실행블락{}을 실행후 break; 가 자동으로 작동(기본적으로 case문 내에서 break;를 사용한다.)
	 		-switch 문은 실행후 해당 블락을 빠져나오지 않는다.
	 		->강제로 해당블락을 빠져나오도록 break;을 넣어주어야 한다.	 
	 		break; -> if,switch,for,while,do while 문의 실행블락{}내에서 실행블락을 빠져 나올떄 사용
	 */
	// 1. switch 문에서 break;를 사용하지 않는 경우 switch의 값이 case로 점프해서 출력후 모두 출력.
	int val1 = 2;
	switch (val1) {					// 해당 값으로 가서 그 밑으로 다 출력.
	case 1 : 
		System.out.println("A");	// B,C,D,F출력
	case 2 : 
		System.out.println("B");
	case 3 :
		System.out.println("C");
	case 4 :
		System.out.println("D");
	default : 
		System.out.println("F"); 	//case에 값이 존재하지 않는경우 출력.
		
	}
	
	System.out.println("--------------break;를 사용 하는경우---------------------");
	// 2.swich 문에서 break;을 사용하는 경우 -> 해당 블락만 출력.
	int val2 = 4;
	switch (val2) {
	case 1 : 
		System.out.println("A"); 
		break;
	case 2 : 
		System.out.println("B"); 
		break;
	case 3 : 
		System.out.println("C"); 
		break;
	case 4 : 
		System.out.println("D"); 
		break;
	default :
		System.out.println("F");
		break;
				}
	System.out.println("----------------switch문 if else문으로 변환-----------");
	// switch문은 if else문으로 변환 가능하다.
	if (val2==1) {
		System.out.println("A");
	} else if (val2 ==2) {
		System.out.println("B");
	} else if (val2 ==3) {
		System.out.println("C");
	} else if (val2 ==4) { 
		System.out.println("D");
	} else {
		System.out.println("F");
	}
	
}
}
