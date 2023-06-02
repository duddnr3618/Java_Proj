package chapter18.ex05;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Student {	//Map Key로 사용 : 중복되면 안된다 -> 2개 오버라이딩 (equals , hashCode)
	
	int stuID; 		//<Key> 중복되지 않도록 코딩
	String stuName;
	
	Student (int stuID , String stuName) {
		this.stuID = stuID;
		this.stuName = stuName;
	}
	
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

	
	
	@Override
		public int hashCode() {
			return Objects.hash(stuID);
			
		}
	
	@Override
		public String toString() {
			return "학생의 이름과 ID :  " + stuName + " , "+ stuID ;
		}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		Map <Student , String>  lmap = new LinkedHashMap ();
		Student s1 = new Student (111 , "홍길원");
		Student s2 = new Student (222 , "홍길투");
		Student s3 = new Student (333 , "홍길쓰리");
		Student s4 = new Student (111 , "홍길포");
		Student s5 = new Student (111 , "홍길파이브");
		
		lmap.put(s1, "홍길원");
		lmap.put(s2, "홍길투");
		lmap.put(s3, "홍길쓰리");
		lmap.put(s4, "홍길포");
		lmap.put(s5, "홍길파이브");
		
		System.out.println(lmap);
		
		
		
	}

}
