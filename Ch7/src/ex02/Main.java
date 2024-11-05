package ex02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalHospital hospital = new AnimalHospital();
		
		Dog d1 = new Dog(20);
		Dog d2 = new Dog(60);
		hospital.CheckPetient(d1);
		hospital.CheckPetient(d2);
		
		Cat c1 = new Cat(0.5);
		hospital.CheckPetient(c1);
	}

}