package ex02;

import java.util.ArrayList;
import java.util.Scanner;

class QuizLogin{
	private String userId, userPwd;
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserPwd() {
		return userPwd;
	}
	
	public boolean logout() {
		return false;
	}
	public int equals(String uId, String uPwd) {
		if( uId.equals(userId) 
				&& uPwd.equals( getUserPwd() ) ) {
			return 0;
		}
		return 1;
	}
}
public class Quiz02 {
	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add("1111");
		String str = "aaa";
		str.equals("aaa");
		
		
		QuizLogin login = new QuizLogin();
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		String inputId = null, inputPwd = null;
		boolean bool = true;
		while( bool ) {
			System.out.println("1.로그인 2.가입 3.로그아웃(종료)");
			num = input.nextInt();
	switch( num ) {
		case 1:
			//로그인 기능. 비교하는 기능은 QuizLogin 메소드 연산
			//System.out.println("userId : "+login.getUserId() );
			//System.out.println("userPwd : "+login.getUserPwd() );
			
			System.out.println("비교할 id 입력");
			inputId = input.next();
			System.out.println("비교할 PWD 입력");
			inputPwd = input.next();
			
			int result = login.equals( inputId, inputPwd );
			System.out.println("result : "+result);
			
			if(result == 0 ) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("인증 실패");
			}
			break;
		case 2:
			// setter을 통해 QuizLogin에 저장
			System.out.println("저장 id 입력");
			inputId = input.next();
			System.out.println("저장 PWD 입력");
			inputPwd = input.next();
			
			login.setUserId(inputId);
			login.setUserPwd(inputPwd);
			System.out.println("---회원가입 성공---");
			break;
		case 3:
			//QuizLogin에서 로그아웃 기능을 만들고 bool을 false 처리
			bool = login.logout();
			System.out.println("로그아웃합니다");
			break;
	}
		}
	}
}













