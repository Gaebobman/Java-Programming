package classpart.singleton;

public class Company {
	private Company() {	} //�����ڸ� private���� �����Ͽ� �ܺ�Ŭ�������� Company �ν��Ͻ��� �������� ���ϰ� ����
	
	private static Company instance = new Company();	//�����ϰ� ������ �ν��Ͻ�
	
	public static Company getInstance() { 	
		if(instance ==null) {
			instance = new Company();
		}
		return instance;
	}					//�ܺο����� �ν��Ͻ��� ���������ϰ� get() �������
	
	
	
}
