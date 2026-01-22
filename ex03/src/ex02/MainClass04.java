package ex02;

import java.util.ArrayList;

public class MainClass04 {
public static void main(String[] args) {
	TestClass04 t01 = new TestClass04();
	
	int num = 10;
	t01.sumFunc( num );
	
	int result = t01.sumFunc1( num );
	System.out.println( "1~10 합 : " + result );
	
	ArrayList<String> arr = new ArrayList<String>();
	t01.sumFunc(100);
	boolean bool = arr.add("문자열");
	System.out.println( bool +"참이면 저장 성공");
	
	String[] n = t01.test();
	System.out.println("n : "+n);
	String n1 = t01.test01();
	double n2 = t01.test02();
	int[] n3 = t01.test03();
	ArrayList n4 = t01.test04();
	
	ArrayList<Integer> arr01;
}
}









