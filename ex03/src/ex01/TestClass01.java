package ex01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/**
  데이터 중복을 허용하지 않는다.
 */
public class TestClass01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("안녕"); set.add("라면");
		set.add("김밥"); set.add("안녕");
		System.out.println( set );
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("안녕"); arr.add("라면");
		arr.add("김밥"); arr.add("안녕");
		System.out.println( arr );
		
		set.remove("안녕");
		System.out.println( set );
		
		Iterator<String> it = arr.iterator();
		while( it.hasNext() ) {
			System.out.println( it.next() );
		}
		/*
		System.out.println( it.hasNext() );
		System.out.println( it.next() );
		System.out.println( it.hasNext() );
		System.out.println( it.next() );
		System.out.println( it.hasNext() );
		System.out.println( it.next() );
		System.out.println( it.hasNext() );
		System.out.println( it.next() );
		System.out.println( it.hasNext() );
		//System.out.println( it.next() );
		*/
		
		Iterator<String> setIt = set.iterator();
		for( ; setIt.hasNext() ; ) {
			String s = setIt.next();
			System.out.println( s );
		}
	}
}









