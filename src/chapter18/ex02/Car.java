package chapter18.ex02;




public class Car {

	String company;
	String carName;
	String carColor;
	int maxSpeed;
	
	
	// 생성자를 통해서 필드의 가밧 입력
	public Car(String company, String carName, String carColor, int maxSpeed) {
		super();				//object 클래스의 기본생성자를 호출
		this.company = company;
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
	}

	//객체 자체를 print 출력시 객체의 필드의 값을 출력하도록 재정의(오버라이딩하여)
	@Override
	public String toString() {
		return "Car [company=" + company + ", carName=" + carName + ", carColor=" + carColor + ", maxSpeed=" + maxSpeed
				+ "]";
	}
	
	
	
	
}
