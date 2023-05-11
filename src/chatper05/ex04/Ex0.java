package chatper05.ex04;

public class Ex0 {
	public static void main(String[] args) {
		/*
		  	arr1 : 4행 100열의 2차원 배열 방을 생성 
			0행 : 10의 배수만 저장
		   	1행 : 3의 배수만 저
 			2행 : 3의 배수지만6의배수는 저장x 
 			3행 : 7의 배수 8의 배수 저장 for문을 통해서 출력
		 */
		// 1.배열선언
		int[][] arr1 = new int[4][100];
		System.out.println("행의 갯수 : " + arr1.length);
		System.out.println("0행의 열갯수 :" + arr1[0].length);
		System.out.println("1행의 열갯수 :" + arr1[1].length);
		System.out.println("2행의 열갯수 :" + arr1[2].length);
		System.out.println("3행의 열갯수 :" + arr1[3].length);

		// 2.배열의 각 행에 값을 저장
		for (int i = 0; i < arr1.length; i++) { // i : 행을 루프 돌린다.
			if (i == 0) {
				for (int j = 0, a = 10; j < arr1[i].length; j++) { // j :열을 루프 돌린다.
					arr1[i][j] = a;
					a += 10;
				}
				System.out.println("\n\n");
			} else if (i == 1) {
				for (int j = 0; j < arr1[i].length; j++) {
					int a = 3;
					arr1[i][j] = a;
					a+=3;			
				}
			
			} else if (i == 2) {
				for (int j = 0,a=3; j < arr1[i].length; a+=3) {
					if ( a%6 == 0) continue;
					arr1[i][j] = a;
						j++;
				}

			} else if (i == 3) {
				for (int j = 0,a=1; j < arr1[i].length; a++) {
					if (a%7==0 || a%8 ==0) {
					arr1 [i][j] = a;
						j++;
					}
					
					
				}

			}
		}
		for (int i = 0 ; i < arr1.length ; i++) {
			for ( int j = 0 ; j < arr1[i].length ; j++) {
				System.out.print(arr1 [i][j] + "  ");
				
			}
		}
	
	}
}
