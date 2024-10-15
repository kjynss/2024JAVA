package CH06Main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("현대", "소나타", 100, 0);
		Car car2 = new Car("벤츠", "S100", 90, 0);
		Car car3 = new Car();
		
		car1.ShowInfo();
		car2.ShowInfo();
		car3.ShowInfo();
	}

}