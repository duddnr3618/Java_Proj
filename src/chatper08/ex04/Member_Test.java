package chatper08.ex04;

public class Member_Test {

	public static void main(String[] args) {
		//Member 객체 생성후 setter로 주입 / getter로 필드의 값을 출력
		
		Member m1 = new Member ();
		m1.setMemberNo(35);
		m1.setMemberId("abcdefg");
		m1.setMemberPass("a1s2d3f6");
		m1.setMemberEmail("aaa@aaa.aaa");
		m1.setMemberAge(25);
		
		System.out.println(m1.getMemberNo());
		System.out.println(m1.getMemberId());
		System.out.println(m1.getMemberPass());
		System.out.println(m1.getMemberEmail());
		System.out.println(m1.getMemberAge());
		

	}

}
