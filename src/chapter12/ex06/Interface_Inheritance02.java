package chapter12.ex06;

import chapter12.ex04.Animal;

interface Animal1 {
	void cry();
}

interface Animal2 {
	void run();
	
}

interface Animal3 {
	void eat();
}

//인터페이스가 인터페이스를 상속 할수 있다 . (extends 사용 - 앞 뒤 객체가 같을때)
	// - class extends class
	// - interface extends interface

interface K extends Animal1 , Animal2 , Animal3 {}

class G implements K {

	@Override
	public void cry() {
		System.out.println("모든 동물은 운다.");
	}

	@Override
	public void run() {
		System.out.println("모든 동물은 달린다.");
		
	}

	@Override
	public void eat() {
		System.out.println("모든 동물은 먹는다.");
		
	}
	
}


public class Interface_Inheritance02 {

	public static void main(String[] args) {
		
		K k1 = new G () ;
		k1.cry();
		k1.eat();
		k1.run();
		System.out.println();
		
		Animal1 a1 =new G ();
		a1.cry();

		Animal2 a2 =new G ();
		a2.run();
		
		Animal3 a3 =new G ();
		a3.eat();
		
	}

}
