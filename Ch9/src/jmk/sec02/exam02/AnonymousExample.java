package jmk.sec02.exam02;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		
		anony.field.turnOn();
		
		anony.method1();
		
		anony.method2(
				new RemoteControl() {
					public void turnOn() {
						System.out.println("SmartTV를 켭니다.");
					}
					
					public void turnOff() {
						System.out.println("SmartTV를 끕니다.");
					}
				});
	}

}
