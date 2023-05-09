package chapter03.ex02;

public class BitwiseOperator {
	public static void main(String[] args) {
		/*
		 다양한 진법 표현과 비트연산자.
		 
		 */
		//1.다양한 진법 표현 : 10진수, 16진수,8진수, 2진수 ...
		int data = 13;
		System.out.println(Integer.toBinaryString(data)); // 2진수로 출력.
		System.out.println(Integer.toHexString(data)); // 16진수로 출력.
		System.out.println(Integer.toOctalString(data)); // 8진수로 출력.
		
		System.out.println("------------------------------");
		//2. 2진수,8,16 ->10진수로 표현
		System.out.println(Integer.parseInt("1101", 2));	//13
		System.out.println(Integer.parseInt("15", 8));		//13
		System.out.println(Integer.parseInt("d",16)); 		//13
		
		System.out.println("---------------------------");
		//문자열로 된 숫자를 정수로 변환해서 연산을 한다.
		//clinet 홈에서 -----> 서버로 숫자를 전송
		System.out.println("3"+"5");		//35라는 문자열이 출력
		System.out.println(3+"5");			//35라는 문자열이 출력
		System.out.println(Integer.parseInt("3")+Integer.parseInt("5")); //8출력
		
		
		//문자열로된 실수를 실수형으로 변환
		String a = "13.3";
		String b = "13.4";
		System.out.println(a+b); //13.313.4 출력
		System.out.println(Double.parseDouble(a)+Double.parseDouble(b)); //26.70000.. 출력
		
		System.out.println("----------------------");
		//비트 연산 : &(AND),|(or),^(xor),~(not)
		//1.And연산(&) : 0&0==0 /0&1==0 /1&1==1
		System.out.println(3&10); // 2
		
		//2.Or연산(|) : 0|0 == 0 / 0|1 == 1 / 1|0==1 / 1|1 ==1
		System.out.println(3|10); //11
		
		//3.Xor(^) : 두값이 같을때는 ==0 / 두 값이 다를때는 ==1
		//			0^0== 0 / 0^1== 1 / 1^0== 1 / 1^1 == 0 
		System.out.println(3^10);	//9
		
		//4.Not연산(~) : 정수3 -> ~ -> -4
		System.out.println(~3);		//-4
		System.out.println(~-10); 	//9
		
		
		
		
		
		
		
		
		
		
	}

}
