package chapter12.ex04;

public class Tiger implements Animal {

	@Override
	public void cry() {
		System.out.println("냐아앙");
	}

	@Override
	public void run() {
		System.out.println("호랑이는 달린다.");
	}

}
