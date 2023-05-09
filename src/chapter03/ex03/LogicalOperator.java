package chapter03.ex03;

public class LogicalOperator {
public static void main(String[] args) {
	/*
	 논리 연산자 : 논리연산한 결과를 true , false 로 연결.->if,for..조건으로 처리된다.
	 && :(AND) 
	 || : (OR) 
	 ^ : (XOR) : 앞뒤가 같을때 false를 리턴 , 앞뒤가 다를때 true를 리턴
	 ! : (NOT) 
	 */
	
	//&& : AND연산 = true , false 
	System.out.println(true && true);	// true
	System.out.println(true && false);	// false
	System.out.println(false && true); 	// false
	System.out.println(false && false);	// false
	System.out.println("\n");
	
	
	//|| : OR연산 : 둘중 하나라도 true면 true
	System.out.println(true || true);	//true
	System.out.println(true || false);	//true
	System.out.println(false || true);	//true
	System.out.println(false || false);	//false
	System.out.println("\n");
	
	//^ : XOR연산 : 앞뒤 값이 같을때 false(0) , 다를때 true(1)
	System.out.println(true ^ true); //false
	System.out.println(true ^ false); //true
	System.out.println(false ^ true); //true
	System.out.println(false ^ false); //false
	System.out.println("\n"); 
	
	//! : NOT연산 : !true == false , !flase == true
	System.out.println(!true); 	//false
	System.out.println(!false); //true
	
	System.out.println("--------------------------");
	//숏트 서킷 : 논리연산에서 앞으 값으로 결과 값을 유추할수 있는 경우 뒤에 내용을 무시해서 처리 하지 않는다.
	//&&연산에서 false가 오면 뒤에는 어떤 값이 와도 false가 된다.->뒤에가 숏트서킷으로 인해 해석을 무시한다.
	System.out.println(true && true); 	//숏트서킷이 발생 하지 않는다.
	System.out.println(false && true); 	//숏트서킷이 발생 한다.	
	//앞의 값이 false이면 뒤에 값을 확인하지 않아도 false가 된다.
	
	System.out.println("--------------------------------");
	//ex) AND연산에서 숏트서킷이 발생되는 예제
	int val1 = 3;
	System.out.println(false && ++val1 > 6); // 4>6 = false
	System.out.println(val1); // 쇼트서킷이 발생되어 3이 출력 된다.
	System.out.println(true && ++val1 > 6); // 4>6 = 
	System.out.println(val1); // 쇼트서킷이 발생하지 않아 4가 출력된다.
	
	//OR연산에서 앞에 값이 true이면 쇼트서킷이 발생된다.
	System.out.println(true || false); // 쇼트서킷이 발생된다.
	System.out.println(false || true); // 쇼트서킷이 발생되지 않는다.
	
	//쇼트서킷을 방지 : 비트 연산자를 사용한다. (&,|) ->쇼트서킷을 발생시키지 않는 연산
	//ex) AND연산에서 숏트서킷이 방지되는 예제
	int val2 = 3;
	System.out.println(false & ++val2 > 6); // false /뒤에 값을 확인
	System.out.println(val2); // 쇼트서킷이 방지되어 4가 출력 된다.
	
	
		
	
	
		
	
}
}
