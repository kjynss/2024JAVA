package ex04;

public class Anonymous {
	Person person = new Person() {
		void work() {
			System.out.println("Go to work");
		}
		
		void Wake() {
			System.out.println("Wake up at 6");
			work();
		}
	};
	
	public void method1() {
		Person person = new Person() {
			void Study() {
				System.out.println("Study at 10");
			}
			
			void Wake() {
				System.out.println("Wake up at 8");
				Study();
			}
		};
		
		person.Wake();
	}
	
	public void method2(Person person) {
		person.Wake();
	}
}
