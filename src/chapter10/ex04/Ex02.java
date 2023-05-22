package chapter10.ex04;

class Car {
	String companyName;	//회사명
	int carYear;	//생산년도
	
}

class HCar extends Car {
	
	//
	String carName;	//자동차 모델명
	int maxSpeed;	//최대스피드
	int oilLiter;	//최대기름적재량
	
}

class BMW extends Car {
	
	String carName;
	int maxSpeed;
	int oilLiter;
	
}


public class Ex02 {
	
	//Car배열 생성
	Car[] arr = null;
	
	
	void carInfo (Car c1 , Car c2 , Car c3 , Car c4 ) {
		//현대자동차 객체를 인풋으로 받아서 arr변수에 저장.
		arr = new Car [] {c1,c2,c3,c4};
		
		avgMaxSpeed (arr);
		sumOilLiter(arr);
		
		System.out.println("현대자동차의 오일 리터의 총 합은 : " + sumOilLiter(arr) + " 입니다." );
	
	}
	
	void avgMaxSpeed (Car [] arr) {
		//현대자동차의 배열의 저장된 최대스피드의 평균을 출력
		double avg=0.0; 
		int k;
		for (int i = 0 , sum = 0; i < arr.length ; i++) {
			if ( arr[i] instanceof HCar) {
				HCar c = (HCar) arr[i] ;
				sum += c.maxSpeed;
				
		}
			avg = sum / arr.length;
	}
		System.out.println("현대자동차의 평균 속도는 : " + avg  + " 입니다.");
	}
	
	int sumOilLiter (Car [] arr) {
	//현대자동차배열의 저장된 오일의 합 출력
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if (arr[i] instanceof HCar) {
				HCar c = (HCar) arr[i];
			sum += c.oilLiter;
			}
		}
		
		return sum;
		
	}
	
	
	
	public static void main(String[] args) {
		
		//현대자동차의 객체를 생성해서 필드의 값 입력
		
		HCar h1 = new HCar ();
		h1.companyName = "현대자동차";
		h1.carYear = 2000;
		h1.carName = "에쿠스";
		h1.maxSpeed = 330;
		h1.oilLiter = 60;
		
		HCar h2 = new HCar ();
		h2.companyName = "현대자동차";
		h2.carYear = 2010;
		h2.carName = "제네시스";
		h2.maxSpeed = 300;
		h2.oilLiter = 50;
		
		HCar h3 = new HCar ();
		h3.companyName = "현대자동차";
		h3.carYear = 2022;
		h3.carName = "그렌져";
		h3.maxSpeed = 250;
		h3.oilLiter = 55;
		
		HCar h4 = new HCar ();
		h4.companyName = "현대자동차";
		h4.carYear = 2000;
		h4.carName = "아반떼";
		h4.maxSpeed = 200;
		h4.oilLiter = 40;
		
		
		
		Ex02 e1 = new Ex02 () ;
		
		e1.carInfo(h1, h2, h3, h4);
		
	}
	
	
}
