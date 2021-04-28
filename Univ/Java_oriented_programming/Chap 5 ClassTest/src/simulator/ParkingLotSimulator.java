package simulator;

import java.util.Scanner;

public class ParkingLotSimulator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y;
		String command = "foo";
		System.out.printf("주차장 크기(행과 열)를 입력하세요: ");
		x = scanner.nextInt(); y = scanner.nextInt();
		System.out.println("이준표 근무를 시작합니다.\n");
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
		
		while(!command.equals("퇴근")) {
			p.showStatus();
			System.out.printf("차량 번호를 입력하세요: ");
			command = scanner.next();
			if(!command.equals("퇴근"))
				p.carHandler(command);
		}
		System.out.println("이준표 퇴근합니다.");
		scanner.close();
	}
}