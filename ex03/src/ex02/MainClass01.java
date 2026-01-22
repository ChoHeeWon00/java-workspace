package ex02;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main실행");
		int num;
		TestClass01 t01 = new TestClass01();
		t01.name="aaa";
		t01.age = 20;
		System.out.println( t01.name );
	}
}
