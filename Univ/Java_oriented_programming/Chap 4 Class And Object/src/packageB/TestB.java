package packageB;

import packageA.A;

class B extends A{
	public void print() {
//		System.out.println(privateVal);
//		System.out.println(defaultVal);
		System.out.println(protectedVal); // ��ӹ��� Ŭ���������� ��밡��������
		System.out.println(publicVal);
	}
}
public class TestB {

	public static void main(String[] args) {
		B objB = new B();
//		System.out.println(objB.privateVal);
//		System.out.println(objB.defaultVal);
//		System.out.println(objB.protectedVal); // ���⼭�� ��Ű���� �޶� ������.
		System.out.println(objB.publicVal);
		

	}

}
