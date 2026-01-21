package ex03;

public class Quiz01 {
	public static void main(String[] args) {
		String[] arr1 = new String[] {"aaa","bbb"};
		String[] arr2 = new String[] {"111","222"};
		
		String inputId = "bbb";
		
		int i = 0 ;
		for( ; i < arr1.length ; i++ ) {
			if( arr1[i].equals(inputId) ) {
				System.out.println("i : " + i);
				System.out.println("arr1[i] : " + arr1[i]);
			}
		}
		System.out.println("다음 문장들 실행");
	}
}
