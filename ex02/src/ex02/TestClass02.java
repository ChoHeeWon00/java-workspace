package ex02;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		int i = 1;
		//for( int i = 1 ; i<=10 ; i++ ) {
		while( i<=10 ) {
			System.out.println(i);
			i++;
		}
		i = 1;
		//for( ; ; ) {
		while( true  ) {
			i++;
			System.out.println(i+".반복");
			if( i == 5 ){
				break;
			}
		}
		System.out.println("다음 문장들 실행");
		
		i = 0;
		while( i < 5) {
			i++;
			if( i == 3 ) {
				System.out.println(333333);
				//break;
				continue;
			}
			System.out.println( i );
		}
		System.out.println("다음 문장들 실행");
		
		Scanner input = new Scanner(System.in);
		String n1, n2;
		
		System.out.println("n1 입력");
		n1 = input.next();
		System.out.println("n2 입력");
		n2 = input.next();
		//int num = 100, num2 = 100;
		if( n1.equals(n2) ) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
	}
}







