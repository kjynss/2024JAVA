package CH06Main;

public class Car {
	String company;
	String model;
	int maxSpeed;
	int speed;
	
	
	Car(String company){
		this(company, "", 100, 0);
	}
	
	Car(String company, String model){
		this(company, model, 100, 0);
	}
	
	Car(String company, String mo, int max, int sp){
		this.company = company;
		// 필드의 변수와 매개변수의 이름이 같으면 this.을 붙여주어야 필드의 변수에 값을 저장할 수 있다.
		model = mo;
		maxSpeed = max;
		speed = sp;
	}
	
	Car(){
		company = "";
		model = "";
		maxSpeed = 100;
		speed = 0;
	}
	
	
	void ShowMaxSpeed() {
		System.out.println("MaxSpeed : " + maxSpeed);
	}
	
	void ShowInfo() {
		System.out.println("Company : " + company);
		System.out.println("Model : " + model);
		System.out.println("MaxSpeed : " + maxSpeed);
		System.out.println("Speed : " + speed);
	}
	
	void AddSpeed(int amount) {
		speed += amount;
		ShowInfo();
	}
}
