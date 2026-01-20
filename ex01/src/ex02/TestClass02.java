package ex02;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		//System.out.println("실행?");
		char ch = 0;
		double dou = 0;
		String str = null;
		
		int number = 0;
		
		int k=0, e=0, m=0;
		System.out.println( k );
		int sum;
		sum = k + e + m;
		System.out.println("합 : " + sum);
	}
	public static void main01(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		String name;
		System.out.println("이름 입력 : ");
		name = input.next();
		
		System.out.print("수 입력 : ");
		num = input.nextInt();
		
		System.out.println("이름 : " + name);
		System.out.println("수 : " + num);
	}
}





