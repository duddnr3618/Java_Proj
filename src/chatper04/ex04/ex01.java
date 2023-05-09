package chatper04.ex04;

public class ex01 {
	public static void main(String[] args) {
		/*
		 	1000 ~ 1 까지 5씩 감소하면서 출력
		  for / while 문 각각
		  
		 */
		//for 문
		for ( int i = 1000 ; i>1 ; i-=5) { 
			System.out.println(i);
		}
		
		System.out.println("--------------------------------");
		// while
		int a = 1000;
		while (a>1) {
			System.out.println(a);
			a-=5;
		}
	}

}
