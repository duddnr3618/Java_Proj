package chatper04.ex03.copy;

public class For_statement03 {
	public static void main(String[] args) {
		/*
		 	이중 for 문을 사용 해서 구구단을 출력.
		 	--for - for
		 */
		
		int i,j ;  // i : 단을 출력하는 변수 / j : 1~9까지 출력되는 변수
		for (i = 1 ; i <10 ; i++) { // 단을 출력하는 블락
			System.out.println(i + " 단 출력");
			System.out.println("-----------------------------------");
			for ( j = 1 ; j<10 ; j++) {
				System.out.println(i + " * " + j + " = " + i*j );
			}
			System.out.println();
		}
		
	}

}
