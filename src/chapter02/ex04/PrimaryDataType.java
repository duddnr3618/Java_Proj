package chapter02.ex04;

public class PrimaryDataType {
	public static void main(String[] args) {
		/*
		 자료형
		 - 기본 자료형 : Ram STACK(스텍) 공간에 변수명과 변수의 값이 저장 
		 	-8가지 기본자료형 -소문자
		 	: boolean ,정수형(byte,short,int,long) ,실수형(float,double) ,문자형(char)
		 		-정수형 자료형은 기본 : int		->long으로 선언후 변수에 값(리터럴)을 담을때 : l , L을 정의해줘야한다.
		 		-실수형 자료형은 기본 : double	->float으로 선언된 변수의 값을 넣을때 :f ,F를 정의해줘야한다.
		 - 참조 자료형 : Ram STACK Heap(힙)에 값이 저장 (힙에 저장된 참조 주소를 가지고있다.)
		 	- 참조자료형은 무한으로 만들수 있다.(객체 (String)-첫글자 대문자 / 배열 / ...) 
		
		// 리터럴 : 변수에 할당된 값을 통칭해서 리터럴 
		*/

		//1.boolean : ture , flase 값만 저장 가능하다.
		boolean bool1 = true;
		
		boolean bool2 ;
		bool2 = false;
		
		System.out.println(bool1); //true
		System.out.println(bool2); //flase
		
		//boolean bool3 = 123; // 오류발생 -> true , false만 넣을수 있다.
		
		//변수의 값을 수정
		bool2 = true;
		
		System.out.println(bool2); //true가 출력된다.
		
		// 상수 설정 (변수 앞에 final) ->상수명은 변수와 구분하기 위해서 대문자를 사용.
		final boolean BOOL4 = false; //변수의 값을 수정 할수 없다.
		System.out.println(BOOL4);
		//BOOL4 = true;
		//System.out.println(bool4); -> 오류발생 (상수의 값은 수정할수 없다)
		
		//2.정수형 자료형( byte(1byte),short(2byte),int(4byte),long(8byte) )
		
		//byte : 1byte (-2^7 ~ +2^7-1)값을 저장할 수 있다. 1byte = 8bit
					//(-128 ~ 127)
		byte val1 = -128;
		byte val2 = +127;
		//byte val3 = -129; //오류발생 (-128 ~ 127)
		
		//short : 2byte = 16bit (-2^15 ~ 2^15-1) 값을 저장
							//	(-32,768 ~ 32,767)
		short val3 = -32768;
		short val4 = 32767;
		//short val4 = 32769; //오류발생
		
		//int : 4byte = 32bit (-2^31 ~ 2^31-1) 값을 저장
							//(-2,147,483,648 ~ 2,147,483,647)
		int val5 = -2147483648;
		int val6 = 2147483647;
		
		//long : 8byte = 64bit (-2^63 ~ 2^63-1)
			//(-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)
		//long형으로 선언된 변수에 값을 할당 할때 리터럴에 값을 넣을때 : 대문자 L 소문자 l을 넣어야한다.
		long val7 =-9223372036854775808L; 
		long val8 = 9223372036854775807L;
		long val9 = 123456; // int 자료형보다 큰 값을 넣을때 L
		
		//3.실수형 자료형(소숫점) : double(기본형) / float-값을 넣을때 f,F를 넣어야 한다.
		// float : 4byte = 소숫점 7자리까지 정밀도를 유지.(나머지는 반올림)
		// double : 8byte = 소숫점 15자리까지 정밀도를 유지.
		float val10 = 1.123456789F; // 소수점 이하 9자리까지 넣었지만 F(7자리까지만 유지)
		System.out.println(val10);
		
		double val11 = 1.12345678910111213;  //15자리까지 유지하고 나머지는 반올림
		System.out.println(val11);
		
		//4.문자(char) : 1글자 , 문자열 : 1굴자 이상 , String (참조,객체자료형) , 리터럴에 값을 넣을때 ""사용 
		// -- 리터럴에 값을 넣을 때 :  ''사용
		// --리터럴에 문자를 넣었을때  : A,B,C,a,b,c 
		// --리터럴에 특수문자 : #,!,%
		// --아스키 코드값으로 넣을 수 있다. : 숫자,문자,영문자,특수문자->아스키코드를 가지고있다.(7bit)
		// --유니코드 값으로 넣을 수 있다.: '\u0041' , 2byte,3byte->한글이나 다른 언어
		// -- 한글1자 ,중국어1자,일본어1자
		// 직접 문자를 대입 : 영어(대문자,소문자),숫자,특수문자->7bit의 코드값 : 아스키코드
		// 2byte ~ 3byte : 한국어,일본어,중국어 등.. : 유니코드
		
		char val12 = 'A';
		//char val13 'AB'; // 오류발생
		char val13 = 'B';
		char val14 = 'a';
		char val15 = '가';
		char val16 = '#';
		char val17 = '1';
		System.out.println(val12);
		System.out.println((int)val12); //A라는 문자의 아스키코드값이 출력 : 65
		System.out.println(val13);
		System.out.println(val13);
		System.out.println((int)val13); //B문자의 아스키코드 : 66
		System.out.println(val14);
		System.out.println((int)val14); //a문자의 아스키코드 : 97
		System.out.println(val15);
		System.out.println((int)val15); //가 문자의 유니코드 : 44032
		
		// 숫자(아스키 코드값) char 변수에 값을 할당.
		char val18 = 65; // A -> 캐릭터에 숫자를 넣어서 문자를 출력 ->아스키코드
		System.out.println(val18);
		
		//유니코드 값으로 char변수에 값을 할당.
		char val19 = 44032; // 가 -> 캐릭터에 숫자를 넣어서 문자를 출력 -> 유니코드
		System.out.println(val19); 
		
		char val20 = '\u0041'; //A
		char val21 = '\uac00'; //가
		System.out.println(val20);
		System.out.println(val21);
		
		// 자신의 이름을 유니코드로 출력.
		char val22 = '\ucd5c';
		char val23 = '\uc601';
		char val24 = '\uc6b1';
		System.out.print("나의 이름은 ");
		System.out.print(val22);
		System.out.print(val23);
		System.out.print(val24);
		System.out.println("입니다.");
		
		//1.println : 문자열과 변수를 출력시 +
		System.out.println("나의 이름은 "+val22+val23+val24+ "입니다.");
		
		//2.print : 문자열과 변수를 출력시 +, \n
		System.out.print("나의 이름은 "+val22+val23+val24+ "입니다.\n");
		
		//3.printf : 문자열 내에서 , 뒤의 변수 값을 불러들임 "%s-문자열,%d-정수,%f-실수
		// %c : 문자열 변수값을 불러들임.
		System.out.printf("나의 이름은 %c%c%c입니다.\n",val22,val23,val24);
		
		// 참조 자료형 : String (객체) : 문자열을 저장하는 자료형 -> ""
		String val25 = "오늘의 날씨는 흐립니다.";
		System.out.println(val25);
		
		
		
		
		
	}
	

}
