package classpart.singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car MySonata = factory.creatCar();
		Car yourSonata = factory.creatCar();
		System.out.println(MySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}

}
