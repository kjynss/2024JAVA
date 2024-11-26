package ex04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Anonymous anony = new Anonymous();
//		anony.person.Wake();
//		anony.method1();
		
		Person teacher = new Person() {
			void Teach() {
				System.out.println("Teach at 11");
			}
			
			void Wake() {
				System.out.println("Wake up at 9");
				Teach();
			}
		};
		anony.method2(teacher);
	}

}
