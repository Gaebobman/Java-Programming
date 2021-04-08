package simulator;

import java.util.Scanner;

class Car{
	private String ownerName;
	private String plateNum;
	
	Car(String ownerName, String plateNum){
		this.ownerName = ownerName;
		this.plateNum = plateNum;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public String getPlateNum() {
		return plateNum;
	}
	
}

class ParkingLot {
	private Car[][] parkedCars;
	private Car[] registeredCars;
	private int numberOfCars;
	private int maxParkingSpace;
	
	
	public ParkingLot(int x, int y, int numberOfRegisteredCars){
		this.parkedCars = new Car[x][y];
		this.registeredCars = new Car[numberOfRegisteredCars];
		this.numberOfCars = 0;
		this.maxParkingSpace = x * y;
	}
	
	public void carHandler(String plateNumber) {
		Car car = null;
		for(int i = 0 ; i < registeredCars.length ; i++) {
			if(registeredCars[i].getPlateNum().equals(plateNumber)) {
				car = registeredCars[i];
				break;
			}			
		}
		if(car == null)
			System.out.println("��ϵ��� ���� �����Դϴ�.\n");
		else { // ��ϵ� ������ ��.
			if(isParked(car)) {
				exitCar(car);
			}else if(numberOfCars == maxParkingSpace) {
				System.out.println("�����Դϴ�.\n");
			}else {
				parkCar(car);
			}	
		}
	}
	
	
	public void showStatus() {
		for(int i = 0 ; i< parkedCars.length;i++) {
			for(int j = 0; j < parkedCars[i].length; j++) {//�迭�� �ϳ��� ����Ѵ�.
				System.out.print("(" + i + "," + j +")"+ " :");
				if(parkedCars[i][j] != null) {	//�ڸ��� ���� ������
					System.out.print(parkedCars[i][j].getPlateNum()+
							"(" +parkedCars[i][j].getOwnerName() + ")" +  " ");
				}else {	//�ڸ��� ���� ������
					System.out.print("______");
				}
				
			}
			System.out.println();
		}
	}
	
	public boolean isRegistered(Car car) {
		for(int i =0  ; i < registeredCars.length;i++) {
			if(registeredCars[i].getPlateNum().equals(car.getPlateNum())){
				return true;
			}
		}
		return false; 
	}
	
	public boolean isParked(Car car) {
		for(int i = 0 ; i< parkedCars.length;i++) {
			for(int j = 0; j < parkedCars[i].length; j++) {
				if(parkedCars[i][j] == car) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void registerCar(Car car, int i) { // ������ ��Ͻ�ŵ�ϴ�, main���� �ʱ갪���ý� ����մϴ�.					
		registeredCars[i] = car;
	}
	
	public void parkCar(Car car) {
		for(int i = 0 ; i< parkedCars.length;i++) {
			for(int j = 0; j < parkedCars[i].length; j++) {
				if(parkedCars[i][j] == null) {	//���ڸ��� ������
					parkedCars[i][j] = car;		//������ ������Ű��
					System.out.println(car.getPlateNum() + "�� ����"
							+ "(" + i + ", " + j + ")�� �����߽��ϴ�.\n");
					//�޼����� ����Ѵ�.
					this.numberOfCars++;
					return;
					//�׸��� ��ü ���� ���� ������Ų��.
				}
			}
		}
	}

	public void exitCar(Car car) {
		for(int i = 0 ; i< parkedCars.length;i++) {
			for(int j = 0; j < parkedCars[i].length; j++) {
				if(parkedCars[i][j] == car) {
					parkedCars[i][j] = null;
					System.out.println("���� " + car.getOwnerName()+ ", " 
					+ car.getPlateNum() +" �� ���� �����߽��ϴ�.\n");
					this.numberOfCars--;
				}
			}
		}
	}
}

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
		Car Ccar = new Car("Chalie", "2222"); 	p.registerCar(Ccar, 2);
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