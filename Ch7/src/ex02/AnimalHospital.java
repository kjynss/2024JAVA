package ex02;

public class AnimalHospital {
	
//	public void CheckPetient(Dog dog) {
//		if(dog.IsHealthy()) {
//			System.out.println("건강합니다.");
//		}
//		else {
//			System.out.println("치료가 필요합니다.");
//		}
//	}
//	
//	public void CheckPetient(Cat cat) {
//		if(cat.IsHealthy()) {
//			System.out.println("건강합니다.");
//		}
//		else {
//			System.out.println("치료가 필요합니다.");
//		}
//	}
	
	public void CheckPetient(Animal animal) {
		if(animal.IsHealthy()) {
			System.out.println("건강합니다.");
		}
		else {
			System.out.println("치료가 필요합니다.");
		}
	}
}
