package ex02;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
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
