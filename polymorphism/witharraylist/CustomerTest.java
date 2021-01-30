package witharraylist;
import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[ ] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010,"�̼���");
		Customer customerShin = new Customer(10020, "�Ż��Ӵ�");
		Customer customerHong = new GoldCustomer(10030, "ȫ�浿");
		Customer customerYoon = new GoldCustomer(10040, "������");
		Customer customerKim = new VIPcustomer(10050, "������" , 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoon);
		customerList.add(customerKim);
		
		
		System.out.println("====== �� ���� ��� =====");
		for(Customer tmp : customerList) {
			System.out.println(tmp.showCustomerInfo());
		}
		
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� ======");
		int price = 10000;
		for(Customer tmp : customerList) {
			int cost = tmp.calPrice(price);
			// �� �ν��Ͻ��� calPrice() �޼��带 ȣ���ϸ� 
			// ���� �� ������ ���� �ν��Ͻ��� �����̳Ŀ� ���� �������� �޼��带 ���� ȣ���Ͽ� ��� ��
			
				
			System.out.println(tmp.getCustomerName() +" ���� " + cost + " ���� �����ϼ̽��ϴ�.");
			System.out.println(tmp.getCustomerName() +" ���� ���� ����Ʈ��" + tmp.bonusPoint+ "�� �Դϴ�.");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		/*
		 * 
		System.out.println("address of ArrayList Before clear() \n" + customerList);
		
		customerList.clear();
		System.out.println("======== ArrayList Cleared ! ! ! ========");
		
		System.out.println("address of ArrayList after clear() " + customerList);*/
		
	}
}
