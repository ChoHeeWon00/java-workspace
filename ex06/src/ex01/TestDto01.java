package ex01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter

public class TestDto01 {
	private String name;
	private int age;
	//@NoArgsConstructor
	public TestDto01() {}
	//@AllArgsConstructor
	public TestDto01(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//@ToString
	public String toString() {
		return "[" + name + "," + age + "]";
	}
}







