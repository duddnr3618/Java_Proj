package chatper07.ex04;

class Car {
	//각 생성자에서 값을 할당 할 때 초기값을 로드 각 필드의 기본값을 할당.
	//this(); 메소드를 사용해서 인풋받은 값을 넣어서 출력.
	//기본 생성자의 초기값
	Car () {
		company = "회사명 없음";
		carName = "차명 없음";
		carColor = "차색 등록안됨";
		carDoor = 0;
		carWeight = 0.0;				
	}
	
	//매개변수가 1개인 경우
	Car (String company) {
		this ();
		this.company = company;
	}

	//매개변수가 2개인경우
	Car (String company , String carName) {
		this (company);
		this.carName = carName;		
	}
	//매개변수가 3개인경우
	Car (String company , String carName , String carColor) {
		this (company,carName);
		this.carColor = carColor;		
	}
	//매개변수가 4개인경우
	Car (String company , String carName , String carColor , int carDoor) {
		this (company,carName,carColor);
		this.carDoor = carDoor;		
	}
	
	//매개변수가 5개인경우
	Car (String company , String carName , String carColor , int carDoor , double carWeight) {
		this (company,carName,carColor,carDoor);
		this.carWeight = carWeight;		
	}
	
	//필드
	String company;
	String carName;
	String carColor;
	int carDoor;
	double carWeight;
	
	//메소드
	@Override
	public String toString() {
		return "Car [company=" + company + ", carName=" + carName + ", carColor=" + carColor + ", carDoor=" + carDoor
				+ ", carWeight=" + carWeight + "]";
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		Car c1 = new Car () ;
		Car c2 = new Car ("현대") ;
		Car c3 = new Car ("현대","제네시스") ;
		Car c4 = new Car ("현대","제네시스","검정색") ;
		Car c5 = new Car ("현대","제네시스","검정색",4) ;
		Car c6 = new Car ("현대","제네시스","검정색",4,2000.0) ;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
	}

}
