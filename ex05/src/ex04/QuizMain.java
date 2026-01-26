package ex04;

public class QuizMain {
public static void main(String[] args) {
	
	int num = 0;
	while(true) {
		
		switch(num) {
		case 1: 
			//사용자의 정보 입력 후 service 전달. 서비스에서는 저장만
			break;
		case 2:
			//검색할 stNum 입력 후 service 전달. 서비스서 검색 후 return dto
			//메인에서 return값 받아서 출력. 존재하는 학생정보 또는 없다
			break;
		case 3:
			//삭제 stNum입력후 service 전달 후 삭제. 성공, 실패 return
			//메인에서 결과 받아 성공, 실패 출력
			break;
		case 4:
			//stNum은 수정할 수 없음. 
			//수정할 대상 stNum값 및 , 이름, 나이 입력. service 전달
			//서비스에서 set(index, dto) 특정 위치의 값 변경
			break;
		case 5:
			//서비스에서 return으로 list 받은 후 메인서 출력
			break;
		}
	}
}
}



