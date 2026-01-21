package ex02;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String saveId=null, savePwd=null, inputId=null, inputPwd=null;
		//로그인 시 : 인증 성공, 인증 실패, 회원가입 먼저하세요
		//회원가입 시 : 가입성공, 누군가가 이미 가입되어 있음
		int num = 0;
		while(true) {
			//if(num == 3)
				//break;
			System.out.println("1.로그인");
			System.out.println("2.회원 가입");
			System.out.println("3.종료");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch( num ) {
				case 1 : 
					if(saveId == null) {
						System.out.println("회원가입 하세요");
					}else {
						System.out.println("로그인 id 입력");						
						inputId = input.next();
						System.out.println("로그인 pwd 입력");						
						inputPwd = input.next();
						if(inputId.equals(saveId) && savePwd.equals(inputPwd) ) {
							System.out.println("인증 통과");
						}else {
							System.out.println("인증 실패");
						}
					}
					break;
				case 2 : 
					if( saveId != null ) {
						System.out.println("누군가 가입 되었음!!!");
						break;
					}
					System.out.println("가입 id 입력");
					saveId = input.next();
					System.out.println("가입 pwd 입력");
					savePwd = input.next();
					System.out.println("가입 성공!!!");
					break;
				case 3 : 
					System.out.println("종료합니다");break;
			}
			//System.out.println("다음 문장들 실행");
			if(num == 3)
				break;
		}
	}
}




