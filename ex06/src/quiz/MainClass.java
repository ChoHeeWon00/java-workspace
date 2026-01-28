package quiz;

import java.util.List;
import java.util.Scanner;

import quiz.exception.MemberDuplicateException;

public class MainClass {
	/*
	 	while switch 회원 가입, 검색, 수정, 삭제, 모든 목록 출력
	 	service에서 받아온 값을 화면에 표현
	 	serivce의 예외를 받아주는 try, catch도 진행
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MemberService memberService = new MemberService();
		String username, password, name;
		int num;
		MemberDto memberDto = null;
		while( true ) {
			System.out.println("1.등록 2.검색 3.수정 4.삭제 5.모든 목록");
			num = input.nextInt();
			switch( num ) {
			case 1 : 
				System.out.println("아이디, 비밀번호, 이름 입력");
				username = input.next();
				password = input.next();
				name = input.next();
				memberDto = new MemberDto(username, password, name);
				try {
					memberService.save( memberDto );
					System.out.println("저장 성공");
				} catch (MemberDuplicateException e) {
					System.out.println( e.getMessage() );
				}
				break;
			case 2 : 
				System.out.println("검색 아이디 입력");
				username = input.next();
				try {
					memberDto = memberService.getMember( username );
					System.out.println("--- 검색 결과 ---");
					System.out.println( memberDto );
					
				} catch (RuntimeException e) {
					System.out.println( e.getMessage() );
				}
				break;
			case 3 : break;
			case 4 : break;
			case 5 : 
				List<MemberDto> list = memberService.getList();
				for(MemberDto dto : list) {
					System.out.println( dto );
				}
				break;
			}
		}
	}
}














