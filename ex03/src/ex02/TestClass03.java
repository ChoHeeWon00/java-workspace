package ex02;

import java.util.Scanner;

public class TestClass03 {
	public int age;
	public void test() {
		Scanner input = new Scanner(System.in);
		int num = 0 , sum = 0;
		System.out.println("수 입력");
		num = input.nextInt();
		for(int i=1 ; i <= num ; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + num + " 합 : " + sum );
	}
}
