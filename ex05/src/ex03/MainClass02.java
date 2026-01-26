package ex03;

import java.util.ArrayList;

class Car02 {
	private int ye;
	public Car02(int ye) {
		this.ye = ye;
	}
	public int getYe() {
		return ye;
	}
	public void speed() {
		System.out.println(ye + "년식 자동차 속도 : 300km");
	}
}
class NewCar02 extends Car02{
	public NewCar02(int ye) {
		super(ye);
	}
	public void speed() {
		System.out.println( getYe() + "년식 업데이트 속도 : 400km");
	}
	public void autoSystem() {
		System.out.println("자동 운전 모드 실행");
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		//Car02 car = new Car02(2026);
		//car.speed();
		NewCar02 car = new NewCar02(2027);
		car.speed();
		car.autoSystem();
	}
}




