package ex01;

import java.util.Scanner;

public class TestClass01 {
	public static void main(String[] args) {
		int select = 3;
		switch( select % 2 ) {
			case 1: System.out.println("1입력"); break;
			case 2: System.out.println("2입력"); break;
			default: System.out.println("그 외의 값 입력"); break;
		}
		System.out.println("다음 문장들 실행...");
		
		String str = "반갑";
		switch(str) {
			case "안녕" : System.out.println("안녕 입력"); break;
			case "반갑" : System.out.println("반갑 입력"); 
		}
		Scanner input = new Scanner(System.in);
		String msg;
		for( ;  ; ) {
			System.out.println("입력");
			msg = input.next();
			System.out.println(msg);
		}
	}
}







