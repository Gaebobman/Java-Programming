package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		/*Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.getCustomerInfo());
		*/

		VIPcustomer customerKim = new VIPcustomer(10020,"������", 8005);
		//customerKim.setCustomerName("asdasdas");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.getCustomerInfo());
	
	
	}

}
