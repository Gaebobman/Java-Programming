package template;

public class AICar extends Car{
	@Override
	public void drive() {
		System.out.println("���� �����մϴ�");
		System.out.println("����� ���Ŀ�");
	}

	@Override
	public void stop() {
		System.out.println("������ �����");
	}
}