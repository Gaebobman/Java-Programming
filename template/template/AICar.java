package template;

public class AICar extends Car{
	@Override
	public void drive() {
		System.out.println("자율 주행합니다");
		System.out.println("사람은 안쳐요");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈췄다");
	}
}
