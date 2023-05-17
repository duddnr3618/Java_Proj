package chatper07.ex03;

class Product {
	//생성자 오버로딩을 통해서 필드의 갯수에 따라 생성자생성 
	// 객체 자체를 출력시 그 객체의 필드의 내용을 출력 
	
	//기본생성자
	public Product () {}
	
	//생성자 1개 -> Alt + s(단축키) 
	public Product (String proName) {
		this.proName = proName;
	}
	
	//생성자2개
	public Product(String proName, int proNo) {
	
		this.proName = proName;
		this.proNo = proNo;
	}
	
	//생성자3개
	public Product(String proName, int proNo, int proPrice) {
		
		this.proName = proName;
		this.proNo = proNo;
		this.proPrice = proPrice;
	}
	
	
	//생성자4개
	public Product(String proName, int proNo, int proPrice, int proCount) {
		
		this.proName = proName;
		this.proNo = proNo;
		this.proPrice = proPrice;
		this.proCount = proCount;
	}
	
	//필드
	String proName ;		//제품이름
	int proNo ;				//제품번호
	int proPrice; 			//제품가격
	int proCount;			//제품수량
	

	//메소드
	//객체를 출력시 객체의 필드의 값을 출력
	//Alt + Shift + S  (단축키) ->오버라이딩
	@Override
	public String toString() {
	return "Product [proName=" + proName + ", proNo=" + proNo + ", proPrice=" + proPrice + ", proCount=" + proCount
			+ "]";
		
	
}
}
public class Ex01 {

		public static void main(String[] args) {
			Product p1 = new Product ();
			Product p2 = new Product ("삼성");
			Product p3 = new Product ("애플",0000);
			Product p4 = new Product ("현대",1111,20000);
			Product p5 = new Product ("기아",2222,30000,5);
			
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			System.out.println(p4);
			System.out.println(p5);
			
		
		
		
	
		
		}
	
}
