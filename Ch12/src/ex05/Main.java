package ex05;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calculator = new Calculator();
		
		User user1 = new User("User1");
		user1.setCalculator(calculator, 100);
		user1.start();
		
		User user2 = new User("User2");
		user2.setCalculator(calculator, 50);
		user2.start();
	}

}
