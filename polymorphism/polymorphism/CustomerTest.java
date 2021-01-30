package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerName("�̼���");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerKim = new VIPcustomer(10020, "������", 12345); 	//VIPcustomer�� Customer������ ����
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerKim.showCustomerInfo());
		System.out.println("==========�������� ���ʽ� ����Ʈ ���==========");
		
		int price = 10000;
		int leeprice =customerLee.calPrice(price);
		int kimprice = customerKim.calPrice(price);
		
		System.out.println(customerLee.getCustomerName() +"���� " + leeprice +" �� �����ϼ̽��ϴ�.");
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.getCustomerName() +"���� " + kimprice+" �� �����ϼ̽��ϴ�.");
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
