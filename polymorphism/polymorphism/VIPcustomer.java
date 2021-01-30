package polymorphism;

public class VIPcustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPcustomer(int customerID, String customerName, int agentID) {		
										//���������� ȣ��� ����Ʈ ������ Customer()�� ���ǵ��� �ʱ⿡ ������ �߻�!
		super(customerID, customerName);// �ݵ�� ��������� �ٸ� �����ڸ� ȣ���ؾ��Ѵ�.
										// super()�� ���� Ŭ���� �����ڸ� ȣ��
						
		customerGrade = "VIP";	// ����Ŭ�������� PRIVATE �����̴�.
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
		return super.showCustomerInfo() + "��� ���� ID�� "+ agentID +" �Դϴ�.";
	}


	
}
