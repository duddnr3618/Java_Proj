package chapter12.ex04;

public class Lion implements Animal {

	@Override
	public void cry() {
		System.out.println("어흥");
	}

	@Override
	public void run() {
		System.out.println("사자는 달린다.");
	}

}
