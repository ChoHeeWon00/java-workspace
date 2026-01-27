package ex03;

import java.util.ArrayList;
import java.util.List;

//DB(저장소) 접근하는 코드 및 연산 코드
public class MemberService {
	ArrayList<User> list;
	public MemberService() {
		list = new ArrayList<User>();
		User user1 = new User("aaa", "111");
		User user2 = new User("bbb", "222");
		list.add(user1);
		list.add(user2);
	}
	// List => ArrayList 부모
	public ArrayList<User> getList(){
		return list;
	}
	public User getOne( String username ){
		for( User u : list ) {
			if( username.equals( u.getUsername() ) ) {
				return u;
			}
		}
		//return null;
		//throw new RuntimeException("존재하지않는id입니다");
		throw new UserNotFoundException("존재하지않는id입니다 UserNotFoundException");
	}
}








