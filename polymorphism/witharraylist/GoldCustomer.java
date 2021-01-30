package witharraylist;

public class GoldCustomer extends Customer{
	double saleRatio; 
	
	public GoldCustomer(int customerID, String CustomerName){
		super(customerID, CustomerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
		
	}
	
	public int calcprice(int price) {
		bonusPoint +=price * bonusRatio;
		return price - (int)(price *saleRatio);
	}
	
}
