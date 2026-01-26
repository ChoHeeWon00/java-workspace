package ex04;

import java.util.Scanner;

public class LoginService002 {
	private LoginDto02 loginDto;
	private String username, password;
	Scanner input = new Scanner(System.in);
	
	public LoginService002() {
		loginDto = new LoginDto02();
	}
	public int loginCheck() {
		if( username.equals(loginDto.getUsername()) ) {
			if( loginDto.getPassword().equals(password) ) {
				return 0;
			}else {
				return 1;
			}
		}else {
			return -1;
		}
	}
	public boolean userCheck() {
		return (loginDto.getUsername() == null) ? true : false;
	}
	public void inputUsernamePassword(String msg) {
		System.out.println( msg );
		username = input.next();
		password = input.next();
	}
	public void login() {
		if( userCheck() ) {
			System.out.println("회원가입하세요");
			return;
		}
		inputUsernamePassword("로그인 할 id, pwd입력");
		int result = loginCheck();
		if( result == 0 ) {
			System.out.println("인증 통과");
		}else if(result == 1) {
			System.out.println("비밀번호 틀림!!");
		}else {
			System.out.println("존재하지 않는 id");
		}
	}
	public void register() {
		if( userCheck() ) {
			inputUsernamePassword("가입 id, pwd입력");
			loginDto.setUsername(username);
			loginDto.setPassword(password);
			System.out.println("가입 되었습니다!!!");
		}else {
			System.out.println("탈퇴 후 진행하세요");
		}
	}
	public void 회원탈퇴() {
		loginDto.setUsername(null);
		loginDto.setPassword(null);
		System.out.println("탈퇴 성공");
	}
	public void display() {
		int num;
		while (true) {
			System.out.println("1.로그인 2.회원가입 3.탈퇴");
			num = input.nextInt();
			switch (num) {
				case 1: 
					login();
					break; 
				case 2: 
					register();
					break; 
				case 3: 
					회원탈퇴();
					break; 
			}
		}
	}
}
