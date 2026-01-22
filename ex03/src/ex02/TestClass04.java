package ex02;

import java.util.ArrayList;

public class TestClass04 {
	public void sumFunc( int num ) { //int num = 10
		int sum = 0;
		//System.out.println("수 입력...");
		//int num = 10;
		for(int i=1 ; i<=num ; i++) {
			sum+=i;
		}
		System.out.println("1~10 합 : "+sum);
	}
	public int sumFunc1( int num ) { //int num = 10
		int sum = 0;
		for(int i=1 ; i<=num ; i++) {
			sum+=i;
		}
		//System.out.println("1~10 합 : "+sum);
		return sum;
	}
	
	public String[] test() {
		String[] arr = {"11","222","33"};
		return arr;
	}
	public String test01() {
		return "리턴";
	}
	public double test02() {
		return 1.111;
	}
	public int[] test03() {
		int[] arr = null;
		return arr;
	}
	public ArrayList test04() {
		ArrayList arr = null;
		return arr;
	}
	
}







