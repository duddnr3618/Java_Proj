package chatper04.ex03.copy;

public class Ex02 {public static void main(String[] args) {
	/*
	 	구구단 출력
	 	2충 for문을 사용하여 구구단을 출력
	 	"1단 
	 	1*1 = 1 1*2 = 2  .... 1*9 = 9 (\t)해서 출력
	 	2*1 ....
	 	...
	 */
	int i,j;
	for( i = 1 ; i<10 ; i++) {
		System.out.println(i + "단의 구구단 ");
	for (j=1 ; j<10 ; j++) {
		System.out.print( i + " * " + j + " = " + i*j + " \t" );
	
	}System.out.println( ); System.out.println( );
	
}
	for (i = 1 ; i<10 ; i++) {
		System.out.println(i + " 단 ");
		for (j=1;j<10;j++) {
			System.out.printf("%d * %d = %d \t", i,j,i*j);
		} System.out.println(); System.out.println();
	}
}
}
