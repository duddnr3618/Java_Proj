package chatper07.ex02;

class Methodoverriding {
	//메소드 오버라이딩 : 부모클래스의 메소드를 재정의 해서 사용
	
	//기본생성자 : 객체를 생성할때 필드의 초기값 ->다른 생성자가 없을때 생략시 호출가능 / 다른생성자가 존재할때 생략시 호출불가능
	Methodoverriding () {} //생략시 밑에 오류
	
	//새로 정의한 생성자. : 매개변수로 인풋값을 아규먼트로 받아서 필드에 로드.
	Methodoverriding (String a , String b , String c , int d , double e){
		company = a;
		model =b ;
		color =c ;
		maxSpeed = d;
		weight = e;
	}
	
	String company ; 
	String model;
	String color ;
	int maxSpeed ;
	double weight;
	
	//객체 자체를 출력시 객체의 Heap주소를 출력하는 것이 아니라 그 객체의 메모리 내용(값)을 출력
	//Object클래스의 toSting메소드를 overriding한다.
	@Override
	public String toString() {
	
		return "회사명 : " + company + " , 차 모델 : " + model + " , 색 : " + color + " , 최대속도 : " + 
		maxSpeed + ", 차의 무게 : " + weight ;
	}
}

public class Method06 {

	public static void main(String[] args) {
		/*
		 * Object 클래스 : 모든 자바 클래스의 최상의 부모 클래스
		 	-모든 클래스는 object클래스의 필드와 메소드를 상송받는다.
		 	-자식 클래스는 object클래스의 피드와 메소드를 사용할수 있다.
		 	-toString() 메소드는 객체 자체를 출력할때 toString ()이 작동된다.
		 		->자식클래스에서 toString 메소드를 재정의해서 사용한다.
		 		->그 객체의 필드의 값을 출력할때 많이 사용됨.
		 */	
		
		//기본생성자 호출후 출력 
		Methodoverriding m1 = new Methodoverriding () ;
		System.out.println(m1);
		System.out.println(m1.toString());

		//사용자 정의 생성자 호출후 출력
		Methodoverriding m2 = new Methodoverriding ("현대","그렌져","검정색",250,1000.0) ;
		Methodoverriding m3 = new Methodoverriding ("기아","k9","흰색",350,2000.0) ;
		Methodoverriding m4 = new Methodoverriding ("삼성","sm5","초록",270,1500.0) ;
		Methodoverriding m5 = new Methodoverriding ("쌍용","채어맨","회색",400,1800.0) ;
		
		System.out.println("==============================================================");
		//각 객체의 필의 값을 출력
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		
		
		
		
	}

}
