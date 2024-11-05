package jmk.sec01.exam07.pack2;

import jmk.sec01.exam07.pack1.A;

public class C {
	//protected는 다른 패키지에서 접근 불가능
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
