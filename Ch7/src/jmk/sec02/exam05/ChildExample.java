package jmk.sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child(); // 자동타입변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		 * parent.field2 = "data2";
		 * parent.method3();
		 * 불가능
		 */
		
		Child child = (Child) parent; // 강제타입변환
		// 자식객체가 부모타입으로 자동변환된 상태에서 원래의 자식으로 강제변환가능
		child.field2 = "yyy";
		child.method3();
	}

}
