package chapter02.ex03;

public class RangOfVariable {
	public static void main(String[] args) {
		
		//변수의 사용 범위 : 블락에서 선언되면 그 블락 까지가 사용범위
		
		int val1 = 3; //전역변수 
		{ //if , for, while , do while : 블락 내부에서 선언된 변수는 지역변수 : 블락내에사만 사용가능
			
			int val2 = 5; //지격변수
			System.out.println(val1);
			System.out.println(val2);
			
		}
		
		System.out.println(val1);
	//	System.out.println(val2); // 오류 발생 (val1:전역변수 , val2:지역변수 )
		
		
	}

}
