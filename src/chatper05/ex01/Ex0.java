package chatper05.ex01;

public class Ex0 {
public static void main(String[] args) {
	

	
	
  	int c =100;
  	int[] arr1 = new int [c];			//	-> index 0~99
  	System.out.println(arr1.length);	//	->방의 갯수를 출력
  	int a = 0;							//	-> 3의 배수르 지정하는 변수
  	
  	for (int i= 0 ; i<arr1.length ; i++) {//for문을 사용해 각 방에 값을 저장
  	a+=3;
  	arr1[i] =a;
  	}
  	for (int i = 0 ; i < arr1.length ; i++) { //for문을 사용해 각방에 값을 출력
  	System.out.println("arr1 [" + i + " ]의 값은 : " + arr1[i] );
  	}
  	
  	System.out.println("================================================");
  	
  
  	}

}
