package chapter12.ex04;

public class Animal_Test {

	public static void main(String[] args) {

		//1.각 클래스를 객체화 해서 인터페이스 타입으로 둔다.
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Lion();
		Animal a4 = new Tiger();
		
		a1.cry();
		a1.run();
		
		a2.cry();
		a2.run();
		
		a3.cry();
		a3.run();

		a4.cry();
		a4.run();
		
		System.out.println("===============");
		
		Animal [] arr1 = new Animal [] {a1,a2,a3,a4};
		
		for(int i = 0 ; i < arr1.length ; i++) {
			arr1[i].cry();
			arr1[i].run();
			System.out.println();
		}
		
		System.out.println("================");
		
		for (Animal k : arr1) {
			k.cry();
			k.run();
			System.out.println();
		}
		
	}

}
