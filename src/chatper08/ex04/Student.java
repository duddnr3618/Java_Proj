package chatper08.ex04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
public class Student {

	private String stuName;
	private String stuEmail;
	private int stuAge;
	private double stuWeight;

	//lombok 어노테이션 (@) : 클래스 블락 위에 어노테이션을 붙인다.
	// @getter : 클래스 하위의 모든 필드에 대해서 getter을 자동으로 만듬
	// @setter : 클래스 하위의 모든 필드에 대해서 setter을 자동으로 만듬 
	// @toString : 클래스 하위의 모든 필드에 대해서 toString메소드를 자동으로 만듬.
	// @NoArgsConstructor : 기본 생성자를 자동으로 만듬 -> Student () {} 
	// @AllArgsConstructor : 모든 생성자를 자동으로 만듬.
	// @Data : 모든 위의 모든 어노테이션을 자동으로 만듬. -> @getter,@setter,@toString , @NoArgsConstructor 
	
	
	
}
