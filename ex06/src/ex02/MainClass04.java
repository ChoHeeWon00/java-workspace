package ex02;

class AAA{}
class BBB extends AAA{
	public void test( Object num ) {
		System.out.println("test : "+num);
	}
}
public class MainClass04 {
public static void main(String[] args) {
	BBB b = new BBB();
	AAA a = new BBB();
	b.test( "1000" );
	
	Object obj = 1.1111;
	System.out.println( obj );
	
	
	int[] arr = {10,20,30};
	int x = 10, y = 0, result = 0;;
	try {
		for(int i=0 ; i < 1 ; i++) {
			System.out.println(arr[i]);
		}
		result = x / 2;
		System.out.println("result : "+result);
		return;
	}catch ( RuntimeException e) {
		System.out.println(" exception처리 ");
		System.out.println( e );
		System.out.println( e.getMessage() );
	}finally {
		System.out.println("무조건 실행되는 코드");
	}
	System.out.println("다음 문장들 실행...");
}
}






