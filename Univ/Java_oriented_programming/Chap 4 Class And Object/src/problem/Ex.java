package problem;

import java.util.Scanner;

class Rectangle{
	int width;
	int height;
	
	public int getArea(int width, int height) {
		int tmp = width* height;
		return tmp;
	}
}
public class Ex {

	public static void main(String[] args) {
		Rectangle myrec = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		int a, b;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println(myrec.getArea(a,b));
		
		scanner.close();
	}

}
