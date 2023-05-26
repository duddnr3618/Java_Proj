package chapter16.ex01;


public class Account {

	private long balance = 10000;		//은행에 예금된 잔고 : 10000원이 입금상태.
	
	//기본생성자
	Account () {}
	
	//getter : 메소드를 호출시 필드의 정보를 출력 ->private 필드의 정보를 출력
	public long getBalance () {
		return balance ;
	}
	
	//예금을 입금하고 출금하는 메소드 : money를 인풋받아서 balance의 값이 변경 -> + : 예금을 추가 / - : 예금을 뺀다.
	public void deposit (int money) { 	//에금을 입금하는 메소드
	//코드
		System.out.println("입근전 잔고 : " + balance + " 이고 , " +   money + " 가 입금되었습니다.");
		balance += money;
		System.out.println("총 예금잔고는 : " + balance  + " 입니다.");
	}
	public void withdrow (int money) throws BalanceException {  //예금을 출금하는 메소드 -> money를 인풋받아서 예금잔고보다 작으면 balanceException을 발생시킨다
																	//->"예금잔고가 부족합니다."
		//코드
		if (balance < money) {	//출금액에 예금액보다 많으면 예외를 처리 / 그렇지 않으면 기존금액에서 뺀다.
			System.out.println("현재 예금 잔고는 : " + balance + " 출금액은 : " + money);
			throw new BalanceException ("현재 잔고가 부족합니다." + (money - balance )+ "원 부족합니다.");		//예외를 강제 발생(일반예외->예외를 바로 처리)
			
		}else {
			balance -= money;
			System.out.println("출금후 잔고는 : " + balance );
		}
		System.out.println();
		
	}
	
}
