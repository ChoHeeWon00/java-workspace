package ex04;

import java.util.Scanner;

//이름, k,e,m
public class Service01 {
	private StDto stDto;
	public Service01() {
		stDto = new StDto();
	}
	public void save(String name, int k, int e, int m) {
		stDto.setName(name);
		stDto.setKor( k );
		stDto.setEng( e );
		stDto.setMath( m );
	}
	public void display() {
		System.out.println("학생관리 이동 : " + stDto);
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1.저장 2.내용 확인 3.이름만 수정 4.나가기");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("모든 내용을 저장합니다");
				//모든 값을 입력받고 메소드로 전달
				save("홍길동",1,2,3);
				System.out.println("저장 성공");
				break;
			case 2:
				System.out.println("내용을 확인합니다");
				System.out.println("이름 : "+stDto.getName() );
				System.out.println("국 : "+stDto.getKor() );
				System.out.println("영 : "+stDto.getEng() );
				System.out.println("수 : "+stDto.getMath() );
				break;
			case 3:
				System.out.println("수정할 이름 입력");
				String name = input.next();
				System.out.println(stDto.getName() 
									+" => " + name + " 수정 됨");
				stDto.setName(name);
				break;
			case 4: return;
			}
		}
	}
}	












