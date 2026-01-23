package ex01;
class TestClass03{
	public final static String MSG2 = "final";
	
	public static String msg = "클래스 변수(static변수)";
	public String str = "인스턴스 변수";
	
	public static void staticFunc() {
		System.out.println("static 메소드");
	}
	public void func() {
		System.out.println("func 메소드");
	}
}
public class MainClass03 {
	public static void main(String[] args) {
		System.out.println( TestClass03.msg );
		TestClass03.msg = "다른 내용으로 수정";
		System.out.println( TestClass03.msg );
		
		System.out.println( TestClass03.MSG2 );
		//TestClass03.MSG2 = "수정 안됨";
		
		System.out.println("--------------");
		
		TestClass03.staticFunc();
		
		TestClass03 t = new TestClass03();
		t.func();
		t.staticFunc();
	}
}






