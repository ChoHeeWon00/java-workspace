package quiz;

import java.util.List;
import java.util.Optional;

import quiz.exception.MemberDuplicateException;
import quiz.exception.MemberNotFoundException;

public class MemberService {
	/*
	 repository 연동 후 결과 받아옴
	 결과를 통해 문제가 있다면 예외 발생, 없으면 연산할게 있으면 연산, 없으면 
	 main으로 결과 전달
	 
	 예외 클래스도 각각 만들어서 진행하세요
	 */
	MemberRepository memberRepository;
	public MemberService() {
		memberRepository = new MemberRepository();
	}
	public void save( MemberDto memberDto ){
		//System.out.println("service : " + memberDto );
		boolean bool = 
				memberRepository.existsByUsername( 
										memberDto.getUsername() );
		//System.out.println("service : " + bool);
		if( bool )
			throw new MemberDuplicateException("존재하는 id 입니다");
		memberRepository.save( memberDto );
	}
	public List<MemberDto> getList() {
		//List<MemberDto> list = memberRepository.findAll();
		//return list;
		return memberRepository.findAll();
	}
	public MemberDto getMember( String username ) {
		/*
		boolean bool = memberRepository.existsByUsername( username );
		//username이 존재하면 true, 없으면 false
		if( bool == false ) // !bool
			throw new RuntimeException("해당 사용자는 없습니다!!!");
		*/
		//Optional<MemberDto> opt = memberRepository.findByUsername( username );
		//return opt.orElseThrow();
		return memberRepository
				.findByUsername(username)
				.orElseThrow( 
						//() -> new MemberNotFoundException() 
						//MemberNotFoundException::new
						() -> new MemberNotFoundException("사용자 없음!!")
					);
	}
	public void delete( String username ) {
		//사용자 있음 : true, 사용자 없음 : false
		//memberRepository.existsByUsername(username) == false
		if( !memberRepository.existsByUsername(username) )
			throw new MemberNotFoundException();
		memberRepository.deleteByUsername(username);
	}
	public void save(String username, MemberDto memberDto ) {
		//memberRepository.save(username, memberDto) == false
		if( !memberRepository.save(username, memberDto) )
			throw new MemberNotFoundException("수정할 아이디 없음");
	}
}





















