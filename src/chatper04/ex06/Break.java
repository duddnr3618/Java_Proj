package chapter04.ex06;

public class Break {
	public static void main(String[] args) {
		/*
		 	break 키워드 : 제어문,반복문을 탈출할때 사용하는 키워드
		 	(if/switch/for/while/do while)의 실행블락을 탈출
		 	보통 if문 내에서 break를 사용
		 */
		//1. 단일 loop문에서 break사용
		System.out.println("==================1===========================");
		for (int i = 0 ; i<10; i++) {
			System.out.println("break 사용전 출력"+i);
			 break;
			// System.out.println("break 사용후 출력"); //도달할수 없는 코드
		}
		System.out.println("------------------------------------------------");
		
		// 일반적으로 if조건을 사용해서 break를 사용함
		for (int i = 0 ; i<10; i++) {
			System.out.println("break 사용전 출력"+i);
			 if (i==5) break;
		}
		System.out.println("=========================2========================");
		
		
		//2. 다중 loop문에서 break사용 -> 한 단계만 빠져 나간다.
		for (int i = 0 ; i < 5 ; i++) {
			for (int j = 0 ; j<5 ; j++) {
				System.out.println(i+ " , "+j);
				if (j==2) {
					break;	//for안에서 해당 블락에 있는 for문에서 한 단계만 탈출
				}
			}
		}
		System.out.println("========================3===========================");

		
		//3. 다중 loop문에서 한번에 점프해서 탈출 : LABLE을 사용 해서 점프
		pos1 :for (int i = 0 ; i < 5 ; i++) {
			for (int j = 0 ; j<5 ; j++) {
				System.out.println(i+ " , "+j);
				if (j==2) {
					break pos1;	//pos1 : 두단계 탈출  , 점프 할 위치에 레이블을 넣는다.
				}
			}
		}
		System.out.println("========================4=================================");
		
		
		//4. 변수 값을 조정해서 점프해서 탈출
		for (int i = 0 ; i < 5 ; i++) {
			for (int j = 0 ; j<5 ; j++) {
				System.out.println(i+ " , "+j);
				if (j==2) {
					i = 50; // 바깥족의 탈출 할 조건을 false로 만들어서 탈출(조건을 false로 만든다)
					break;	//한 단계만 탈출
				}
			}
		}
		
	}

}
