package chapter12.ex05;

public class Stroberry implements Fluit {

	@Override
	public void name() {
		System.out.println("딸기");
	}

	@Override
	public void eat() {
		System.out.println("딸기를 먹는다");
	}

	@Override
	public void color() {
		System.out.println("딸기는 빨강색이다.");
	}

}
