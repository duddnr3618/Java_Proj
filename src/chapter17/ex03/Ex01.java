package chapter17.ex03;


class Tiger {
	String name = "호랑이";
}

class Lion {
	String name = "사자";
}

class Eagle {
	String name = "독수리";
}

class Animal <T> {
	//getter
		private T t;
		public T getT() {
			return t;
		}
		
		//setter
		public void setT (T t) {
			this.t = t;
		}
	
}



public class Ex01 {

	public static void main(String[] args) {
	//Animal generic클래스에 tiger , lion , eagle 클래스를 주입하고 getter로 가져와서 필드의 내용을 출력
		
		//객체생성 (호랑이)
		Animal <Tiger> tiger = new Animal <Tiger> ();
		
		//setter을 사용해서 Apple객체를 주입
		tiger.setT(new Tiger ()); 		//setter을 사용해서 Apple객체를 주입
		
		//getter를 사용해서 Apple 객체를 가져옴 -> 자신이 원하는 객체를 주입후 다운캐스팅 없이 출력가능하다.
		System.out.println( tiger.getT().name);
		tiger.getT();
		
		//객체생성 (사자)
		Animal <Lion> lion = new Animal <Lion> ();
				
		//setter을 사용해서 Tiger객체를 주입
		lion.setT(new Lion ()); 		
				
		//getter를 사용해서 Lion 객체를 가져옴 -> 자신이 원하는 객체를 주입후 다운캐스팅 없이 출력가능하다.
		System.out.println( lion.getT().name);
		lion.getT();
				
				
		//객체생성 (독수리)
		Animal <Eagle> eagle = new Animal <Eagle> ();
				
		//setter을 사용해서 Eagle객체를 주입
		eagle.setT(new Eagle ()); 		
		
		//getter를 사용해서 Eagle 객체를 가져옴 -> 자신이 원하는 객체를 주입후 다운캐스팅 없이 출력가능하다.
		System.out.println( eagle.getT().name);
		eagle.getT();
				
		
	}

}
