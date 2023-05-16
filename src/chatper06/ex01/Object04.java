package chatper06.ex01;

class Car{
	// 기본생성자.
	public Car () {}
	
	//필드생성자.(속성)
	String company ;
	String carName ;
	String carColor ;
	int carSpeed;
	double carWeight;
	
	
	//메소드(기능)
	public void stop () {
		System.out.println(carName + "차가 멈춥니다. ");
	}
	public void start () {
		System.out.println(carName + "차가 달립니다. ");
	}
	public void print () {
		System.out.println("회사명 : " + company);
		System.out.println("차명 : " + carName);
		System.out.println("차 색깔 : " + carColor);
		System.out.println("차 스피드 : " + carSpeed);
		System.out.println("차 무게 : " + carWeight+"t\n");
	}
	
	
}

public class Object04 {
	public static void main(String[] args) {
		//c1 객체 : 현대자동차 / 그랜져 / 검정색 / 250 / 1.0톤
		//c2 객체 : 쌍용자동차 / 투싼 / 노란색 / 300 / 2.0톤
		//c3 객체 : 기아자동차 / K9 / 흰색 / 350 / 2.5톤

		//각 객체의 매소드 출력
		//c1객체
		Car c1 = new Car();
		
		//객체 자체를 출력 할 경우 :  객체의 Heap주소가 출력됨. : 패키지이름.클래스@주소(16진수)
		System.out.println(c1);
		
		//객체의 필드값 저장.
		c1.company = "현대자동차";
		c1.carName = "그랜져";
		c1.carColor = "검정색";
		c1.carSpeed = 250;
		c1.carWeight = 1.0;
		
		c1.stop();
		c1.start();
		c1.print();
		
		Car c2 = new Car();
		c2.company = "쌍용자동차";
		c2.carName = "투싼";
		c2.carColor = "노란색";
		c2.carSpeed = 300;
		c2.carWeight = 2.0;
		
		c2.stop();
		c2.start();
		c2.print();
		
		Car c3 = new Car();
		c3.company = "기아차";
		c3.carName = "K9";
		c3.carColor = "흰색";
		c3.carSpeed = 350;
		c3.carWeight = 2.5;
		
		c3.stop();
		c3.start();
		c3.print();
		
		//객체를 배열에 저장후 출력
		//c1,c2,c3 객체를 1차월 배열에 저장
		
		//배열 선언 : Car 객체를 저장.
		Car[] arr1 = new Car[3];		//arr1은 Car객체를 저장.
		
		//배열의 각 방에 Car 객체를 저장.
		arr1 [0] = c1;
		arr1 [1] = c2;
		arr1 [2] = c3;
		
		System.out.println("====================================\n");
		//배열의 저장된 각 방에 객체를 다시 끄집어 낸다.
		System.out.println(c1);
		Car out1 = arr1[0] ;	//arr1의 0번방에 객체 c1을 out1으로 끄집어 낸다.
		Car out2 = arr1[1] ;	//arr1의 1번방에 객체 c2을 out2으로 끄집어 낸다.
		Car out3 = arr1[2] ;	//arr1의 2번방에 객체 c3을 out3으로 끄집어 낸다.
		
		System.out.println(out1);
		out1.print();
		
		System.out.println(out2);
		out2.print();
		
		System.out.println(out3);
		out3.print();
		
		
		
		
	}

}
