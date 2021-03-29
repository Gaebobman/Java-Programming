package packageA;

public class A{
	private int privateVal = 1;
			int defaultVal = 1;
	protected int protectedVal= 1;
	public int publicVal = 1;
	public void print() {
		System.out.println(privateVal);
		System.out.println(defaultVal);
		System.out.println(protectedVal);
		System.out.println(publicVal);
		
	}
}

class TestA {

	public static void main(String[] args) {
		A objA = new A();
//		System.out.println(objA.privateVal);
		System.out.println(objA.defaultVal);
		System.out.println(objA.protectedVal);
		System.out.println(objA.publicVal);
		

	}

}
