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
		
		
		Object [] obj = new Object [] {a,b,s};
		
		Ex01 ex = new Ex01 ();
		ex.totalPrice(obj);
	
		int [] sum = new int [3];
		for ( int i = 0 ; i < obj.length ; i++) {
			sum[0] = ((Apple)obj[i]).count ;
			sum[1] = ((Banana)obj[i]).count;
			sum[2] = ((Stroberry)obj[i]).count;	
		}
		
		
		System.out.println("사과의 총 합은 : " + sum[0]);
		System.out.println("바나나의 총 합은 : " + sum[1]);
		System.out.println("딸기의 총 합은 : " + sum[2]);
		
	}

}
