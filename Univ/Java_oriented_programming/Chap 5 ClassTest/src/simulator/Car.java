package simulator;

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
