package chapter18.ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Member {
	
	String memberID;
	String memberName ;
	
	Member(String memberID , String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	//객체를 출력시 필드의 내용을 출력
		@Override
		public String toString() {
			return memberName + "님의 ID : " + memberID + " 입니다.";
		}
	
	
	//중복된 값을 식별 : equals() , hashCode()
	//equals()
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Member) {
			if (this.memberID == ((Member)obj).memberID)
				return true;
		}else {
			return false;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(memberID);
	}
	
}


class MemberMethod {
	//Set 정의
	Set <Member> memSet ;
	
	MemberMethod () {
		this.memSet = new HashSet ();
		
	}
	
	//메소드를 생성해서 호출
	public void addMember (Member member) {
		
		//Member 객체를 인풋으로 set에 저장
		memSet.add(member);
		
		
	}
	
	public boolean removeMember (String memberID) {
		
		//memberID를 인풋(정수) 받음 -> set -> iterator -> 인풋받은 memberID를 검색 -> 동일할 경우 삭제 
		
		Iterator iterator = memSet.iterator();
		
		while (iterator.hasNext()) {
			Member member = (Member) iterator.next();
			
		if (memberID == member.memberID) {
			memSet.remove(member);
			return true;	//삭제 완료시 true / 찾을수 없을 경우 false

		}
		}
		System.out.println("회원님의 ID는 검색되지 않았습니다.");
		return false;
		
	}
	
	//set에 저장된 member객체의 필드의 값을 출력
	public void showMember() {
		System.out.println("======== 향상된 for문으로 출력 =========");
		for ( Member k : memSet) {
			System.out.print(k + " ");
			System.out.println();
		}
		System.out.println();
		
		System.out.println("=========iterator 으로 출력 ============");
		Iterator i = memSet.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
					}
	}
	
	//set에 저장된 총 갯수 출력
	public void showSize () {
		
		System.out.println("Set에 저장된 Member의 총 수는 : "+memSet.size());
		System.out.println();
		
	}
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		//Member객체 5개 생성
		Member m1 = new Member("111" , "홍길원");
		Member m2 = new Member("222" , "홍길투");
		Member m3 = new Member("333" , "홍길쓰리");
		Member m4 = new Member("444" , "홍길포");
		Member m5 = new Member("111" , "홍길파이브");
		
		
		//MemberMethod객체의 메소드를 사용해서 set에 객체를 저장 및 삭제 출력
		MemberMethod mem = new MemberMethod ();
		mem.addMember(m1);
		mem.addMember(m2);
		mem.addMember(m3);
		mem.addMember(m4);
		mem.addMember(m5);
		
		//set에 저장된 메소드 호출
		mem.showSize();
		mem.showMember();
		System.out.println();
		
		System.out.println("========== 삭제후 호출==========");
		mem.removeMember("111");
		mem.showSize();
		mem.showMember();
	
	}

}
