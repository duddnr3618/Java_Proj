package chapter10.ex02;

//상속,캐스팅
class Customer {		//부모클래스 : 고객의 정보를 담는 클래스

	String name ;		//고객이름
	long customerID; 	//고객ID
	int customerPoint;	//고객 포인트
	
	void customInfo () {
		System.out.println("고객이름 : " + name + " , 고객ID : " + customerID + " , 고객 포인트 : " + customerPoint );
	}
	
}

//자식 클래스 : GoldMember , SeliverMember ,  BronzeMember => int  goldPoint ,S.p , B.p : 10점/5점/3점
			//메소드 : goldInfo() : 골드회원입니다....
class GoldMember extends Customer{
	int goldPoint;
	
	void goldInfo () {
		System.out.println("골드 회원입니다.");
		
	}
	
}

class SliverMember extends Customer {
	int sliverPoint;
	
	void sliverInfo () {
		System.out.println("실버회원입니다.");
	
}
}

class BronzeMember extends Customer {
	int bronzePoint;
	
	void bronzeInfo () {
		System.out.println("브론즈회원입니다.");
	}	
	}
public class Ex01 {

	public static void main(String[] args) {
		
		//각 객체를 생성해서 부모클래스의 필드와 메소드 접근 가능한지 확인후 업캐스팅 다운캐스팅
	
		//객체생성
		Customer c1 = new Customer();
		c1.name = "홍길동";
		c1.customerID = 123456;
		c1.customerPoint =1000;
		c1.customInfo();
		
		System.out.println("================================");
		
		GoldMember g1 = new GoldMember ();
		if(g1 instanceof GoldMember) {
			System.out.println("접근 가능합니다.");
			}else {
				System.out.println("접근 불가능합니다.");	
			}
		
		//업캐스팅
		Customer cc2 = g1;
		cc2.customerID = 11111;
		cc2.name = "이순신";
		cc2.customerPoint = 2000;
		//다운캐스팅
		GoldMember g2 = (GoldMember) cc2;
		g2.goldPoint =10;
		g2.goldInfo();
		g2.customInfo();
		
		System.out.println("==============================");
		
		SliverMember s1 = new SliverMember ();
		if(s1 instanceof SliverMember) {
		System.out.println("접근 가능합니다.");
		}else {
			System.out.println("접근 불가능합니다.");	
		}
		//업캐스팅
		Customer ccc3 = s1;
		ccc3.customerID = 2222;
		ccc3.name = "손흥민업캐스팅";
		ccc3.customerPoint = 1000;
		//다운캐스팅
		SliverMember s2 = (SliverMember) ccc3;
		s2.sliverPoint = 5;
		s2.sliverInfo();
		s2.customInfo();
		
		System.out.println("=====================================");
		
		BronzeMember b1 = new BronzeMember ();
		if(b1 instanceof BronzeMember) {
			System.out.println("접근 가능합니다.");
			}else {
				System.out.println("접근 불가능합니다.");	
			}
		
		//업캐스팅
		Customer cccc4 = b1;
		cccc4.name = "세종대왕";
		cccc4.customerID = 3333;
		cccc4.customerPoint = 500;
		//다운캐스팅
		BronzeMember b2 = (BronzeMember) cccc4;
		b2.bronzePoint = 3;
		b2.bronzeInfo();
		b2.customInfo();
		
		System.out.println("========배열================");
		
		//c1,g1,s1,b1 을 Customer타입으로 배열에 저장
		//객체 배열 arr1에 넣음 : 업캐스팅이 자동으로 됨 -> 배열 arr1에 저장된 모든 객체는 Customer타입을 담고있고 Customer탕비으로 
								//업캐스팅 되어 들어가 있다.
		//arr1에 들어가 있는 객체 Customer타입
		Customer [] arr1 = new Customer[] {c1,g1,s1,b1};
		
		//배열에 저장된 객체를 가지고 온다.
		Customer aa1 = arr1[0];		//Customer타입
		Customer aa2 = arr1[1];		//Customer타입 / GoldMember타입
		Customer aa3 = arr1[2];		//Customer타입 / SliverMember타입
		Customer aa4 = arr1[3];		//Customer타입 / BronzeMember타입
		
		aa1.customInfo();
		aa2.customInfo();
		aa3.customInfo();
		aa4.customInfo();
		
		
		System.out.println("=========================================");
		//객체생성시 타입을 지정
		//1.Customer 객체 생성시 타입지정
		Customer cus1 = new Customer ();
		
		//2.GoldMember 객체생성시 타입지정 : Customer / GoldMember 타입으로 2가지 지정가능
		Customer cus2 = new GoldMember (); 		//cus2 : 2가지 타입을 다 내포하고 있고 , Customer로 지정이 됬다.=>Customer 내용만 접근가능하다.
		cus2.name = "고객이름 : ";		//customer만 접근이 가능하다.
		GoldMember gg1 = (GoldMember) cus2 ; //GoldMember타입도 가지고 있기떄문에 다운캐스팅이 가능하다.
		gg1.goldInfo();
		
		GoldMember cus3  = new GoldMember ();
		cus3.goldPoint = 10;		//GoldMember와 Customer 접근 둘다 가능하다.
		
		//3.SliverMember 객체화 하면서 Custom타입으로 지정
		Customer cus4 = new SliverMember();
		cus4.name = "고객이름";	//customer만 접근이 가능하고 두개의 타입을 다 가지고 있다.
		SliverMember ss1 = (SliverMember) cus4;
		ss1.sliverPoint = 3;	//다운캐스팅
		
		SliverMember cus5 = new SliverMember ();
		cus5.sliverPoint = 3;		//두개 타입을 다 가지고 있고 두개다 접근 가능하다.
		
		System.out.println("===================================");
		
		Customer cu1 = new GoldMember ();
		Customer cu2 = new SliverMember ();
		Customer cu3 = new BronzeMember ();
		
		//자식클래스를 부모타입으로 객체화 시켜서 배열에 저장
		Customer [] arr2 = new Customer [] {cu1,cu2,cu3};
		
		//각 배열의 방의 값을 끄집어내면서 다운캐스팅
		GoldMember ga1 = (GoldMember) arr2[0];
		SliverMember sa1 = (SliverMember) arr2[1];
		BronzeMember ba1 = (BronzeMember) arr2[2];
		
		
		
	}

}
