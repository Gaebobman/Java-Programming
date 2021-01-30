package witharraylist;
import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[ ] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010,"이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYoon = new GoldCustomer(10040, "윤영하");
		Customer customerKim = new VIPcustomer(10050, "김유신" , 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoon);
		customerList.add(customerKim);
		
		
		System.out.println("====== 고객 정보 출력 =====");
		for(Customer tmp : customerList) {
			System.out.println(tmp.showCustomerInfo());
		}
		
		System.out.println("====== 할인율과 보너스 포인트 계산 ======");
		int price = 10000;
		for(Customer tmp : customerList) {
			int cost = tmp.calPrice(price);
			// 각 인스턴스가 calPrice() 메서드를 호출하면 
			// 현재 이 변수의 실제 인스턴스가 무엇이냐에 따라 재정의한 메서드를 각각 호출하여 계산 함
			
				
			System.out.println(tmp.getCustomerName() +" 님이 " + cost + " 원을 지불하셨습니다.");
			System.out.println(tmp.getCustomerName() +" 님의 현재 포인트는" + tmp.bonusPoint+ "점 입니다.");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		/*
		 * 
		System.out.println("address of ArrayList Before clear() \n" + customerList);
		
		customerList.clear();
		System.out.println("======== ArrayList Cleared ! ! ! ========");
		
		System.out.println("address of ArrayList after clear() " + customerList);*/
		
	}
}
