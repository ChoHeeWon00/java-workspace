package quiz;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter @Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
public class MemberDto {
	private String username;
	private String password;
	private String name;
	public MemberDto() {}
	public MemberDto(String username, String password, String name) {
		this.username = username; this.password = password; this.name = name;
	}
	public String toString() {
		return username + "," + password + "," + name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}










