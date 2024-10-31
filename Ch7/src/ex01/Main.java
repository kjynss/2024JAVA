package ex01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car(100);
		car1.ShowSpeed();
		
		Truck truck = new Truck(80);
		truck.ShowSpeed();
		
		Car car2 = truck;
		System.out.println("Speed : " + car2.speed);
		car2.ShowSpeed(); // 오버라이딩, 함수는 자식의 것이 실행이 됨
	}

}
