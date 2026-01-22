package ex02;

import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		//7번 : 입력값(숫자)를 거꾸로 표현
		Scanner input = new Scanner(System.in);
		int su=0;
		System.out.print("수 입력 : ");  
		su = input.nextInt();
		System.out.print(su + " 거꾸로 => ");
		int temp=0,result=0;
		while(su != 0) {
			temp = su%10;  
			su = su/10;
			result = (result+temp)*10;
		}
		System.out.println(result/10);

	}
}
