package crnChecker;

import java.util.Scanner;

public class CRNCheckerTest {
//	static String crn = "220-81-62517";//���̹� ����ڵ�Ϲ�ȣ
//	static String badcrn1 = "220-81-62516";//������ȣ�� ���� �ʴ� ����� ��Ϲ�ȣ
//	static String badcrn2 = "220-81-6251";//���̰� ���� �ʴ� ����� ��Ϲ�ȣ
//	static String badcrn3 = "220-C1-6f5a7";//���ڰ� �ƴ� ����� ��Ϲ�ȣ
	
	public static void main(String[] args) {
		System.out.println("12171735 ����ǥ");
		CRNChecker checker = new CRNChecker();
		String command = "y";
		String crn = "";
		Scanner scanner = new Scanner(System.in);
		while(command.equals("y")) {
			System.out.print("����� ��Ϲ�ȣ�� �Է����ּ���. \n����: 1234-56-7890\n>>");
			crn = scanner.nextLine();
			crn = crn.trim();	//����ڰ� �յڷ� ���鹮�ڸ� ������ ���� ����
			if(checker.verifyLength(crn))
				System.out.println("��ȿ�� �����Դϴ�.");
			else
				System.out.println("���̿���: ����� ��Ϲ�ȣ�� Dash(-)���� 12���Դϴ�.");
			checker.verifyNumeric(crn);
			checker.validateCRN(crn);
			
			System.out.print("\n����Ͻðڽ��ϱ�? y/n \n>>");
			command = scanner.nextLine();
			System.out.print("\n");
			
		
		}
	
		

		
		
		scanner.close();
	}
	

}
