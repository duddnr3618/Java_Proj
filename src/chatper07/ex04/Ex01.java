package chatper07.ex04;

public class Ex01 {
	
	//두 배열의 각 방의 내욜을 더해서 출력
	public static void arrSum (int [] a , int [] b) {
		//for문을 사용해서 각 배열의 값을 더해서 출력하는 식
		
		for ( int i = 0 ; i < b.length ; i++) {
		System.out.print(a[i] + b[i] + " ");		//a의 방이 더 많기 때문에 공집합부분인 b방으로 길이를 정해준다.
		
		}
	}
	public static void main(String[] args) {
		
		
		int [] a ;	//정수배열 a선언 : 0~500까지 7의배수 저장한  
		int [] b ;		// 0~500까지 9의배수 저장
		
		//방의 크기 지정.
		a=new int[500/7];
		b=new int[500/9];
		
		System.out.println("7의 배수");
		for (int i = 0 , j = 7 ; i < a.length ; i++) {
			a[i] = j;
			j+=7;
			
			System.out.print(j+ " ");
		}
		System.out.println("\n\n");
		System.out.println("9의 배수");
		for(int i = 0 , j = 9 ; i< b.length ; i++) {
			b[i]=j;
			j+=9;
			
			System.out.print(j + " ");
			
		}
		System.out.println("\n\n");
		System.out.println("a,b의 방의 갯수" + a.length +" , "+b.length + " \n");	
		
		arrSum(a,b);		//각방의 내용을 더해서 출력
	
	}

}
