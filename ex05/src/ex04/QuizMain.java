package ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizMain {
public static void main(String[] args) {
	
	QuizService quizService = new QuizService();
	String stNum = null, name = null;
	int age = 0;
	
	Scanner input = new Scanner(System.in);
	int num = 0;
	
	while(true) {
		System.out.println("1.저장 2.검색 3.삭제 4.수정 5.출력");
		num = input.nextInt();
		switch(num) {
		case 1: 
			
			//사용자의 정보 입력 후 service 전달. 서비스에서는 저장만
			boolean bool = true;
			while(bool) {
				System.out.println("학번 입력");
				stNum = input.next();
				bool = quizService.checkStNum(stNum);
				if(bool)
					System.out.println("동일 학번 존재. 다시 입력");
			}
			System.out.println("이름 입력");
			name = input.next();
			System.out.println("나이 입력");
			age = input.nextInt();
			
			QuizDto quizDto = new QuizDto();
			//quizService.register( stNum, name, age);
			quizDto.setStNum(stNum);
			quizDto.setName(name);
			quizDto.setAge(age);
			quizService.register( quizDto );
			
			System.out.println("가입 완료");
			break;
		case 2:
			//검색할 stNum 입력 후 service 전달. 서비스서 검색 후 return dto
			//메인에서 return값 받아서 출력. 존재하는 학생정보 또는 없다
			System.out.println("검색 학번 입력");
			stNum = input.next();
			if( quizService.checkStNum(stNum) ) {
				QuizDto dto = quizService.getUser( stNum );
				System.out.println("--- 검색 결과 ---");
				System.out.println("학번 : "+dto.getStNum());
				System.out.println("이름 : "+dto.getName());
				System.out.println("나이 : "+dto.getAge());
				
			}else {
				System.out.println("검색 학번 없음!!!!");
			}
			break;
		case 3:
			//삭제 stNum입력후 service 전달 후 삭제. 성공, 실패 return
			//메인에서 결과 받아 성공, 실패 출력
			System.out.println("삭제 학번 입력");
			stNum = input.next();
			if( quizService.checkStNum(stNum) ) {
				quizService.delete( stNum );
			}else {
				System.out.println("삭제할 학번이 없습니다");
			}
			break;
		case 4:
			//stNum은 수정할 수 없음. 
			//수정할 대상 stNum값 및 , 이름, 나이 입력. service 전달
			//서비스에서 set(index, dto) 특정 위치의 값 변경
			System.out.println("수정 학번 입력");
			stNum = input.next();
			if( quizService.checkStNum(stNum) ) {
				System.out.println("수정 이름 입력");
				name = input.next();
				System.out.println("수정 나이 입력");
				age = input.nextInt();
				
				QuizDto modifyDto = new QuizDto();
				modifyDto.setStNum(stNum);
				modifyDto.setName(name);
				modifyDto.setAge(age);
				quizService.modify( stNum, modifyDto );
				
			}else {
				System.out.println("수정 할 학번이 없습니다");
			}
			break;
			
		case 5:
			//서비스에서 return으로 list 받은 후 메인서 출력
			 ArrayList<QuizDto> list = quizService.getList();
			 for( QuizDto d : list ) {
				 System.out.println("학번 : "+d.getStNum());
				 System.out.println("이름 : "+d.getName());
				 System.out.println("나이 : "+d.getAge());
				 System.out.println("------------");
			 }
			break;
			
		}
	}
}
}



