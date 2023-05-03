package chapter02.ex02;

public class NamingVariable {
	public static void main(String[] args) {
		//변수 이름 지정 규착(변수명)
		//소문자로 시작
		//한글은 변수명으로 사용할 수 있다.(권장사항은 아니다)
		//특수문자는 2개만 사용 가능 : _ , $
		// 변수명에 숫자를 사용할수 있으나 , 첫자에 숫자가 오면 오류가 발생
		//자바에서 사용하는 예약어는 변수명으로 사용 할 수 없다.(package,public , class...)
		
		boolean aBcD;
		byte  가나다라;
	//	byte 3bbb; // 변수명에 첫자에는 숫자가 오면 오류 발생
		boolean _abcd; // 특수문자 사용 가능
		int $cde; // 사용 가능
		
		int ABCDE; // 대문자로 변수 사용 가능(권장사항은 아니다.)
		// 변수 :  소문자로 시작 , 상수 : 대문자로 시작
		int myWork; // 뱐수명은 처음 단어는 소문자 , 두번째 단어는 첫자가 대문자
		
	}

}
