package chatper08.ex03;

class Student {		//현재 default접근제어자로 되어있다.
					// - 외부패키지에서 접근이 불가능.
	
	//외부에서 접근이 불가능 : 외부클래스에서 필드에 직접 값을 접근 할수 없도록 설정.
	private String stuName ;	//
	private String stuAddr ;
	private int age ;
	private double weight ;
	
	//getter / setter : private 필드에 값을 넣거나 (setter) , 값을 불러올때(getter)사용.
	//접근 지정자를 public
	//gitter : 출력
	//setter : 입력
	
	//StuName 필드에 대한 getter : 필드의 값을 리턴.
	public String getStuName () {
		return stuName;
	}
	//StuName 필드에 대한 setter : 필드의 값을 외부에서 주입.
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	//getter : stuAddr
	public String getStuAddr () {
		return stuAddr ;
	}
	
	//setter : stuAddr
	public void setStuAddr(String stuAddr) {
		this.stuAddr = stuAddr;
	}
	
	//getter : age
	public int getAge () {
		return age;
	}
	
	//setter : age
	public void setAge (int age) {
		this.age = age;
	}
	
	//getter : weight
	public double getWeight () {
		return  weight;
	}
	
	//setter : weight
	public void setWeight (double weight) {
		this.weight = weight;
	}
}

public class Private {
	public static void main(String[] args) {
		
		
		//private 필드에 직접 접근 불가 : 외부클래스에서 getter,setter를 사용해서 값을 출력하고 입력
		Student s1 = new Student ();
//		s1.stuName = "홍길동";				//private
//		System.out.println(s1.stuName);		//private
		
		//getter을 사용 해쇼 필드의 내용을 출력
		System.out.println(s1.getStuName());
		
		//setter를 사용해서 필드의 값을 입력
		s1.setStuName("홍길동");					//setter로 입력
		System.out.println(s1.getStuName());	//getter로 불러와 출력
		
		//setter를 사용해서 필드의 값 입력
		//getter를 사용해서 필드의 값 출력
		s1.setStuAddr("서울");
		System.out.println(s1.getStuAddr());
		
		s1.setAge(30);
		System.out.println(s1.getAge());
		
		s1.setWeight(50.5);
		System.out.println(s1.getWeight());
		
	}

}
