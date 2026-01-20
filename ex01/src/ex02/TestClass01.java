package ex02;
/*
	int : 정수 표현 - 4byte( +- 약 21억 숫자까지 )
	float, double : 실수 표현 - 4(소수점 6), 8byte(13자리) 
	char : 문자 하나 표현 - 2byte(아, 어, 오, 요, a,b)
	boolean : 참, 또는 거짓 표현 - 1byte (true, false)
*/
public class TestClass01 {
	public static void main(String[] args) {
		int num = 100;
		double weight = 55.0, height = 170.3;
		System.out.println( num );
		System.out.println("나의 무게 : "+weight+"kg");
		System.out.println("나의 키 : "+height+"cm");
		
		num = num + 100;
		System.out.println("num 변경 : " + num );
		
		char ch = 'a';
		num = 5;
		int ret = ch + num;
		System.out.println("a + 5 = "+ret);
		System.out.println("a + 5 = "+ (char)ret);
		
		final int number = 200;
		//number = 3000;
		final String STR = "문자열";
		System.out.println("str : " + STR);
	}
}







