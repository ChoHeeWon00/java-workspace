package ex02;

public class MainClass02 {
public static void main(String[] args) {
	int[] arr = {10,20,30};
	try {
		for(int i=0 ; i < 33 ; i++) {
			System.out.println(arr[i]);
		}
	} catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
	}
	System.out.println("다음 문장들 실행");
}
}
