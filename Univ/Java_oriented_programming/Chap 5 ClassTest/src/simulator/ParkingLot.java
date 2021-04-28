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