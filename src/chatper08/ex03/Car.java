package chatper08.ex03;

public class Car {		//public 접근자라 외부패키지에서 접근이 가능.
	
	private String company ;
	private String carName ;
	private int carMaxSpeed ;
	private double carWeight ;
	
	//getter / setter
	public String getCompany () {
		return company;
	}
	
	public void setCompay (String company) {
		this.company = company;
	}
	
	public String getCarName () {
		return carName;
	}
	
	public void setCarName (String carName) {
		this.carName = carName;
	}
	
	public int getCarMaxSpeed () {
		return carMaxSpeed;
	}
	
	public void setCarMaxSpeed (int carMaxSpeed) {
		this.carMaxSpeed = carMaxSpeed;
	}
	
	public double getCarWeight () {
		return carWeight;
	}
	
	public void setCarWeight (double carWeight) {
		this.carWeight = carWeight;
	}
	
	
	
	public static void main(String[] args) {
		
		Car c1 = new Car () ;
		
		c1.setCompay("현대");
		c1.setCarName("제네시스");
		c1.setCarMaxSpeed(200);
		c1.setCarWeight(1000.5);
		
		System.out.println(c1.getCompany());
		System.out.println(c1.getCarName());
		System.out.println(c1.getCarMaxSpeed());
		System.out.println(c1.getCarWeight());
		
		
	}

}
