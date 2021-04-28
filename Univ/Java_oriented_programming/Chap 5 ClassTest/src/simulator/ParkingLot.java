package simulator;

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