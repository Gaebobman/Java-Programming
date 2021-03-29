package packageB;

import packageA.A;

class B extends A{
	public void print() {
//		System.out.println(privateVal);
//		System.out.println(defaultVal);
		System.out.println(protectedVal); // 상속받은 클래스에서는 사용가능하지만
		System.out.println(publicVal);
	}
}
public class TestB {

	public static void main(String[] args) {
		B objB = new B();
//		System.out.println(objB.privateVal);
//		System.out.println(objB.defaultVal);
//		System.out.println(objB.protectedVal); // 여기서는 패키지가 달라서 못쓴다.
		System.out.println(objB.publicVal);
		

	}

}
