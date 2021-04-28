
public class ExException3 {
	public static void someFunction() throws Exception {
		throw new Exception("MyException");
	}
	public static void main(String[] args) throws Exception{
		try {
			someFunction();
		} catch (Exception e) {
			System.out.println("main");
			//e.printStackTrace();
		}

	}

}
