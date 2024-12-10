package ex05;

public class User extends Thread {
	private Calculator calculator;
	private int value;
	
	User(String name) {
		this.setName(name);
	}
	
	public void setCalculator (Calculator calculator, int value) {
		this.calculator = calculator;
		this.value = value;
	}
	
	public void run() {
		calculator.setMemory(value);
		
	}
}
