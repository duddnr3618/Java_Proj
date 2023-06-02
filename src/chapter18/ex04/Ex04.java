package chapter18.ex04;

import java.util.Set;
import java.util.TreeSet;

class Aa implements Comparable <Aa> {
	String name;
	
	Aa (String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Aa o) {
	
		return (this.name).compareTo(o.name);
	}
	

	@Override
	public String toString() {
		return " " + name + " ";
	}
	
	
	
}

class Bb implements Comparable <Bb> {
	int userID;
	
	Bb (int userID) {
		this.userID = userID;
	}

	@Override
	public int compareTo(Bb o) {
		
		if (this.userID < o.userID ) {
			return -1;
			
		}else if (this.userID == o.userID) {
			return 0;
			
		}else {
			return 1;
			
		}
	}
	
	@Override
	public String toString() {
		return " " + userID + " ";
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		
		//두 클래스를 TreeSet에 저장시 정렬해서 출력되도록 구현
		Set<Aa> aaSet = new TreeSet ();
		aaSet.add(new Aa("111")); aaSet.add(new Aa("222")); aaSet.add(new Aa("111")); 
		aaSet.add(new Aa("111")); aaSet.add(new Aa("333"));
		System.out.println(aaSet);
		
		Set<Bb> bbSet = new TreeSet ();
		bbSet.add(new Bb (1));
		bbSet.add(new Bb (2));
		bbSet.add(new Bb (3));
		bbSet.add(new Bb (4));
		bbSet.add(new Bb (4));
		bbSet.add(new Bb (4));
		bbSet.add(new Bb (5));
		
		System.out.println(bbSet);

	}

}
