package ex04;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Service01 s01 = new Service01();
		Service001 s001 = new Service001();
		int num;
		while(true) {
			System.out.println("1.학생관리 2.급식관리");
			num = input.nextInt();
			switch(num) {
				case 1: 
					s01.display();
					break;
				case 2: 
					s001.display();
					break;
			}
		}
	}
}
/*
	Controller,  Service,   Repository ,      DTO
	(App.js)   (contriner)  (DB와 연동되는 코드)
*/