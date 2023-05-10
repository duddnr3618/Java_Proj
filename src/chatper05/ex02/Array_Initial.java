package chatper05.ex02;

import java.util.Arrays;

public class Array_Initial {
public static void main(String[] args) {
	
	/*
	 	배열의 초기값 지정 : 
	 	참조자료형 : boolean:false , 정수(byte,short,int,long) : 0
	 				실수 (float,double) : 0.0 , 문자(char) : 공백
	 				String :NULL
	 */
	//1.Stack 메모리값 (강제 초기화가 되지 않음) : 기본 자료형값
	int val1; 	//변수선언
	//System.out.println(val1); // 오류발생 : 변수에 기본값을 할당하지 않아서 오류발생.
	
	int [] val2 ; // 배열선언 
	//System.out.println(val2);	//오류발생 : Heap영역이 생성되지 않은 상태 -> new int[3]
	val2 =new int[3];			//방의 갯수 지정
	System.out.println(val2); 	//갹체의 힙영역의 주소가 출력됨./16진수
	
	//방의 값 출력
	System.out.println(val2[0]);
	System.out.println(val2[1]);
	System.out.println(val2[2]);
	
	int [] val3 = null;		//참조 자료형일때만 객체주소에 null값을 할당 가능하다.
	System.out.println(val3);
	val3 = new int[4];		//객체 자체를 출력할때 stack에 저장된 heap에 주소 : 16진수
	System.out.println(val3); //heap 영역의 주소를 출력

	//2.Heap 메모리값 (강제 초기화됨) : 참조 자료형의 값
	
	boolean[] a = new boolean [3];
	System.out.println( a);			//기본 값 : false
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	
	System.out.println("========================================");
	
	int [] b = new int [3];			//기본 초기값 : 0
	System.out.println(b[0]);
	System.out.println(b[1]);
	System.out.println(b[2]);
	
	System.out.println("==========================================");
	
	double [] c = new double [3];		//기본 초기값 : 0.0
	System.out.println(c[0]);
	System.out.println(c[1]);
	System.out.println(c[2]);
	
	System.out.println("==========================================");
	char[ ] d = new char[3];					//기본 초기값 : 공백
	System.out.println("char 기본값은 공백 " + d[0]);		
	System.out.println("char 기본값은 공백 " + d[1]);
	System.out.println("char 기본값은 공백 " + d[2]);
	
	System.out.println("===========================================");
	
	String [] e = new String[3] ;			//기본 초기값 : null : 0이 아니다.
	System.out.println(e[0]);
	System.out.println(e[1]);
	System.out.println(e[2]);
	
	System.out.println("=======================================");
	// Arrays.toString(배열변수); : 배열안의 모든 값을 출력
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	System.out.println(Arrays.toString(c));
	System.out.println(Arrays.toString(d));
	System.out.println(Arrays.toString(e));
	
	
	
	
	
	
}
}
