package ex03;

public class TestClass01 {
	public static void main(String[] args) {
		int n1 = 9, n2 = 2;
		//정수 / 정수 = 정수(몫)
		System.out.println(n1 / n2);
		System.out.println( (double)n2 );
		// 실수 값 원할 시 하나라도 실수 형태
		System.out.println(n1 / (double)n2);
		// 나머지 연산자
		System.out.println( n1 % n2 );
		
		// +=, -=, *=
		System.out.println("==== 복합 대입 연산자 ===");
		n1 = n2 = 5;
		n1 += 1; // n1(6) = n1(5) + 1
		System.out.println( n1 );
		n1 -= 1; // n1(5) = n1(6) - 1
		System.out.println( n1 );
		n1 *= n2; // n1(25) = n1(5) * n2(5)
		System.out.println( n1 );
		n1 /= n2; // n1(5) = n1(25) / n2(5)
		System.out.println( n1 );
		n1 %= n2; // n1(0) = n1(5) % n2(5)
		System.out.println( n1 );
		
		System.out.println("=== 관계 연산자 ===");
		n1 = 5;
		n2 = 4;
		System.out.println( n1 > n2 );
		System.out.println( n1 <= n2 );
		System.out.println( n1 == n2 );
		System.out.println( n1 != n2 );
		// === 없음
		
		System.out.println("=== 논리 연산자 ===");
		// && , || ,  !
		int n3 = 10;
		n1 = 5; n2 = 7;
		
		System.out.println( n1>n2 && n1>n3 );
		System.out.println( n1<n2 && n1<=n3 );
		
		System.out.println("--- and연산 ---");
		System.out.println( true && true );
		System.out.println( true && false );
		System.out.println( false && false );
		
		System.out.println("--- or연산 ---");
		System.out.println( true || true );
		System.out.println( true || false );
		System.out.println( false || false );
		
		System.out.println("--- not연산 ---");
		System.out.println( !true );
		System.out.println( !false );
		
		System.out.println("=== 증감 연산자 ===");
		n1 = 10; n2 = 20;
		System.out.println("변경전 n1 : "+n1);
		n1--;
		System.out.println("변경후 n1 : "+n1);
		
		System.out.println("변경전 n2 : "+n2);
		--n2;
		System.out.println("변경후 n2 : "+n2);
		
		System.out.println("------------");
		
		n1 = n2 = 10;
		System.out.println("변경 전 n1 : "+n1);
		n3 = n1++ + 100 * 2;
		System.out.println("변경 후 n1 : "+n1);
		System.out.println("n3 : "+n3);
		
		System.out.println("변경 전 n2 : "+n2);
		n3 = ++n2 + 100 * 2;
		System.out.println("변경 후 n2 : "+n2);
		System.out.println("n3 : "+n3);
		
		System.out.println("=== 삼항 연산자 ===");
		n1 = 20; n2 = 10;
		String result = (n1 < n2) ? "n1이 n2보다 크다" : "거짓";
		System.out.println( result );
	}
}











