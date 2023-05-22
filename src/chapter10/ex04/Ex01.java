package chapter10.ex04;

//상속 , 업캐스팅 , 다운캐스팅

class Human {
	//부모클래스
	String name;
	int age;
	
}

class Student extends Human {
	//필드
	int kor;
	int eng;
	int math;
}
	
public class Ex01 {
	
	//메소드 선언 : Student객체를 매개변수로 받아서 배열에 저장하는 객체이고
		//인풋으로 Student객체를 받아서 배열에 저장하는 메소드 
		
		Human [] arr = null;	
		
		void arrMethod (Human h1 , Human h2 , Human h3) {
			//for문을 사용해서 h1,h2,h3 객체를 arr배열에 넣는다.
			arr = new Human [] {h1,h2,h3};		//h1,h2,h3 객체에는 Human /Student타입이 내포
			
			//sumKor(arr);	"배열에 저장된 객체의 모든 국어점수는 000점 입니다."
			sumKor (arr);	//sumKor (매개변수);
			//sumEng(arr);	"배열에 저장된 객체의 모든 영어점수는 000점 입니다."
			sumEng (arr);
			//sumMath(arr); "배열에 저장된 객체의 모든 수학점수는 000점 입니다."
			System.out.println("배열에 저장된 객체의 모든 수학점수는 : " + sumMath(arr)  + "점 입니다.");
		
			
		}
		
		//각 객체의 국어점수를 더해서 결과를 출력하는 메소드. ->sumKor(arr1); , Student로 다운캐스팅 한 후 국어점수를 모두 더해서 출력
		void sumKor (Human[] arr) {
			
			//for문을 사용해서 각 방에 객체를 Human타입의 객체를 Student타입으로 다운캐스팅해서 kor점수만 뽑아온다.
			int sum = 0 ;
			for(int i = 0 ; i < arr.length ; i++ ) {
				if (arr[i] instanceof Student) {
				Student s = (Student) arr[i];		//다운캐스팅 : Human arr[i] -> Student타입
				sum+=s.kor;
			}
			}
			System.out.println("배열에 저장된 객체의 모든 국어점수는 : " + sum + "점입니다." );
			
		}
		
		//각 객체의 영어점수를 더해서 결과를 출력하는 메소드. ->sumEng(arr1); , Student로 다운캐스팅 한 후 영어점수를 모두 더해서 출력
		void sumEng (Human [] arr) {
			int sum = 0;
			for (int i = 0 ; i < arr.length ; i++) {
				if (arr[i] instanceof Student) {
					Student s = (Student) arr[i] ;
					sum +=s.eng;
				}
			}
			System.out.println("배열에 저장된 객체의 모든 영어점수는 : " + sum + "점입니다.");
		}
		
		//각 객체의 수학점수를 더해서 결과를 출력하는 메소드. ->sumMath(arr1); , Student로 다운캐스팅 한 후 수학점수를 모두 더해서 출력
		int sumMath (Human [] arr) {
			int sum = 0;
			for ( int i = 0 ; i < arr.length ; i++) {
				if (arr[i] instanceof Student) {
					sum += ((Student) arr[i] ).math;
				}
			}
			return 0;		//배열의 들어온 수학점수를 모두 더해서 리턴으로 돌려줌.
		}
	


	public static void main(String[] args) {
		//객체 생성
		Student s1 = new Student () ;	//"홍길동 / 나이:30 / 국어60 / 영어70 / 수학80"
		Student s2 = new Student () ;	//"이순신 / 나이:40 / 국어66 / 영어77 / 수학88"
		Student s3 = new Student () ;	//"세종대왕 / 나이:50 / 국어77 / 영어88 / 수학99"
		
		
		//s1,s2,s3 각 객체의 필드 값 할당.
		s1.name = " 홍길동";
		s1.age = 30;
		s1.kor = 60;
		s1.eng = 70;
		s1.math = 80;
		
		
		s2.name = " 이순신";
		s2.age = 40;
		s2.kor = 66;
		s2.eng = 77;
		s2.math = 88;
		
		s3.name = "세종대왕";
		s3.age = 50;
		s3.kor = 77;
		s3.eng = 88;
		s3.math = 99;
		
		//메소드 호출
		
		Ex01 e1 = new Ex01 ();
		
		//인스턴스 메소드 (객체이름으로 호출)
		e1.arrMethod(s1, s2, s3);
		//배열에 저장된 객체의 모든 국어점수는 000점 입니다.
		//배열에 저장된 객체의 모든 영어점수는 000점 입니다.
		//배열에 저장된 객체의 모든 수학점수는 000점 입니다.
	
		
		
		Human [] arr = new Human [] {s1,s2,s3};
		
	

	}	
}
