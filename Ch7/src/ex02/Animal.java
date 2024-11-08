package ex02;

public abstract class Animal {
	public abstract boolean IsHealthy();
	// 추상클래스 실질적으로 사용되지는 않고 자식들을 묶어주는 역할?
	// 추상메소드 : 함수에 바디가 없음. 리턴타입과 매개변수만 있음.
	// abstract 로 추상 클래스 또는 메소드로 선언
	// 추상클래스는 객체를 만들 수 없음.
	// 필드는 가질 수 있음.
}
