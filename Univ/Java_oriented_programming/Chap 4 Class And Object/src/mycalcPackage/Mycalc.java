package mycalcPackage;

class Calc{
	int x;
	public static int max (int a , int b) {
		 
		return (a>b)? a: b;
	}
	public static int min (int a, int b) {
		return (a<b)? a: b;
	}
}
public class Mycalc {

	public static void main(String[] args) {
		System.out.println(Calc.max(10, 5));
		System.out.println(Calc.min(10, 5));
	}

}
