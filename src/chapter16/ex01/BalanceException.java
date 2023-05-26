package chapter16.ex01;

//은행의 잔고가 부족하면 강제로 발생시키는 예외 : 일반예외

public class BalanceException extends Exception {
	//1.기본생성자.
	BalanceException () {}
	
	//2.메세지를 처리하는 생성자.
	BalanceException (String message) {		//catch (BalanceException e ) , e.getmessage ()
		super (message);
	}


	}
