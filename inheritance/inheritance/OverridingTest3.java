package inheritance;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerLee = new Customer(10010, "이순신");
		System.out.println(customerLee.getCustomerName() +" 님이 지불해야 하는 금액은 " 
		+ customerLee.calPrice(price)+ " 원입니다.");

		
		VIPcustomer VIPcustomerKim = new VIPcustomer(10010, "김김", 12345);
		System.out.println(VIPcustomerKim.getCustomerName() +" 님이 지불해야 하는 금액은 " 
		+ VIPcustomerKim.calPrice(price)+ " 원입니다.");
		
		Customer customerJuan = new VIPcustomer(10010, "Juan", 12345);
		System.out.println(customerJuan.getCustomerName() +" 님이 지불해야 하는 금액은 " 
		+ customerJuan.calPrice(price)+ " 원입니다.");
		//Juan은 가상 메서드 방식에 의해 VIPcustomer인스턴스의 메서드가 호출된다.
		/*
		 * 상속에서 상위 클래스와 하위 클래스에 같은 이름의 메서드가 존재할 때 호출되는 메서드는 인스턴스에 따라 결정된다.

			선언한 클래스형이 아닌 생성된 인스턴스의 메서드를 호출하는 것.

			인스턴스의 메서드가 홀출되는 기술을 '가상 메서드(virtual method)'라고 한다.
			
			https://ga-you-ni.tistory.com/164
		 */

	}

}
