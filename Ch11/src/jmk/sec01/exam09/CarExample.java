package jmk.sec01.exam09;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//첫번째 방법
		Class clazz = Car.class;
		
		//두번째 방법
		//Class clazz = Class.forName("jmk.sec01.exam09.Car");
		
		//세번째 방법
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
