package ex01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car(100);
		car1.ShowSpeed();
		
		Truck truck = new Truck(80);
		truck.ShowSpeed();
		System.out.println("Speed : " + truck.speed); // hiding(변수의 경우 부모의 것 대신 자식의 것이 나오며 hiding 이라고 함)
		
		Car car2 = truck;
		System.out.println("Speed : " + car2.speed);
		car2.ShowSpeed(); // 오버라이딩, 부모의 함수를 호출했을 때 자식의 것이 실행이 됨
		// car2.ShowLoad(); 자식의 것을 직접 불러오지 못함
	}

}
