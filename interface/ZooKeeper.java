
public class ZooKeeper {
	//�̷��� �ۼ��ϸ� ������ �߰��� �� ���� feed()�޼ҵ带  �߰��ؾ��ϰ���??
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
    ����������						�ڹټ���
 
	��ǻ��						ZooKeeper
	USB ��Ʈ						Predator
	�ϵ��ũ, ������ī�޶�,...		Tiger, Lion, Crocodile,...
 */


