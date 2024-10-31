package ex01;

public class Truck extends Car {
	
	public double speed;
	
	Truck(double speed){
		super(10); // super는 부모의 생성자 호출
		this.speed = speed;
	}
	
	public void ShowSpeed() {
		System.out.println("Truck Speed : " + speed);
	}
}
