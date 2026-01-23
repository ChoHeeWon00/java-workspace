package ex03;

import java.util.ArrayList;

class Test02{
	private String msg ="aaaa";
	
	public Test02(String msg, int num) {
		if(true) {
			this.msg = msg;
		}
		System.out.println(msg);
		System.out.println(num);
	}
	public Test02() {}
}
public class MainClass02 {
	public static void main(String[] args) {
		Test02 t01 = new Test02("aaaa",1000);
		Test02 t02 = new Test02(  );
		
		String s = new String();
		String s1 = new String("111");
		ArrayList arr = new ArrayList();
	}
}







