package chatper06.ex01;

class Animal {
	
	//기본생성자
	public Animal () {}
	
	// 필드
	String animalName;
	String animalCry;
	String animalRun;
	int animalAge;
	double animalWeight;
	
	//필드의 내용을 출력 : 필드의 내용 출력
	public void print() {
	System.out.println("동물이름 : "+ animalName);
	System.out.println("동물의 울음소리 : "+ animalCry);
	System.out.println("동물의 운동 : "+ animalRun);
	System.out.println("동물의 나이 : "+ animalAge);
	System.out.println("동물의 몸무게 : "+ animalWeight+"kg\n");
	
	
	}
}

public class Object05 {
	
	public static void main(String[] args) {
		
		//Animal 클래스 : tiger 객체생성 -> "호랑이"/"어흥"/"껑충껑충"/10/300
		//Animal 클래스 : egle 객체생성 -> "독수리"/"키이오"/"훨훨날아감"/20/30
		//Animal 클래스 : dog 객체생성 -> "강아지"/"멍멍"/"팔짝팔짝/40/20

		Animal tiger = new Animal();
		System.out.println(tiger);
		
		tiger.animalName = "호랑이";
		tiger.animalCry = "어흥";
		tiger.animalRun = "껑충껑충";
		tiger.animalAge = 10;
		tiger.animalWeight = 300.0;
		tiger.print();
		
		Animal egle = new Animal();
		System.out.println(egle);
		egle.animalName = "독수리";
		egle.animalCry = "키이오" ;
		egle.animalRun = "훨훨날아감";
		egle.animalAge = 20;
		egle.animalWeight = 30.0;
		egle.print();
		
		Animal dog = new Animal();
		System.out.println(dog);
		dog.animalName = "강아지";
		dog.animalCry = "멍멍";
		dog.animalRun = "팔짝팔짝";
		dog.animalAge = 40;
		dog.animalWeight = 20.0;
		dog.print();
		
		System.out.println("==================================");
		
		//Animal 타입의 객체만 저장이 가능
		Animal [] arr1 = new Animal[3];	
		//각 배열의 방에 Animal 타입의 객체를 저장 : Animal 클래스로 생성됨 / Animal타입을 가지고 있다.
		arr1[0]= tiger;		//arr1 0번째 방에 tiger객체를 저장
		arr1[1]= egle;		//arr1 1번째 방에 egle객체를 저장
		arr1[2]= dog;		//arr1 2번째 방에 dog객체를 저장
		
		//각 배열의 방에는 객체의 Heap의 주소가 들어있다.
		System.out.println(tiger);
		System.out.println(egle);
		System.out.println(dog);
		
		System.out.println("================================");
		//배열의 방의 저장된 객체를 다시 변수에 할당해서 끄집어 낸다.
		// 객체의 변수를 선언후 끄집어 낸다.
		Animal a1 = null;			//객체형 변수 : a1
		System.out.println(a1);
		a1 = arr1[0];				//arr1[0]방의 값을 가지고 와서 a1 변수에 할당.
		System.out.println(a1);
		
		
		
		System.out.println("=============================");
		
		Animal out1 = arr1[0];
		Animal out2 = arr1[1];
		Animal out3 = arr1[2];
				
		System.out.println(out1);
		out1.print();
		
		System.out.println(out2);
		out2.print();
		
		System.out.println(out3);
		out3.print();
		
		//방의 크기 지정후 나중에 각 방에 값을 입력
		int [] arr11 = new int[3];
		double [] arr12 = new double [3];
		String [] arr13 = new String [3];
		
		
		
		
		
	}

}
