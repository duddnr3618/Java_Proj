package chatper08.ex04;

public class Student_Test {

	public static void main(String[] args) {
		//Student 객체생성
		Student s1 = new Student();
		s1.setStuName("호호홍길동");
		s1.setStuEmail("aaa@aaa.aaa");
		s1.setStuAge(20);
		s1.setStuWeight(50.59);
		
		System.out.println(s1.getStuName());
		System.out.println(s1.getStuEmail());
		System.out.println(s1.getStuAge());
		System.out.println(s1.getStuWeight());
		
		//toString 호출
		System.out.println(s1);
		System.out.println(s1.toString());
	}

}
