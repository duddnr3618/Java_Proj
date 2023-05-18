package chatper08.ex02;

public class A {
	
	//생성자 
	public A () {}
			
	//필드에 부여된 접근제어자
	public int a = 1; 			//같은패키지 , 다른패키지에서 접근 가능.
	protected int b = 2;		//같은패키지에서 접근 가능 /다른패키지에서 접근 할때 상속관계가 되있어야 접근 가능.
	int c  =3;					//외부클래스에서 접근 가능 ( 같은패키지 내부에 있어야 한다.) / 패키지가 다르면 접근 불가능.
	private int d = 4 ;			//같은 클래스에서만 접근이 가능 / 외부클래스에서는 접근 불가능.
	
	//메소드에 부여된 접근제어자
	public void abc () {
		System.out.println("public");
	}
	
	protected void bcd () {
		System.out.println("protected");
	}
	
	void def () {
		System.out.println("default");
	}
	
	private void efg () {
		System.out.println("private");
	}
	
	public static void main(String[] args) {
		
		
		
		
	}

}
