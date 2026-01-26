package ex02;

class Test04{
	public Test04(String name) {
		System.out.println(name + " : test 04 부모 생성자");
	}
}
class TestClass04 extends Test04{
	public TestClass04() {
		super("값 전달");
		System.out.println("TestClass04 자식 생성자");
	}
	public TestClass04(String n) {
		super(n);
		System.out.println("값 받는 자식 생성자");
	}
}
public class MainClass04 {
	public static void main(String[] args) {
		TestClass04 t01 = new TestClass04();
		TestClass04 t02 = new TestClass04("전달사항");
	}
}




