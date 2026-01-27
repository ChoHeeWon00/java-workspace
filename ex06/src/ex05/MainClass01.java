package ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

import ex03.User;
import ex03.UserNotFoundException;

class MemberService01{
	ArrayList<User> arr;
	public MemberService01(){
		arr = new ArrayList<User>();
		arr.add( new User("aaa", "111") );
		arr.add( new User("bbb", "222") );
	}
	public List<User> getList(){
		return arr;
	}
	public User getOne( String username ){
		//Stream<User> str = arr.stream();
		/*
		Predicate<User> pr = new Predicate<User>() {
			@Override
			public boolean test(User t) {
				System.out.println( t );
				System.out.println(t.getUsername().equals(username) );
				return t.getUsername().equals(username);
				//return false;
			}
		};
		*/
		//str = [ dto0 , dto1 ]
		//Stream<User> str2 =  str.filter( 
		//				(t) -> t.getUsername().equals(username) 
		//			);
		/*
		Stream<User> str = arr.stream().filter(
					(t) -> t.getUsername().equals(username) 
				);
		Optional<User> optional = str.findFirst();
		return optional.orElse(null);
		*/
		return arr.stream()
				.filter( (t) -> t.getUsername().equals(username))
				.findFirst()
				//.orElse( null );
				.orElseThrow( () -> new UserNotFoundException("사용자 없음") );
	}
	
	public User modify(String username, String changePwd) {
		User user =  arr.stream()
			.filter( dto -> dto.getUsername().equals(username) )
			.findFirst()
			.map( member -> {
				member.setPassword(changePwd);
				return member;
			} )
			.orElseThrow( () -> new UserNotFoundException("수정 사용자 없음") );
		return user;
	}
	public void deleteUser(String username) {
		boolean bool = arr.removeIf(
					dto -> dto.getUsername().equals(username)
				);
		if( !bool ) // bool == false
			throw new UserNotFoundException("삭제 사용자 없음");
	}
	public void insert(User user) {
		arr.stream()
		.filter( dto -> dto.getUsername().equals( user.getUsername() ) )
		.findFirst()
		.ifPresentOrElse(
				//filter 조건이 참인 경우 실행
				m -> { throw new MemberDuplicateException("동일한 id 있음"); } ,
				// 거짓인 경우 실행
				() -> { arr.add(user); }
			);
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		MemberService01 ms = new MemberService01();
		System.out.println( ms.getList() );
		
		String username = "bbb";
		try {
			User user = ms.getOne( username );
			System.out.println( user );
		} catch (UserNotFoundException e) {
			// TODO: handle exception
			System.out.println( e.getMessage() );
		}
		
		User user = null;
		try {
			user = ms.modify("aaa111", "수정비번");
			System.out.println("수정 후 user : " + user );
		} catch (UserNotFoundException e) {
			System.out.println( e.getMessage() );
		}
		System.out.println("수정 후 확인");
		System.out.println( ms.getList() );
		
		try {
			ms.deleteUser("aaa1111");
		} catch (UserNotFoundException e) {
			System.out.println( e.getMessage() );
		}
		System.out.println("삭제 후 확인");
		System.out.println( ms.getList() );
		
		
		try {
			ms.insert( new User("aaa","444") );
		} catch (MemberDuplicateException  e) {
			System.out.println( e.getMessage() );
		}
		System.out.println("추가 후 확인");
		System.out.println( ms.getList() );
	}
}













