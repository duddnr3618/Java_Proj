package chapter16.ex01;

public class Account_Test {

	public static void main(String[] args) {
		
		Account a1 = new Account ();
		
		//현재 잔고 출력 : 필드의 접근 제어자가 private이므로 get를 사용해야함.
		System.out.println(a1.getBalance());
		
		//예금입금 
		a1.deposit(30000);		//3만원입금
		
		//추가입금
		a1.deposit(50000);
		System.out.println();
		//출금 : 일반예외를 발생시킴 throws 호출하는 곳에서 예외를 처리하도록 적용해놓은 상태.
		
		try {
			a1.withdrow(60000);
		} catch (BalanceException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		try {
			a1.withdrow(50000);		////예외발생.
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} 		
		
		
		
		
		
		
		
		
	}

}
