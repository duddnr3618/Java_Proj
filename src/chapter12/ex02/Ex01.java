package chapter12.ex02;

abstract class Calc {
	abstract int add (int a , int b) ;	//두정수를 인풋받아서 더한 값을 리턴
	abstract int diff (int a , int b) ;	//두정수를 인풋받아서 뺀값을 리턴
	abstract int mul (int a , int b) ;	//두정수를 인풋받아서 곱한 값을 리턴
	abstract int div (int a , int b) ;	//두정수를 인풋받아서 나누어서 값을 리턴
	
}

class Ca extends Calc {
	@Override
	int add(int a, int b) {
		int add = 0;
		add = (a+b);
		System.out.println(add);
		
		return 0;
	}
	
	@Override
	int diff(int a, int b) {
		int diff = 0;
		diff = a-b;
		System.out.println(diff);
		return 0;
	}
	
	@Override
	int mul(int a, int b) {
		int mul = 0;
		mul = a*b;
		System.out.println(mul);
		return 0;
	}
	
	@Override
	int div(int a, int b) {
		double div = 0;
		div = (a/b);
		System.out.println(div);
		return 0;
	}
	
}
public class Ex01 {

	public static void main(String[] args) {

		//위의 추상클래스를 1.콘크리트 클래스를 생성해서 출력 / 2.익명클래스로 작동
		
		
		//1.콘크리트 클래스생성후 출력
		Calc c1 = new Ca ();
		c1.add(3, 5);
		c1.diff(5, 2);
		c1.mul(7, 3);
		c1.div(10, 5);
		System.out.println();
		//2.익명클래스로 출력
		Ca c2 = new Ca() {
			@Override
			int add(int a, int b) {
				
				
				return a+b;
			}
			@Override
			int diff(int a, int b) {
			
				return a-b;
			}
			
			@Override
			int mul(int a, int b) {
				
				return a*b;
			}
			
			@Override
			int div(int a, int b) {
				
				return  a / b;
			}
			
		};
		
		int a = 9;
		int b = 3;
		System.out.println(c2.add(a,b));
		System.out.println(c2.diff(a, b));
		System.out.println(c2.mul(a,b));
		System.out.println(c2.div(a, b));
		
	}

}
