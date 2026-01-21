package ex03;

import java.util.ArrayList;

public class TestClass02 {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("안녕");
		arr.add("111");
		arr.add("222");
		
		String s = arr.get(2);
		System.out.println( s );
		int[] arr1 = new int[5];
		
		for(int i=0; i < arr.size() ; i++ ) {
			s = arr.get(i);
			System.out.println( s );
		}
		System.out.println("--- foreach ---");
		for(String a : arr ) {
			System.out.println( a );
		}
		
		System.out.println( arr.contains("안녕") );
		System.out.println( arr.contains("없는값") );
		
		boolean bool = arr.contains("안녕11111");
		System.out.println( "bool : " + bool );
		if( bool ) {
			System.out.println("해당 값은 존재합니다");
		}else {
			System.out.println("없음");
		}
		
		System.out.println("삭제 전 arr : " + arr );
		System.out.println( arr.remove(1) );
		System.out.println("삭제(1) 후 arr : " + arr );
		
		System.out.println( arr.remove("안녕") );
		System.out.println("삭제(안녕) 후 arr : " + arr );
		
		arr.add("안녕");
		arr.add("111");
		arr.add("222");
		
		System.out.println("arr 추가 후 : "+arr);
		System.out.println( arr.indexOf("안녕") );
		System.out.println( arr.indexOf("안녕111") );

		int index = arr.indexOf("안녕");
		System.out.println("index : "+index);
		
		arr.set(index, "안녕하세요");
		System.out.println( arr );
	}
}













