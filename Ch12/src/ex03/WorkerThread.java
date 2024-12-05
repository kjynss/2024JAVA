package ex03;

import ex02.Toolkit;

public class WorkerThread extends Thread{
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i<5; i++) {
			toolkit.beep();
			System.out.println("TTing");
			Thread.sleep(500);
		}
		
		for(int i = 0; i<5; i++) {
			toolkit.beep();
			System.out.println("DDong");
			Thread.sleep(500);
		}
	}
}
