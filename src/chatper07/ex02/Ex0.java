package chatper07.ex02;

class R { 
	void print (int [] a , int b) {
		//배열의 내용을 출력
		System.out.println("========배열의 원본 출력========");
		for ( int i = 0 ; i < a.length ; i++) { 
			System.out.println(a[i] + " ");
		}
		System.out.print("\n\n");
		
		System.out.println("===========인풋 받은 배열 *b 의 내욜을 출려 =========");
		for (int i = 0 ; i < a.length ; i++) {
			System.out.println(a[i] * b + " ");
		}
		System.out.print("\n\n");
	}
}

public class Ex0 {
	
	public static void main(String[] args) {
		
		//객체 생성
		R r1 = new R () ;
		int [] arr1 = new int [] {10,20,30,40,50} ;
		r1.print(arr1, 315);
	}

}
