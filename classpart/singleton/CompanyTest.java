package classpart.singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		//�ν��Ͻ��� ������ Ȯ���غ���
		System.out.println(company1 == company2);

	
	
	}

}
