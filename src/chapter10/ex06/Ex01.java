package chapter10.ex06;

class Student {
	String name;
	
	//합계와 평균을 출력하는 메소드 : 부모클래스의 메소드 -실행 코드가 없다 ->자식클래스에서 오버라이딩 해서 구현코드 생성
	void sum_avg () {
		
	}
}

class StudentSub extends Student {
	
	int kor;
	int eng;
	int math;
	
	//1.생성자로 매개변수 값을 받아서 각 필드에 값을 할당. name / kor/ eng / math
	
	StudentSub (String name , int kor , int eng , int math) {
		//super ();
		super.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	//2.필드의 값을 모두 합하고 평균을 출력 ->각 객체의 점수의 합계와 평균을 구하는 메소드
	@Override
	void sum_avg() {
		int sum = 0 ;
		sum = (kor + eng + math) ;
		double avg = 0.0;
		avg =(double)( sum/3.0) ;
		
		System.out.println(name + "의 총 합은 " + sum + " 이고 , 평균은 : " + avg + " 입니다.");
	
		
		}
		
		
	
	
}

public class Ex01 {

	public static void main(String[] args) {

		//각 객체의 필드에 값을 할당은 생성자 호출시 매개변수로 값을 할당.
		/*
		 	홍길동 , 70 88 77
		 	이순신 , 80 68 87
		 	김똘똘 , 60 86 87
		 	홍길순 , 77 56 80
		 	강감찬 , 55 66 77 
		 */
		
		
		//Student타입에 sum_avg() 메소드 호출시 오버라이딩된 메소드 호출
		StudentSub s1 = new StudentSub ("홍길동" , 70 ,88,77);
		StudentSub s2 = new StudentSub ("이순신" ,80 ,68,77);
		StudentSub s3 = new StudentSub ("김똘똘" , 60 ,86,87);
		StudentSub s4 = new StudentSub ("홍길순" , 77 ,56,80);
		StudentSub s5 = new StudentSub ("강감찬" , 55 ,66,77);
		
		 s1.sum_avg();
		 s2.sum_avg();
		 s3.sum_avg();
		 s4.sum_avg();
		 s5.sum_avg();
		 
		 //배열로 출력
		 System.out.println("==============================");
		 
		 Student [] arr = new Student [] {s1,s2,s3,s4,s5};
		 
		 for ( int i = 0 ; i <  arr.length ; i++) {
			arr[i].sum_avg();
		 }
		
		 System.out.println("==============================");
		 //모든 사용자의 국어점수의 총합 / 영어 / 수학 
			
			int sumKor = 0;
			int sumEng = 0;
			int sumMath = 0;
			
			int [] sum = new int [3];
		 for (int i = 0 ; i < arr.length ; i++) {
			 sum[0] += ((StudentSub)arr[i]).kor;
			 sum[1] += ((StudentSub)arr[i]).eng;
			 sum[2] += ((StudentSub)arr[i]).math;
		 }
		 System.out.println("국어점수의 총 합은 : " + sum[0]);
		 System.out.println("국어점수의 총 합은 : " + sum[1]);
		 System.out.println("국어점수의 총 합은 : " + sum[2]);
		 
	}

}
