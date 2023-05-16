package chatper07.ex02;

class C { 

	void print (int [] a , double [] b) {
		
		//a배열의 값을 for문으로 출력
		for ( int i = 0 ; i < a.length ; i++) {
			System.out.println("정수형 배열");
			System.out.print(a[i] + " ");
		}
		System.out.print("\n\n");
		
		//b배열의 값을 for문으로 출력
		for ( int  j = 0 ;j < b.length ; j++) {
			System.out.println("double형 배열");
			System.out.print(b[j]+ " ");
		}
		System.out.println();
			
		
	}
}

public class Ex01 {
	public static void main(String[] args) {
		//1.객체생성
		C c1 = new C () ;
		//2.배열생성
		int [] arr1 = new int [] {100,200,300,400,500} ;
		
		c1.print(arr1, new double [] { 1.1,2.2,3.3,4.4,5.5});
		
	}

}
