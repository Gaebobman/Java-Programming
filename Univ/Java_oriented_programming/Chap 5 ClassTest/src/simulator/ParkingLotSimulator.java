package simulator;

import java.util.Scanner;

public class ParkingLotSimulator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y;
		String command = "foo";
		System.out.printf("������ ũ��(��� ��)�� �Է��ϼ���: ");
		x = scanner.nextInt(); y = scanner.nextInt();
		System.out.println("����ǥ �ٹ��� �����մϴ�.\n");
		ParkingLot p = new ParkingLot(x, y, 10);
		Car Acar = new Car("Alpha", "0000");	p.registerCar(Acar, 0);
		Car Bcar = new Car("Bravo", "1111"); 	p.registerCar(Bcar, 1);
		Car Ccar = new Car("Charlie", "2222"); 	p.registerCar(Ccar, 2);
		Car Dcar = new Car("Delta", "3333"); 	p.registerCar(Dcar, 3);
		Car Ecar = new Car("Echo", "4444"); 	p.registerCar(Ecar, 4);
		Car Fcar = new Car("FoxTrot", "5555"); 	p.registerCar(Fcar, 5);
		Car Gcar = new Car("Golf", "6666"); 	p.registerCar(Gcar, 6);
		Car Hcar = new Car("Hotel", "7777"); 	p.registerCar(Hcar, 7);
		Car Icar = new Car("India", "8888"); 	p.registerCar(Icar, 8);
		Car Jcar = new Car("Juliet", "9999"); 	p.registerCar(Jcar, 9);
		
		while(!command.equals("���")) {
			p.showStatus();
			System.out.printf("���� ��ȣ�� �Է��ϼ���: ");
			command = scanner.next();
			if(!command.equals("���"))
				p.carHandler(command);
		}
		System.out.println("����ǥ ����մϴ�.");
		scanner.close();
	}
}