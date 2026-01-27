package ex04;

class A지상군03 implements Army{
	@Override
	public void attack() {
		System.out.println("공격");
	}
	public void attaok() {
		System.out.println("공격 준비중");
	}
	public void attack1() {
		System.out.println("공격준비");
	}
	public void attack2() {
		System.out.println("공격할까 말까");
	}
	public void attack3() {
		System.out.println("준비운동");
	}
	@Override
	public void defense() {
		System.out.println("방어");
	}	
}
public class MainClass03 {
	public static void main(String[] args) {
		A지상군03 a = new A지상군03();
		//a.attack();
		//a.defense();
		a.attaok();
		Army army = new A지상군03();
		army.attack();
	}
}


