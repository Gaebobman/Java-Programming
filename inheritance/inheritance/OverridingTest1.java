package inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		
		VIPcustomer customerKim  = new VIPcustomer(10020,"������" , 12345);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		
		System.out.println(customerLee.getCustomerName() +" ���� �����ؾ� �ϴ� �ݾ���" + 
		customerLee.calPrice(price)+ "���Դϴ�.");
		System.out.println(customerKim.getCustomerName() +" ���� �����ؾ� �ϴ� �ݾ���" + 
				customerKim.calPrice(price)+ "���Դϴ�.");

	}

}
