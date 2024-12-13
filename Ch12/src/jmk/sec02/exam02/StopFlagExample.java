package jmk.sec02.exam02;

public class StopFlagExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		printThread.setStop(true);
	}

}
