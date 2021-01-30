package abstractex;

public class DeskTop extends Computer{
	//Computer에서 구현되지 않은 메소드를 모두 구현해야 구체적인 클래스가 된다.

	@Override
	public void display() {
		System.out.println("DeskTop display()");
		
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing()");
		
	}
	
	
}
