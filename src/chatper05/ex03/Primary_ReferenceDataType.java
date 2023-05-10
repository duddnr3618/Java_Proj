package chatper05.ex03;

public class Primary_ReferenceDataType {
	public static void main(String[] args) {
		/*
		 	기본데이터 타입 vs 참조데이터 타입  
		 */
		System.out.println("===1.기본데이터 타입에서 대입 연산(Stack의 값을 복사)===");
		int val1 = 3;
		int val2 = val1;
		val2 = 7;
		System.out.println(val1);	//3출력
		System.out.println(val2);	//7출력
		
		System.out.println("==2.참조데이터 타입에서 대입 연산(Stack의 Heap의 주소를 복사)====");
		int [] arr1 = new int[] {3,4,5};
		int [] arr2 = arr1;
		arr2[0] = 7;
		System.out.println(arr1[0]);		//7출력
		System.out.println(arr2[0]);		//7출력
		//동일한 주소를 가지고 있다.
		System.out.println(arr1);
		System.out.println(arr2);
		
		
	}

}
