package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPcustomer(10030,"�ڸ���" , 2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() +" ���� �����ؾ� �ϴ� �ݾ��� " + vc.calPrice(10000) +" �� �Դϴ�.");
		//VIPcustomer�� �����ǵ� �޼��� calPrice�� ȣ��Ǿ���.

	}

}
