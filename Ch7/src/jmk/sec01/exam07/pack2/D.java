package jmk.sec01.exam07.pack2;

import jmk.sec01.exam07.pack1.A;

public class D extends A {
	// 다른 패키지여도 상속을 받으면 protected에 접근 가능
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}
