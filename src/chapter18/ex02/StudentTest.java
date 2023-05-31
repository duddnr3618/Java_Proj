package chapter18.ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		//ArrayList 변수 선언 : <Student>
		List <Student> aList = new ArrayList ();
		//콘솔로부터 값을 인풋
		Scanner sc = new Scanner(System.in);
		
		boolean run = true ;
		int studentNum = 0 ;	// 스캐너로 학생 수를 인풋
		
		while (run) {
			
			System.out.println("===================================================");
			System.out.println("1.학생수 | 2.점수 | 3.점수리스트 | 4.분석 | 5.프로그램종료");
			System.out.println("===================================================");
			System.out.println("위의 번호 중 하나를 입력하세요. >>>>>>");
			int select = sc.nextInt() ;
			
			if ( select == 1) {
				System.out.println("학생수를 입력해주세요. >>>>");
				studentNum= sc.nextInt();
				System.out.println("입력하신 학생의 수 : " + studentNum );
				System.out.println();
				
			}else if (select ==2 ) {	//학생수에 대한 각각의 student객체를 생성후 점수를 입력하고 aList에 저장
										//학생수가 먼저 입력하지 않으면 처리가 안된다.
				
				System.out.println("입력하신 학생의 수 : " + studentNum + "명 입니다.");
				System.out.println();
				for ( int i = 1 ; i <= studentNum ; i++) {
					System.out.println(studentNum +"명의 점수를 입력해주세요. >>>>>");
					int a = sc.nextInt();
					Student si = new Student();
					si.setScore(a);
					aList.add(si);
				}
				
				
			}else if (select == 3) {	//점수의 리스트를 출력(aList의 Student객체) 
				for ( int i = 0 ; i < aList.size() ; i++) {
					System.out.println(aList.get(i).getScore());
				}
				
				
			}else if (select == 4) {	//List중 최대 점수와 평균을 출력
				double avg = 0.0 ;
				int max = 0 ;	
				int sum = 0;
				for ( int i = 0 ; i < aList.size() ; i++) {
					Student student = aList.get(i);
					int score = student.getScore();
					sum += score;										
					
					if ( max < score) {
						max = score ;
						avg = (double)sum/aList.size();
					}
				}
				System.out.println("학생중 최대 점수 : " + max + "입니다.");
				System.out.println("학생들의 평균 : " + avg + "입니다.");
			}else if (select == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("1~5까지 정수를 입력해주세요.");
			}
			
			
			
			
		}
		
		
		
		
	}

}
