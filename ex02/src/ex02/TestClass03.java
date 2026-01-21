package ex02;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		int i;
		Scanner input = new Scanner(System.in);
		String s1 = null, s2 = null;
//		System.out.println( s1.equals(null) );
		System.out.println( s1 == null );
		if( s1 != null ) {
			System.out.println( s1.equals(s2) );
		}else {
			System.out.println("s1은 null");
		}
	}
}



