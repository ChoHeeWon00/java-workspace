package ex02;

import java.util.Scanner;

class NameClass{
	public String test() {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.println("이름 입력");
		name = input.next();
		return name;
	}
	public void print(String name) {
		//String name = null;
		System.out.println("print 입력 이름 : "+name);
	}
	
	public String[] inputNames() {
		String[] names = new String[3];
		Scanner input = new Scanner(System.in);
		for( int i=0 ; i < names.length ; i++) {
			System.out.println(i + ".번째 이름 입력");
			names[i] = input.next();
		}
		return names;
	}
	public void printNames(String[] arr) {
		System.out.println("--- print names ---");
		for( String s : arr ) {
			System.out.println( s );
		}
	}
	
}
public class Quiz01 {
	public static void main(String[] args) {
		NameClass nameClass = new NameClass();
		String name = nameClass.test();
		nameClass.print( name );
		
		System.out.println("---------");
		String[] s = nameClass.inputNames();
		nameClass.printNames( s );
		/*
		System.out.println("입력 받은 이름");
		for( String str : s ) {
			System.out.println( str );
		}
		*/
	}
}








