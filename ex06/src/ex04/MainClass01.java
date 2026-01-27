package ex04;

interface A01{
	public void test() ;
}
class AAA{
	public void aaa() {
		System.out.println( "부모 기능 ");
	}
}
class B01 extends AAA implements A01{
	public void b01() {
		System.out.println("b01 메소드");
	}
	@Override
	public void test() {
		System.out.println("오버라이드 test");
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		A01 a01 = new B01();
		B01 b01 = new B01();
		b01.test();
		
	}
}





