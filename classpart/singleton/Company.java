package classpart.singleton;

public class Company {
	private Company() {	} //생성자를 private으로 지정하여 외부클래스에서 Company 인스턴스를 생성하지 못하게 제어
	
	private static Company instance = new Company();	//유일하게 생성한 인스턴스
	
	public static Company getInstance() { 	
		if(instance ==null) {
			instance = new Company();
		}
		return instance;
	}					//외부에서도 인스턴스를 참조가능하게 get() 만들었다
	
	
	
}
