package ex02;

public class MainClass06 {
	public static void main(String[] args) {
		int age = 0;
		System.out.println("나이 입력");
		try {
			age = -200;
			if( age < 1 || age < 100)
				throw new Exception("에러 메세지");
			System.out.println("당신 나이 : "+age);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println( e );
			System.out.println( e.getMessage() );
		}
	}
}










