package jmk.sec02.exam01;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<100; i++) {
			toolkit.beep();
			Thread.sleep(3000);
		}
	}

}
