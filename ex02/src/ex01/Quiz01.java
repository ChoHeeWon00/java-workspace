package ex01;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		String office = null, home = null;
		
		for(;;) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch( num ) {
				case 1: 
					System.out.println("집 주소 입력");
					home = input.next();
					break;
				case 2: 
					System.out.println("회사 주소 입력");
					office = input.next();
					break;
				case 3: 
					if( home != null )
						System.out.println("집 주소 : "+home);
					else
						System.out.println("집 주소가 없습니다");
					
					System.out.println("회사 주소 : "+office);
					break;
			}
		}
	}
}
