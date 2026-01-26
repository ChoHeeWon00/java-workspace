package ex04;

import java.util.ArrayList;

public class QuizService {
	private ArrayList<QuizDto> list;
	//학생 저장, 검색, 삭제, 수정, 모든 정보보기
	//stNum을 이용해서 동일학생, 없는 학생 처리
	//stNum
	public QuizService() {
		list = new ArrayList<QuizDto>();
	}
	public void register(QuizDto quizDto) {
		list.add(quizDto);
	}
	public ArrayList<QuizDto> getList() {
		return list;
	}
	public boolean checkStNum( String stNum ) {
		for( QuizDto d : list ) {
			if( d.getStNum().equals(stNum))
				return true;
		}
		return false;
	}
	public QuizDto getUser( String stNum ){
		for( QuizDto d : list ) {
			if( d.getStNum().equals(stNum))
				return d;
		}
		return null;
	}
	public void delete(String stNum ) {
		//list.removeIf(mem -> mem.getStNum().equals(stNum) );
		for( int i=0 ; i<list.size() ; i++ ) {
			if( list.get(i).getStNum().equals(stNum) ) {
				list.remove( i );
				break;
			}
		}
	}
	public void modify(String stNum, QuizDto modifyDto ){
		for( int i=0 ; i<list.size() ; i++ ) {
			if( list.get(i).getStNum().equals(stNum) ) {
				list.set( i , modifyDto);
				break;
			}
		}
	}
}









