package polymorphism;
import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("인간이 움직입니다.");
	}
	public void read() {
		System.out.println("사람이 책을 읽는다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 움직입니다.");
	}
	
	public void hunt() {
		System.out.println("호랑이가 사냥을 한다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리 난다.");
	}
	
	public void fly() {
		System.out.println("독수리가 멀리 날아간다.");
	}
}

public class AnimalTest1{
	ArrayList <Animal> aniList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.addAnimal();
		//이때 각 요소의 move()는 재정의 된 형태로 호출가능하지만 
		// read() / hunt() / fly()는 호출이 불가능
		System.out.println("\n원래 형으로 다운캐스팅\n");
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
			if(ani instanceof Human) {		//instanceof 로 실제 인스턴스형을 확인
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
				System.out.println("지원하지 않는 형입니다.");
			}
		}
	}
	
	
	

	 /*
	public void moveAnimal(Animal animal) {
		animal.move();
	}*/

	
}


