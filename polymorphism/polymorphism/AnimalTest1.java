package polymorphism;
import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("�ΰ��� �����Դϴ�.");
	}
	public void read() {
		System.out.println("����� å�� �д´�.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �����Դϴ�.");
	}
	
	public void hunt() {
		System.out.println("ȣ���̰� ����� �Ѵ�.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("������ ����.");
	}
	
	public void fly() {
		System.out.println("�������� �ָ� ���ư���.");
	}
}

public class AnimalTest1{
	ArrayList <Animal> aniList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.addAnimal();
		//�̶� �� ����� move()�� ������ �� ���·� ȣ�Ⱑ�������� 
		// read() / hunt() / fly()�� ȣ���� �Ұ���
		System.out.println("\n���� ������ �ٿ�ĳ����\n");
		aTest.testCasting();
		
	}
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList) {
			ani.move();
		}
	}
	
	public void testCasting() {
		for(int i = 0 ; i < aniList.size(); i++) {
			Animal ani = aniList.get(i);
			if(ani instanceof Human) {		//instanceof �� ���� �ν��Ͻ����� Ȯ��
				Human h = (Human)ani;
				h.read();
			}
			else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunt();
			}
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.fly();
			}else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
		}
	}
	
	
	

	 /*
	public void moveAnimal(Animal animal) {
		animal.move();
	}*/

	
}


