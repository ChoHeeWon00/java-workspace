package ex02;

class Test05{
	protected int num = 1234;
	
	public Test05(String n) {
		System.out.println(n + " : 부모 생성자");
	}
	public Test05() {
		System.out.println("부모 기본 생성자");
	}
	
	public void disp() {
		System.out.println("부모 disp");
	}
}
class TestClass05 extends Test05{
	String num = "자식 num";
	public void disp() {
		System.out.println("자식 disp");
	}
	public TestClass05() {
		super("111");
		System.out.println("자식 기본 생성자");
	}
	public void test() {
		//int num = 1000;
		System.out.println( num );
		System.out.println( this.num );
		System.out.println( super.num );
		
		super.disp();
	}
}
public class MainClass05 {
public static void main(String[] args) {
	TestClass05 t01 = new TestClass05();
	
	t01.test();
}
}







