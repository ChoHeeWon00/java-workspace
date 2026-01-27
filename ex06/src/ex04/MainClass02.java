package ex04;

class A지상군01{
	public void hujum() {
		System.out.println("지상군이 공격합니다");
	}
	public void 총알장전() {
		System.out.println("총알장전");
	}
	public void 연산() {
		System.out.println("중간 연산");
	}
	public void 방어() {
		System.out.println("지상군이 방어합니다");
	}
}
class B공군01{
	public void attack() {
		System.out.println("비행기가 공격합니다");
	}
	public void defense() {
		System.out.println("비행기가 방어합니다");
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		A지상군01 a01 = new A지상군01();
		B공군01 b01 = new B공군01();
		a01.hujum();
		b01.defense();
	}
}



