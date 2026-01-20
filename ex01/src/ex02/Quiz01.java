package ex02;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int kor, eng, math;
		int sum;
		System.out.print("이름 입력 : ");
		name = input.next();
		System.out.print(name+"님 국어 : ");
		kor = input.nextInt();
		System.out.print(name+"님 영어 : ");
		eng = input.nextInt();
		System.out.print(name+"님 수학 : ");
		math = input.nextInt();
		sum = kor + eng + math;
		
		System.out.println("이름 : "+name);
		System.out.println("국 : "+kor);
		System.out.println("영 : "+eng);
		System.out.println("수 : "+math);
		System.out.println("합 : "+sum);
		System.out.println("합 : "+(kor+eng+math));
	}
}







