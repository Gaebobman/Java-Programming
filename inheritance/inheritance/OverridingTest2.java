package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPcustomer(10030,"박막례" , 2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() +" 님이 지불해야 하는 금액은 " + vc.calPrice(10000) +" 원 입니다.");
		//VIPcustomer에 재정의된 메서드 calPrice가 호출되었다.

	}

}
