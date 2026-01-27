package ex04;


class TestClass04 implements Test04{
	@Override
	public void test() {
		
	}
}
interface Test04{
	public void test();
}
public class MainClass04 {
	public static void main(String[] args) {
		Test04 t01 = new Test04() {
			@Override
			public void test() {
				System.out.println("test 실행");
			}
		};
		t01.test();
		
		Test04 t02 = () -> System.out.println("람다식");
		
		t02.test();
	}
}






