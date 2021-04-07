package Hello1;

public class HelloWorld {

	public static double div(int a , int b)
	{
		double result;
		result = a/b;
		return result;
	}
	public static void main(String[] args) {
		
		int x = 5;
		double y = div(x,3);
		
		
		System.out.println("Hello World! y = "+ y);
		
	}

}
