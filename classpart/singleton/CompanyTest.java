package classpart.singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		//인스턴스가 같은지 확인해보자
		System.out.println(company1 == company2);

	
	
	}

}
