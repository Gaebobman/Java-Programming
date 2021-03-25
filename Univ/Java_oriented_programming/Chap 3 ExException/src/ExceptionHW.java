import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHW {

	public static void main(String[] args) {
		int inputNumber = 0; //  ����ڷκ��� �Է¹��� ����.
		String doAgain = "y"; // �ٽ� �Ͻðڽ��ϱ� / yes or no
		int numOfAttempts = 0; // ����� �õ����� ������ ������� ���� ����
		int randNum = (int)(Math.random()*100) +1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�й�: 12171735 �̸�: ����ǥ \nGuess what(1~100)!");
			while(doAgain.equals("y")) {
				try {
				System.out.print("Input>");
				inputNumber = scanner.nextInt();
				numOfAttempts++; // ����ڰ� ������ �Է� �������� �õ� Ƚ���� ������ŵ�ϴ�.
				
				if(inputNumber == randNum) {
					System.out.println("����!! "+ numOfAttempts+"������ ����!");
					System.out.println("�ٽ��Ͻðڽ��ϱ�(y/n)>");
					//�������� Ȯ���� ����ڿ��� �ٽ� �������� �����ϴ�.
					
						doAgain = scanner.next();//y�Է½� ����� n �Է½� ����
						if(!doAgain.equals("y") && !doAgain.equals("n")) {
							while(!doAgain.equals("y") && !doAgain.equals("n")) {
								System.out.println("y�� n�� �Է��ϼ���!");
								//����ڰ� y �Ǵ� n�� �ƴ� char�� �Է��Ͽ����� ���
								doAgain = scanner.next();
							}
						}
					
					randNum = (int)(Math.random()*100) +1;
					numOfAttempts = 0;
				}else if(inputNumber > randNum){
					System.out.println("Down"); 
				}else {
					System.out.println("Up");
				}
			
			}catch(InputMismatchException e){
				//������ �ƴ� ���� �Է��ϰ� �Ǹ� catch�ϰ� �˴ϴ�.
				System.out.println("������ �Է��ϼ���.");
				scanner.nextLine(); 
				//���ۿ� ���๮�ڰ� ����������츦 ����Ͽ� scanner�� ���๮�ڸ� ó���ϰ� �մϴ�.
			}
			
		}
		scanner.close();
	}

}