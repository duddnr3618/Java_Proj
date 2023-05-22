package chapter10.ex03;

class Customer {
	void memberInfo () {
		System.out.println("회원님은 기본 회원님입니다.");
	}
}

class Gold extends Customer {
	@Override
	void memberInfo() {
	System.out.println("회원님은 골드 회원입니다.");
	}
}

class Sliver extends Customer {
	@Override
	void memberInfo() {
	System.out.println("회원님은 실버 회원입니다.");
	}
}

class Bronze extends Customer {
	@Override
	void memberInfo() {
	System.out.println("회원님은 브론즈 회원입니다.");
	}
}

public class Ex03 {

	public static void main(String[] args) {
		
		Customer c1 = new Customer () ;
		Customer g1 = new Gold () ;
		Customer s1 = new Sliver () ;
		Customer b1 = new Bronze () ;
		
		c1.memberInfo();
		g1.memberInfo();
		s1.memberInfo();
		b1.memberInfo();
		
		System.out.println();
		System.out.println("======for문을 통한 배열에 값을 넣어서 출력==============");
		
		Customer [] arr1 = new Customer [] {g1,s1,b1};
		
		for (int i = 0 ; i < arr1.length ; i++) {
			arr1[i].memberInfo();
		}
		
		System.out.println();
		System.out.println("=====Enhance for문을 사용한 출력==========");
		for (Customer k :arr1) {
			k.memberInfo();
		}
		

	}

}
