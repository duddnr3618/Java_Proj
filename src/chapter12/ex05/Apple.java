package chapter12.ex05;

public class Apple implements Fluit {

	@Override
	public void name() {
		System.out.println("사과");
	}

	@Override
	public void eat() {
		System.out.println("사과를 먹는다.");
	}

	@Override
	public void color() {
		System.out.println("사과는 빨강색이다.");
	}

}
