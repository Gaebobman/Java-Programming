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
			System.out.println("등록되지 않은 차량입니다.\n");
		else { // 등록된 차량일 때.
			if(isParked(car)) {
				exitCar(car);
			}else if(numberOfCars == maxParkingSpace) {
				System.out.println("만차입니다.\n");
			}else {
				parkCar(car);
			}	
		}
	}
	
	
	public void showStatus() {
		for(int i = 0 ; i< parkedCars.length;i++) {
			for(int j = 0; j < parkedCars[i].length; j++) {//배열을 하나씩 출력한다.
				System.out.print("(" + i + "," + j +")"+ " :");
				if(parkedCars[i][j] != null) {	//자리에 차가 있으면
					System.out.print(parkedCars[i][j].getPlateNum()+
							"(" +parkedCars[i][j].getOwnerName() + ")" +  " ");
				}else {	//자리에 차가 없으면
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
	
	public void registerCar(Car car, int i) { // 차량을 등록시킵니다, main에서 초깃값세팅시 사용합니다.					
		registeredCars[i] = car;
	}
	
	public void parkCar(Car car) {
		for(int i = 0 ; i< parkedCars.length;i++) {
			for(int j = 0; j < parkedCars[i].length; j++) {
				if(parkedCars[i][j] == null) {	//빈자리가 있으면
					parkedCars[i][j] = car;		//차량을 주차시키고
					System.out.println(car.getPlateNum() + "번 차량"
							+ "(" + i + ", " + j + ")에 주차했습니다.\n");
					//메세지를 출력한다.
					this.numberOfCars++;
					return;
					//그리고 전체 차량 수를 증가시킨다.
				}
			}
		}
	}

	public void exitCar(Car car) {
		for(int i = 0 ; i< parkedCars.length;i++) {
			for(int j = 0; j < parkedCars[i].length; j++) {
				if(parkedCars[i][j] == car) {
					parkedCars[i][j] = null;
					System.out.println("차주 " + car.getOwnerName()+ ", " 
					+ car.getPlateNum() +" 번 차량 출차했습니다.\n");
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
		System.out.printf("주차장 크기(행과 열)를 입력하세요: ");
		x = scanner.nextInt(); y = scanner.nextInt();
		System.out.println("이준표 근무를 시작합니다.\n");
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