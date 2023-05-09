package chapter03.ex06;

public class ConditionalOperator {
	public static void main(String[] args) {
		/*
		 삼항 연산자 : if ~ else 를 축약해서 한 라인으로 사용하는 구문
		 (조건) ?  참 (실행 ) : 거짓 (실행) ; 
		 */
		
		int val1  = (3>5) ? 6:9;
		System.out.println(val1);		//9 출력 (조건이 거짓->val1에 9가 할당)
		
		int val2 = (3<5) ? 6:9 ;
		System.out.println(val2);		//6 출력 (조건이 참->val2에 6이 할당)
		
		
		
		
	}

}
