package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		//스캐너 등록 (ctrl + shift + o)
		Scanner sc = new Scanner(System.in);
		//프로그램 선택변수
		int select ; //1.학점의 합계/평균을 출력 , 2.홀수/짝수 확인 , 3.같은 이름 식별
		
		//국어,영어,수학 점수를 인풋받는 변수 선언
		int kor;
		int eng;
		int math;
		
		// 하나의 정수값을 입력받아 홀,짝 인지 확인하는 프로그램에 사용하는 변수
		int a ;
		
		// 두변수의 값을 받아서 같은 이름인지 확인하는 프로그램
		String aName;
		String bName;
		
		System.out.println("-----------------------------------------------");
		System.out.println("1. 학점의 합계 / 평균 | 2. 홀수/짝수 | 3. 같은이름 식별");
		System.out.println("-----------------------------------------------");
		
		//사용자로부터 프로그램 선택
		select = sc.nextInt();
		
		//if 조건으로 프로그램을 실행
		if (1 == select) {
			System.out.println("1번 항목을 출력했습니다.");
			System.out.println("국어점수를 입력하세요.");
			kor = sc.nextInt();
			System.out.println("영어점수를 입력하세요.");
			eng = sc.nextInt();
			System.out.println("수학점수를 입력하세요.");
			math = sc.nextInt();
			//스캐너로 부터 국어/영어/수학 점수를 인풋받아 합계와 평균을 출력
			int sum = kor + eng + math ;
			double avg = sum / 3.0 ; 
			System.out.printf("학점의 총점은 %d이고 평균은 %3.1f 입니다. \n",sum ,avg);
			
		
		} else if (2 == select) {
			System.out.println("2번 항복을 출력했습니다."); //a변수에 정수값을 인풋받아서 홀/짝인지 출력
			System.out.println("정수 값을 입력하세요.");
			a = sc.nextInt();
			int b = a%2; 
			String strc = (b==0) ? "짝수" : "홀수" ;
			System.out.printf("입력하신 정수 값은 %s입니다. \n",strc);
			//system.out.println ( (a % 2 == 0 ) ? "짝수" : "홀수 " ;
		
		
		} else if (3 == select) {
			System.out.println("3번 항목을 출력했습니다."); //aName, bName의 두 변수의 문자열을 인풋받아서 같은 이름인지 식별 
			
			System.out.println("이름 입력하세요.");
			aName = sc.next();
			System.out.println("또다른 이름을 입력하세요.");
			bName = sc.next();
			String strd = (aName.equals(bName)) ? "같습니다." : "다릅니다.";
			System.out.printf("두 이름은 %s " , strd);
			//system.out.println ("문자열 2개를 공백/엔터 로 구분해서 입력해주세요"
			//aName = sc.next(); 
			//bName = sc.next();
			//if (aName.equals(bName)) { // String에서 두 값을 비교하는 것이 Heap에 저장된 값
			//System.out/println ("두값은 같은 값입니다.");
			//} else {
			//System.out/println ("두값은 다른값입니다."); }
		}
		
		
		//스캐너 종료 : 사용후 메모리에서 제거
		sc.close();
	}

}
