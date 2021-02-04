
public class ZooKeeper {
	//이렇게 작성하면 동물이 추가될 때 마다 feed()메소드를  추가해야하겠지??
	/*public void feed(Tiger tiger) {
		System.out.println("Feed apple");
	}

	public void feed(Lion lion) {
		System.out.println("Feed banana");
	}
		*/
	
	public void feed(Predator predator) {
	    System.out.println("Feed " + predator.getFood());
	}

	public static void main(String[ ] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Crocodile crocodile = new Crocodile();
		
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		zooKeeper.feed(crocodile);
		
	}

}
/*
    물리적세계						자바세계
 
	컴퓨터						ZooKeeper
	USB 포트						Predator
	하드디스크, 디지털카메라,...		Tiger, Lion, Crocodile,...
 */


