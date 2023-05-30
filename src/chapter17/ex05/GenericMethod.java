package chapter17.ex05;

class GenericMethod1 {	//일반클래스
	
	//제너릭 메소드 : 일반 메소드 안에 제너릭 메소드가 들어가야 한다.
	public <T> T method (T t) {
		return t;
	}
	
	public <T> boolean method2 (T t1 , T t2) {
		return t1.equals(t2);		//스택의 값을 비교 ,String equals() 메소드가 Heap의 값을 비교하도록 재정의 되어있다.
		
	}
	
	public <K , V> void method3 ( K k , V v) {		//매개변수 2개
		System.out.println(k + " : " + v);
	}
	
	public <K ,V> void method4 () {
		System.out.println("반드시 타입을 지정해서 호출 되어야함 : 메소드의 매개변수에서 타입을 유추할수 없기 때문");
	}
	
}

public class GenericMethod {

	public static void main(String[] args) {
		/*
		 	제너릭 메소드 : 제너릭 클래스 내에는 제너릭 매소드를 만들수 없다.
		 		-일반 클래스에 제너릭 메소드가 생성된다.
		 		-1)객체를 생성해서 메소드 호출시 <타입> 지정후 호출 
		 		-2)제너릭 메소드의 인풋값이 타입을 유추할수 있는경우 메소드 호출시 타입을 생략가능
		 */
		
		//제너릭 메소드 호출
		GenericMethod1 gm = new GenericMethod1 ();
		String str1 = gm.<String> method("안녕");		//제너릭 메소드 : 메소드를 호출시 타입을 지정해서 호출
		String str2 = gm.method("오늘");				//제너릭 메소드 : 매개변수로 들어오는 값이 타입을 유추할수 있을때 메소드 호출시 타입을 생략가능.	
		
		System.out.println(str1);
		System.out.println(str2);
		
		Integer i1 = gm.<Integer> method(10);	//제너릭 메소드 호출 : 타입을 지정해서 호출
		Integer i2 = gm.method(20);		//제너릭 메소드 호출 : 타입을 유추할수 있을때 타입을 생략가능
		
		System.out.println(i1);
		System.out.println(i1+i2);
		
		System.out.println("=====================================");
		
		Boolean bool1 = gm.<String> method2 ("오늘" , "오늘");
		Boolean bool2 = gm. method2 ("오늘" , "오늘");
		System.out.println(bool1);
		System.out.println(bool2);
		
		System.out.println("=====================================");
		
		gm.<String , Integer > method3 ("국어" , 80);
		gm. method3 ("수학" , 50);
		gm.method3(404, "요청한 문서를 찾을 수 없습니다.");
		gm.method3("학점의 평균은", 88.8);
		
		System.out.println("====================================");
		
		gm.<String , Integer> method4 () ;
		gm. method4 () ;
		
		
		
	}

}
