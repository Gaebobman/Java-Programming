package polymorphism;

public class VIPcustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPcustomer(int customerID, String customerName, int agentID) {		
										//묵시적으로 호출될 디폴트 생성자 Customer()가 정의되지 않기에 오류가 발생!
		super(customerID, customerName);// 반드시 명시적으로 다른 생성자를 호출해야한다.
										// super()로 상위 클래스 생성자를 호출
						
		customerGrade = "VIP";	// 상위클래스에서 PRIVATE 변수이다.
		bonusRatio = 0.05;
		saleRatio  = 0.1;
		this.agentID = agentID;
		
	}
	public int calPrice(int price) {
		
		bonusPoint += price* bonusRatio;
		
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 ID는 "+ agentID +" 입니다.";
	}


	
}
