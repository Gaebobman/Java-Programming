import java.util.Scanner;

public class ExException {
	public static int divide(int a, int b) {
		
		int tmp =0;
		try {
			tmp = a / b;
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("0으로 나누었습니다.");
		}
		finally {
			return tmp;			
		}
	}

	public static void main(String[] args) {
		int diviend= 0;
		int divisor = 0;
		int result = 0;
		System.out.println("두 정수를 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		diviend = scanner.nextInt();
		divisor = scanner.nextInt();
		
		try {
			result = divide(diviend , divisor);
			System.out.println("Try");
			
		}catch(ArithmeticException e) {
			/*ArithmeticException 은 Unchecked Exception
			 * 이놈의 조상객체(Exception으로 해도 잡힌다.
			 * 그러나 권장하지 않는다. (여러가지 에러에 대해 다중캐치문을 사용하는것이 나음)
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
