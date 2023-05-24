package chapter10.ex07;

class Apple {
	String name;	//이름
	int price;		//가격
	int count;		//갯수
	
	Apple (String name , int price , int count) {
		this.name = name;
		this.price = price;
		this.count = count;
		
	}
	
}

class Banana {
	String name;	//이름
	int price;		//가격
	int count;		//갯수
	
	Banana (String name , int price , int count) {
		this.name = name;
		this.price = price;
		this.count = count;
				
	}
	
}

class Stroberry {
	String name;	//이름
	int price;		//가격
	int count;		//갯수
	
	Stroberry (String name , int price , int count) {
		this.name = name;
		this.price = price;
		this.count = count;
				
	}
	
}


public class Ex01 {
	
	//배열의 객체를 매개변수로 받아서 총 가격을 출력
	
	void totalPrice (Object [] obj) {
		//합계를 구하는 변수 선언
		int totalApple = 0;			//사과 총 가격 : price * count
		int totalBanana = 0;		//바나나 총 가격 : price * count
		int totalStroberry = 0;		//딸기 총 가격 : price * count
		
		//배열 변수로 선언
		int [] total = new int [3];	//total[0] = apple / total[1] = banana / total [2] = stroberey
		if ( obj[0] instanceof Apple) {
		total [0] = ((Apple) obj[0] ).price * ((Apple) obj[0] ).count;
		}if ( obj[1] instanceof Banana) {
		total [1] = ((Banana) obj[1] ).price * ((Banana) obj[1] ).count;
		} if ( obj[2] instanceof Stroberry) {
		total [2] = ((Stroberry) obj[2] ).price * ((Stroberry) obj[2] ).count;
		}
	
		System.out.println("사과의 총 합은 : " + total[0]);
		System.out.println("바나나의 총 합은 : " + total[1]);
		System.out.println("딸기의 총 합은 : " + total[2]);
		System.out.println("모든 과일의 총 합은 : " + (total[0] + total[1] + total [2]));
			
	}
		
	public static void main(String[] args) {
		
		/*
		 	모든 클래스는 오브젝트를 상속 받는다.
		 	모든 클래스는 오브젝트 타입으로 업캐스팅 가능하다.
		 */
		
		//"사과" 2000원 5개
		//"바나나" 4000 10개
		//"딸기" 5000 30개
		//생성자를 통해서 각 객체에 값을 할당 
		//모든 객체를 object 배열에 넣어 총 합을 구해라
		

		Apple a = new Apple ("사과",2000,5) ;
		Banana b = new Banana ("바나나",4000,10) ;
		Stroberry s = new Stroberry ("딸기",5000,30) ;
		
		Object [] obj = new Object [] {a,b,s};	//사과,바나나,딸기의 타입은 다 다르기때문에 오브젝트 타입으로 업캐스팅해 배열에 지정
		//a,b,s : 업캐스팅되어 오브젝트 필드 메소드만 접근이가능.
		
		//메소드 호출
		Ex01 e1 = new Ex01 ();
		e1.totalPrice(obj);
		
	
		
		
	}

}
