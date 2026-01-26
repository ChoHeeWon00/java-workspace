package ex04;

import java.util.ArrayList;

class Test01<E>{
	public E test(E n1, E n2) {
		System.out.println(n1);
		System.out.println(n2);
		return n1;
	}
}
class Dto{
	private String name;
}
public class MainClass01 {
	public static void main(String[] args) {
		Test01<Integer> t01 = new Test01<>();
		int re01 = t01.test(100, 200);
		System.out.println("int return : "+ re01);
		
		Test01<Dto> t02 = new Test01<>();
		Dto d01 = new Dto();
		Dto d02 = new Dto();
		t02.test( d01, d02 );
		
		
		Integer num = 100; //int
		int num2 = 200;
		num = 12345;
		System.out.println( num );
		ArrayList< Integer > arr;
		/*
		 참또 는 거짓 : boolean => Boolean
		 
		 정수 표현 : 2byte, 4byte, 8byte
		 short => Short
		 int => Integer
		 long => Long
		 
		 //실수 표현 : 4, 8byte
		 float => Float
		 double => Double
		 
		 //문자 표현 : 1 , 2byte
		 byte => Byte
		 char => Character
		 
		 
		 
		 
		 */
		
		
	}
}
