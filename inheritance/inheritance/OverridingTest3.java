package inheritance;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerLee = new Customer(10010, "�̼���");
		System.out.println(customerLee.getCustomerName() +" ���� �����ؾ� �ϴ� �ݾ��� " 
		+ customerLee.calPrice(price)+ " ���Դϴ�.");

		
		VIPcustomer VIPcustomerKim = new VIPcustomer(10010, "���", 12345);
		System.out.println(VIPcustomerKim.getCustomerName() +" ���� �����ؾ� �ϴ� �ݾ��� " 
		+ VIPcustomerKim.calPrice(price)+ " ���Դϴ�.");
		
		Customer customerJuan = new VIPcustomer(10010, "Juan", 12345);
		System.out.println(customerJuan.getCustomerName() +" ���� �����ؾ� �ϴ� �ݾ��� " 
		+ customerJuan.calPrice(price)+ " ���Դϴ�.");
		//Juan�� ���� �޼��� ��Ŀ� ���� VIPcustomer�ν��Ͻ��� �޼��尡 ȣ��ȴ�.
		/*
		 * ��ӿ��� ���� Ŭ������ ���� Ŭ������ ���� �̸��� �޼��尡 ������ �� ȣ��Ǵ� �޼���� �ν��Ͻ��� ���� �����ȴ�.

			������ Ŭ�������� �ƴ� ������ �ν��Ͻ��� �޼��带 ȣ���ϴ� ��.

			�ν��Ͻ��� �޼��尡 Ȧ��Ǵ� ����� '���� �޼���(virtual method)'��� �Ѵ�.
			
			https://ga-you-ni.tistory.com/164
		 */

	}

}
