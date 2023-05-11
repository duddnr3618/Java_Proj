package chatper05.ex05;

public class Ex0 {

	public static void main(String[] args) {
		/*
	 	정방형 배열 출력 방법
	 	-for문으로 출력(다중for문 
	 	- Enhanced for문-Enhanced for 
	 	- Array.toString(배열변수) ) 
	 */
	//배열 : 행 3개 열 100개 (index : 0~99번방)
	// 0행 : 1~100까지
	// 1행 : 2의 배수
	// 2행 : 3의 배수
		
		int[][] arr = new int[3][100];

		for (int i = 0; i < arr[0].length; i++) {
		    arr[0][i] = i + 1;
		}

		for (int i = 0; i < arr[1].length; i++) {
		    arr[1][i] = (i + 1) * 2;
		}

		for (int i = 0; i < arr[2].length; i++) {
		    arr[2][i] = (i + 1) * 3;
		}

		for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        System.out.print(arr[i][j] + "\t");
		    }
		    System.out.println();
		}
	}
}
