package chapter18.ex04;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
	int stuID;
	String stuName;
	String stiPhine;
	
	//생성자 자동 호출 : alt+shift+s -> constructor field
	public Student(int stuID, String stuName, String stiPhine) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.stiPhine = stiPhine;
	}
	
	//equals()
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Student) {
			if (this.stuID == ((Student)obj).stuID )
				return true;
		}else {
			return false;
			
		}
		return false;
	}
	
	//hashCode()
	@Override
	public int hashCode() {
		
		return Objects.hashCode(stuID);
	}
	
	@Override
	public String toString() {
		return " " + stuID + " " ;
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		Set<Student> hset = new HashSet();
		
		//학생의 객체 5개 생성하여 set에 넣을경우  stuID 필드에 중복된 값을 제거해 출력하도록 
		//stuID 필드의 equals() , hashCode() 재정의
		
		Student s1 = new Student (123 , "홍길원" , "111");
		Student s2 = new Student (456 , "홍길투" , "112");
		Student s3 = new Student (789 , "홍길쓰리" , "113");
		Student s4 = new Student (123 , "홍길포" , "114");
		Student s5 = new Student (123 , "홍길파이브" , "115");
		
		hset.add(s1); hset.add(s2); hset.add(s3); hset.add(s4); hset.add(s5);
		System.out.println(hset);
		System.out.println(hset.size());
		
		
		

	}

}
