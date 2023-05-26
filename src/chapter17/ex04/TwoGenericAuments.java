package chapter17.ex04;

class KeyValue <K,V> {
	/*
	  	A~Z 중 임의의 타입을 지정
	  	T : type
	  	K : key
	  	V : value
	  	n : number
	 */
	
	private K key ;
	private V value ;
	
	//getter / setter
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
}

public class TwoGenericAuments {

	public static void main(String[] args) {

		//1.String , Integer를 아규먼트로 하는 객체생성
		
		KeyValue <String , Integer> kv1 = new KeyValue <> ();
		
		//setter 주입
		kv1.setKey("사과");
		kv1.setValue(1000);
		
		//getter 주입
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		
		KeyValue <String , Integer> kv2 = new KeyValue <> ();
		kv2.setKey("오렌지");
		kv2.setValue(2000);
		
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		System.out.println();
		
		//2.Integer , String를 아규먼트로 객체생성
		KeyValue <Integer , String > kv3 = new KeyValue <> ();
		kv3.setKey(404);
		kv3.setValue("해당 요청은 페이지를 찾을수 없습니다.");
		
		System.out.println(kv3.getValue());
		System.out.println(kv3.getKey());
		System.out.println();
		
		//3.아규먼트에 void를 사용하면 해당 아규먼트는 사용되지 않도록 설정 // 주의) void V로(대문자)로 사용해야한다.
		KeyValue <String , Void> kv4 = new KeyValue <> (); //->두번제 아규먼트는 사용하지 않겠다라고 선언
		
		kv4.setKey("Key값만 사용");
		kv4.setValue(null);		//다른값을 넣을수 없다. void로 지정된 곳에는 null만 입력된다.->사용하지 않는다.
		
		System.out.println(kv4.getKey());
		System.out.println(kv4.getValue());
	}

}
