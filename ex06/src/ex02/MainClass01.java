package ex02;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y,result = 0;
		System.out.println("수 입력");
		x = input.nextInt();
		y = input.nextInt();
		try {
			result = x / y;
			System.out.println("결과 : "+result);
		} catch (ArithmeticException e) {
			System.out.println("0입력 하지 마세요");
			System.out.println( e );
			System.out.println( e.getMessage() );
		}
		System.out.println("이어서 다음 문장들 실행...");
	}
}




