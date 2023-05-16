package chatper07.ex02;

class E {
	//a : 배열  / b : a배열에 각 방에 값에 곱을 해주는 인자
	//배열의 각 방의 값을 b인자로 곱해서 출력.
	void print (int [] a , int b) {
		for ( int i = 0 ; i  < a.length ; i++) {
			System.out.print(a[i] *b + " ");
		}
		System.out.print("\n\n");
	}
	int mul ( int a , int b) {
		return a*b;
	}
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		E e1 = new E () ;
		int [] arr1 = new int [] {10,20,30};
		e1.print(arr1, 5);
		
	}
}
