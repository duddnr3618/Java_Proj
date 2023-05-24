package chapter12.ex05;

public class Banana implements Fluit {

	@Override
	public void name() {
		System.out.println("바나나");
	}

	@Override
	public void eat() {
		System.out.println("바나나를 먹는다");
	}

	@Override
	public void color() {
		System.out.println("바나나는 노란색이다.");
	}

}
