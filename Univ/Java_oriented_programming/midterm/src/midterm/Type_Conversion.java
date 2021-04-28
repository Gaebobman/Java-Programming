package midterm;

public class Type_Conversion {

	public static void main(String[] args) {
		double result = 0;
		result = 10/4;
		System.out.println(result);
		result = 10/(double)4;
		System.out.println(result);
		int a = 2, b =2;
		b /=a * 2 % ++a;
		System.out.println(b);
	}

}
