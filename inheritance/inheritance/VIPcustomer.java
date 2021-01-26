package inheritance;

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
		System.out.println("VIPcustomer() ������ ȣ���");
	}
	
	public int getAgentID() {
		return agentID;
	}
	public String ShowVIPInfo() {
		return super.getCustomerInfo() +"��� ���� ID�� "+ agentID +" �Դϴ�.";
	}
	@Override	//Annotation	@Override -> �����ǵ� �޼����Դϴ�~~~
	public int calPrice(int price) {
		
		bonusPoint += price* bonusRatio;
		
		return price - (int)(price * saleRatio);
	}


	
}
