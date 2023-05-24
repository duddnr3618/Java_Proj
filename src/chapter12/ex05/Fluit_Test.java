package chapter12.ex05;

public class Fluit_Test {

	public static void main(String[] args) {

		Fluit f1 = new Apple ();
		Fluit f2 = new Banana ();
		Fluit f3 = new Stroberry ();
		
		f1.name();
		f1.eat();
		f1.color();
		System.out.println();
		f2.name();
		f2.eat();
		f2.color();
		System.out.println();
		f3.name();
		f3.eat();
		f3.color();
		System.out.println();
		
		System.out.println("====for문으로 출력=====");
		
		Fluit [] arr1 = new Fluit [] {f1,f2,f3};
		for ( int i = 0 ; i < arr1.length ; i++) {
			arr1[i].name();
			arr1[i].eat();
			arr1[i].color();
			System.out.println();
		}
		
		System.out.println("=====enhance for문 사용==========");
		for (Fluit k : arr1) {
			k.name();
			k.eat();
			k.color();
			System.out.println();
		}
		
	}

}
