package abstractex;

public abstract class Computer {	//abstract method�� ����ϴ� class
	public abstract void display();
	public abstract void typing();
	// display()�� typing()�� ������ ���� Ŭ������ ���� ������ �޶��� �� �ֱ� ������
	// Computer Ŭ�������� �������� �ʰ�, �� �޼��� ������ ���� å���� ��ӹ޴� Ŭ������ �����Ѵ�.
	
	
	//���� �� �޼����  Computer�� ��ӹ޴� Ŭ���� ��ο��� �����̴�.
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	
	/*	���������� ��� �޼��带 �����߾ abstract ���� ����ϸ� �߻� Ŭ������
	 *  �׷� Ŭ������ ��Ӹ����� ����ϱ� ���� Ŭ������
	 *  new ���� ��� �Ұ����ϴ�.
	 */
}
