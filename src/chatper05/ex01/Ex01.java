package chatper05.ex01;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 	배열방 100개 생성
		 	3의 배수만 저장 후 출력
		 */
		int arr1[] = new int[100];		//index 0~99
		System.out.println(arr1.length); // 방의 갯수를 출력
		System.out.println("==================================================");
		//arr1 배열의 각 방에 값을 지정하는 for
		for (int i = 0 ; i<100 ; i++) { // for (int i = 0 ; arr1.lengh; i++)
			arr1[i] = (i+1)*3;
			System.out.println("arr1 ["+ i+" ]번방의 3의 배수 값은" + arr1[i]);
		}
		
		System.out.println("========Enhanced For : 향상된  for=======");
		//배열의 첫번쨰 방부터 마지막방 까지 자동으로 그 값을 출력할때 사용
		for (int k : arr1) {
			System.out.print(k + " ");
		}
		System.out.print("\n\n");
	}

}

/*
  	int c =100;
  	int[] arr1 = new int [c];			-> index 0~99
  	System.out.println(arr1.length);	->방의 갯수를 출력
  	int a = 0;							-> 3의 배수르 지정하는 변수
  	
  	for (int i= 0 ; i<arr1.length ; i++) {
  	a+=3;
  	arr1pi] =a;
  	}
  	for (int i = 0 ; i < arr1.length ; i++) { 
  	System.out.println("arr1 [" + i + " ]의 값은 : " + arr1[i] );
  
  	
  	
 */