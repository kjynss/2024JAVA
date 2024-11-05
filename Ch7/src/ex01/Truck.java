package ex01;

public class Truck extends Car {
	
	public double speed;
	public double load;
	
	Truck(double speed){
		super(10); // super는 부모의 생성자 호출
		this.speed = speed;
		this.load = 0;
	}
	
	public void ShowSpeed() {
		System.out.println("Truck Speed : " + speed);
	}
	
	public void ShowLoad() {
		System.out.println("Current Load : " + load);
	}
}
