package chapter18.ex02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CarTest {

	public static void main(String[] args) {
		// 1. Car타입의 객체 5개 생성
		Car c1 = new Car ("현대" , " 그랜져 " , "검정색" , 100);
		Car c2 = new Car ("기아" , " K9" , "회색" , 150);
		Car c3 = new Car ("쌍용" , " 투싼 " , "노란색" , 200);
		Car c4 = new Car ("벤츠" , " Eclass " , "빨강색" , 250);
		Car c5 = new Car ("아우디" , " A7 " , "파란색" , 300);
		
		
		// 2.ArrayList에 저장
		
		List <Car> List1 = new ArrayList<Car> ();
		List1.add(c1);
		List1.add(c2);
		List1.add(c3);
		List1.add(c4);
		List1.add(c5);

		// 3. Vector
		List <Car> List2 = new Vector<Car> ();
		List2.add(c1);
		List2.add(c2);
		List2.add(c3);
		List2.add(c4);
		List2.add(c5);
		
		// 4.LinkedList
		List <Car> List3 = new LinkedList<Car> ();
		List3.add(c1);
		List3.add(c2);
		List3.add(c3);
		List3.add(c4);
		List3.add(c5);
		
		// 5.List에 저장된 내용들 출력 (for문 , inhance for문)
		System.out.println("===============================for문 ================================");
		for ( int i = 0 ; i < List1.size() ; i++) {
			System.out.println(List1.get(i));
		}
		System.out.println();
		
		for ( int i = 0 ; i < List2.size() ; i++) {
			System.out.println(List2.get(i));
		}
		System.out.println();
		
		for ( int i = 0 ; i < List3.size() ; i++) {
			System.out.println(List3.get(i));
		}
		System.out.println();
		
		System.out.println("=======================inhance for 문 =========================");
		
		for ( Car k : List1) {
			System.out.print( k + " ");
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for ( Car k : List2) {
			System.out.print( k + " ");
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for ( Car k : List3) {
			System.out.print( k + " ");
			System.out.println();
		}
		
	}

}
