package chapter02.ex05;

public class TypeCasting {
	public static void main(String[] args) {
		/*
		 타입 캐스팅(Type Casting) : 정수형->실수형 / 실수형->정수형 ... 자동으로 변경
		 -낮은 자료형---->높은 자료형 
		 :byte -> short -> int -> long ->float ->double
		 -업캐스팅		: 자동으로 변환 (낮은 자료형->높은 자료형)
		 -다운캐스팅	: 자동으로 변환되지 않아 수동으로 명시해야한다.(높은자료형->낮은자료형)
		 
 
		 */
		
		//1.캐스팅 방법 
		//int val1 = 4.3; //오류발생 val1= int 이므로 실수를 넣으면 오류가 발생.
		int val2 =(int) 4.3; //다운캐스팅:실수->정수 (4.3->4)
		System.out.println(val2);
		
		double val3 =3; //업캐스팅이 자동으로 됨. 정수 -> 실수(3->3.0)
		System.out.println(val3);
		
		//다운 캐스팅이 필요함. (수동작업)
		int val4 = (int)5.8;
		long val5 =(long) 10.000344;
		System.out.println(val4);
		System.out.println(val5);  // 한 라인 복사 : ctrl + aart + 화살표
		
		//업캐스팅(자동)
		float val6 = 5;			//float val6 = (float)5; ->생략이 가능하다.
		double val7 = 10; 
		System.out.println(val6);
		System.out.println(val7);
		
		
		
	}

}
