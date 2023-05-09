package chapter03.ex01;

public class ArithmeticOperator {
	public static void main(String[] args) {
		/*
		 산술 연산자 : +,-,*,/,%(나머지값만 출력)
		 
		 증감 연산자 : ++(1씩 증가),--(1식감소) -> 변수 앞,뒤 할당
		 */
		//1.산술연산자.
		int a = 5;
		int b = 10;
		System.out.println(2+3); //정수 :5 출력
		System.out.println(a+b); //정수 :15 출력
		System.out.println(2+(double)3); // 2:정수 3:실수 -> 실수로 출력(업캐스팅) =5.0
		System.out.println(8%5); //나머지 : 3 출력 ->if,for 2의배수,3의배수
		System.out.println(8/5); //몫 : 1 출력 (int)
		System.out.println(8/5.0); //몫 : 1.6 출력 (double)
		System.out.println((int)(8/5.0)); //몫 : 1 출력 
		
		//2.증감연산자 : ++ ,--
		int val1 = 3;
		val1++;
		System.out.println(val1); //4출력
		val1--;
		System.out.println(val1); //3출력
		int val2 =3;
		++val2;
		System.out.println(val2);
		--val2 ;
		System.out.println(val2);
		System.out.println("------------------------------------");
		int val3 = 3;
		int val4 = val3++;
		System.out.println(val4); // 3 출력 : 변수 뒤에 ++온경우 ->그 이후에 연산됨
		
		int val5 = 3;
		int val6 = ++val5;
		System.out.println(val6); // 4 출력 : 변수 앞에 ++온경우
		
		System.out.println("---------------------------------------");
		int val7 = 3;
		int val8 = 4;
		int val9 = 2 + val7-- + ++val8; 
		System.out.println(val9);// 2+3+5 = 10출력 
		
		int val10 = 30;
		int val11 = 40;
		int val12 = 50;
		int val13 = 7 + --val10 + ++val11 + val12--; //7 + 29 + 41 + 50
		System.out.println(val12); //49 
		System.out.println(val13); //127
		
		
		
		
		
		
		
		
		
		
	}

}
