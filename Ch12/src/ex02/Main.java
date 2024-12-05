package ex02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
	}

}
