package ex07;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		
//		m.TestTV(new RemoteController() {
//			public void TurnOn() {System.out.println("Turn On Test");}
//			public void TurnOff() {System.out.println("Turn Off Test");}
//		});
	}
	
	void TestTV(RemoteController rc) {
		rc.TurnOn();
		rc.TurnOff();
	}

}
