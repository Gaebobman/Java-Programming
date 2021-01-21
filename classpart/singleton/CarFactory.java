package classpart.singleton;

public class CarFactory {
	private static int SerialNum = 10000;
	private CarFactory() {}
	
	private static CarFactory instance = new CarFactory();
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car creatCar() {
		SerialNum++;
		Car tmp = new Car();
		tmp.CarNum=SerialNum;
		return tmp;
	}
	
	
}
