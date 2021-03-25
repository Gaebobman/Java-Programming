import java.util.Scanner;

public class ExException {
	public static int divide(int a, int b) {
		
		int tmp =0;
		try {
			tmp = a / b;
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("0���� ���������ϴ�.");
		}
		finally {
			return tmp;			
		}
	}

	public static void main(String[] args) {
		int diviend= 0;
		int divisor = 0;
		int result = 0;
		System.out.println("�� ������ �Է��Ͻÿ�.");
		Scanner scanner = new Scanner(System.in);
		diviend = scanner.nextInt();
		divisor = scanner.nextInt();
		
		try {
			result = divide(diviend , divisor);
			System.out.println("Try");
			
		}catch(ArithmeticException e) {
			/*ArithmeticException �� Unchecked Exception
			 * �̳��� ����ü(Exception���� �ص� ������.
			 * �׷��� �������� �ʴ´�. (�������� ������ ���� ����ĳġ���� ����ϴ°��� ����)
			 */
			System.out.println(e.getMessage());
			System.out.println("Catch");
		}
		finally {
			System.out.println("Finally");
		}
		
		
		System.out.println("result : " + result);
		scanner.close();
		
	}

}
