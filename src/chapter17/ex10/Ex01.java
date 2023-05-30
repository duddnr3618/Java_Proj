package chapter17.ex10;

//제너릭 클래스
//X : x좌표의 포인트 / Y : y좌표의 포인트
//Point클래스는 x,y좌표를 표시하는 클래스

class Point <X,Y> {
	X x;
	Y y;
	
	//생성자를 사용해서 필드의 값 입력
	Point (X x , Y y) {
		this.x=x;
		this.y=y;
	}
	
	//get로 필드에 값을 출력
	public X getx() {
		return x;
	}
	public Y gety () {
		return y;
	}
	
}

//제너릭 메소드가 포함된 클래스 
class GenericM {
	//두점의 좌표를 매개변수로 받아서 넓이를 구해 더블형으로 리턴 p1(10.5 , 13.3) p2 (30.5 , 27.3)
	public static <T,V> double makeReactangle (Point <T,V> p1 , Point <T,V> p2) {
		
		//두점의 좌표값을 리턴 받아서 넓이를 구해서 double형으로 리턴
		
		double width = (double)p2.getx() - (double)p1.getx() ;
		double hight = (double)p2.gety() - (double)p1.gety() ;
		
		return width*hight;
	}
	
	
}



public class Ex01 {

	public static void main(String[] args) {
		//두점의 포인트 객체 생성 : p1 , p2
		Point <Double , Double> p1 = new Point<>(10.5 , 13.3);
		Point <Double , Double> p2 = new Point<>(30.5 , 27.3);
		
		double rectangle = GenericM.<Double,Double>makeReactangle(p1, p2);	//제너릭 메소드 호출
		
		System.out.println("두점의 좌표의 넓이는 : " + rectangle);
		
	}

}
