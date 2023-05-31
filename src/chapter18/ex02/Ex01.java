package chapter18.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

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
						if ( studentNum == 0) {
							System.out.println("학생수를 1명 이상 입력해주세요.");
						}else {
							for ( int i = 1 ; i <= studentNum ; i++) {
								Student stu = new Student ();		//Student 객체생성
								System.out.println(i+"번 학생의 점수를 입력해주세요. >>>>");
								int score = sc.nextInt();		//스캐너로 점수를 인풋
								stu.setScore(score);
								aList.add(stu);
							}
							System.out.println("학생의 점수 입력이 완료되었습니다.");
							System.out.println();
						}
						
						
					}else if (select == 3) {	//점수의 리스트를 출력(aList의 Student객체) 
						if ( studentNum == 0) {
							System.out.println("학생수를 1명 이상 입력 후 점수를 입력해주세요.");
							
						} else {		//aList의 stu객체를 끄집어 내서 출력
							for ( int i = 0 ; i < aList.size() ; i++) {
								System.out.println(aList.get(i).getScore());
								
						}
						}
						
					}else if (select == 4) {	//List중 최대 점수와 평균을 출력
						int maxScore = 0;
						int sum = 0;
						double avg = 0.0;
						
						if (studentNum == 0) {
						System.out.println("학생수를 1명 이상 입력 후 점수를 입력해주세요.");
						}else {
						//aList에 Student 객체의 getScore을 사용해서 점수를 끄집어낸다.
							for ( int i = 0 ; i < aList.size() ; i++) {
								Student stu = aList.get(i) ;
								
								//점수 : 객체의 getter를 통해서 점수를 받아준다.
								int score = stu.getScore();
								sum += score ;	//sum = sum + score
								
						//최대점수를 maxScore 변수에 할당 : if . 삼항연산자
						if ( score > maxScore) {
							maxScore = score ;
							avg = (double) sum/aList.size();
						}
						}
							System.out.println("최대점수는 : " + maxScore);
							System.out.println("평균값은 : " + avg);
						}
						
					}else if (select == 5) {
						System.out.println("프로그램을 종료합니다.");
						break;
					}else {
						System.out.println("1~5까지 정수를 입력해주세요.");
					}
					
				} 
		
	}

}
