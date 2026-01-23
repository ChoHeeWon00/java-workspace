package ex02;

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		System.out.println( t.getNum() );
		int n = 8888; //입력된값
		t.setNum( n );
		int k = t.getNum();
		System.out.println("num : " + k );
	}
}
