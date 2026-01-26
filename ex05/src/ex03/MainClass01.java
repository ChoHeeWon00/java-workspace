package ex03;

import java.util.ArrayList;

class TestClass01 extends ArrayList<String>{
	@Override
	public boolean add(String e) {
		//System.out.println("내가 만든 add 기능");
		e += "무언간 연산";
		return true;
	}
	@Override
	public String get(int index) {
		return "내가 만든 get 전달";
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t01 = new TestClass01();
		t01.add("111");
		System.out.println( t01.get(0) );
		
	}
}
