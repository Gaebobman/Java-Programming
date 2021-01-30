package abstractex;

public abstract class Computer {	//abstract method를 사용하는 class
	public abstract void display();
	public abstract void typing();
	// display()와 typing()의 구현은 하위 클래스에 따라 구현이 달라질 수 있기 때문에
	// Computer 클래스에서 구현하지 않고, 두 메서드 구현에 대한 책임을 상속받는 클래스에 위임한다.
	
	
	//하위 두 메서드는  Computer를 상속받는 클래스 모두에서 공통이다.
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	/*	문법상으로 모든 메서드를 구현했어도 abstract 예약어를 사용하면 추상 클래스임
	 *  그런 클래스는 상속만으로 사용하기 위한 클래스임
	 *  new 예약어가 사용 불가능하다.
	 */
}
