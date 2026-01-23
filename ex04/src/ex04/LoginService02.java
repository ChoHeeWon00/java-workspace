package ex04;

import java.util.Scanner;

public class LoginService02 {
	private LoginDto02 loginDto;
	public LoginService02() {
		//System.out.println("서비스 생성자 : "+loginDto);
		loginDto = new LoginDto02();
		//System.out.println("서비스 생성자 : "+loginDto);
	}
	public void display() {
		Scanner input = new Scanner(System.in);
		int num;
		String username = null, password = null;
		while (true) {
			System.out.println("1.로그인 2.회원가입 3.탈퇴");
			num = input.nextInt();
			switch (num) {
				case 1: 
					//System.out.println(loginDto.getUsername());
					if( loginDto.getUsername() == null ) {
						System.out.println("회원가입하세요");
						break;
					}
					System.out.println("로그인 할 id, pwd입력");
					username = input.next();
					password = input.next();
					if( username.equals(loginDto.getUsername()) ) {
						if( loginDto.getPassword().equals(password) ) {
							System.out.println("인증 통과");
						}else {
							System.out.println("비밀번호 틀림!!");
						}
					}else {
						System.out.println("존재하지 않는 id");
					}
					break; 
				case 2: 
					if( loginDto.getUsername() == null ) {
						System.out.println("가입 id, pwd입력");
						username = input.next();
						password = input.next();
						loginDto.setUsername(username);
						loginDto.setPassword(password);
						System.out.println("가입 되었습니다!!!");
					}else {
						System.out.println("탈퇴 후 진행하세요");
					}
					break; 
				case 3: 
					loginDto.setUsername(null);
					loginDto.setPassword(null);
					System.out.println("탈퇴 성공");
					break; 
			}
		}
	}
}





