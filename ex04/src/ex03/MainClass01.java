package ex03;

class Test01{
	private String officeName;
	public Test01() {
		System.out.println("기본 생성자 실행");
	}
	public Test01(String n) {
		System.out.println(n + " 생성자 실행");
		officeName = n;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName ) {
		this.officeName = officeName;
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		String office = "내 회사";
		
		Test01 t01 = new Test01();
		t01.setOfficeName(office);
		
		String off = t01.getOfficeName();
		System.out.println("회사 이름 : " + off );
		
		System.out.println("---------------");
		
		office = "회사이직";
		Test01 t02 = new Test01( office );
		
		off = t02.getOfficeName();
		System.out.println( "회사이름 : " + off );
		
		//Test01 t01 = new Test01("aaaa");
		//System.out.println( t01.getOfficeName() );
	}
}




