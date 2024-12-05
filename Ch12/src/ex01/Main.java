package ex01;

import java.awt.Toolkit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
