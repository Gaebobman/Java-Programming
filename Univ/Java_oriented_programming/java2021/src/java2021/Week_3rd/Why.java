package java2021.Week_3rd;

import java.util.Scanner;

public class Why {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);		
//
//		System.out.print("������ �Է��ϼ���: ");
//		int time = scanner.nextInt(); 		// ���� �Է�
//		int second = time % 60; 				// 60���� ���� �������� ��
//		int minute = (time / 60) % 60; 	// 60���� ���� ���� �ٽ� 60���� ���� �������� ��
//		int hour = (time / 60) / 60; 		// 60���� ���� ���� �ٽ� 60���� ���� ���� �ð�
//		
//		System.out.print(time + "�ʴ� "); // �ٹٲ� ���� ���
//		System.out.print(hour + "�ð�, ");
//		System.out.print(minute + "��, ");
//		System.out.println(second + "���Դϴ�.");
//
//		scanner.close();

//		int a= 2; int b = 2;
//		b/= a * 2 % ++a;
//		System.out.println(a +"   " + b);
	
		short a = (short)0x55ff; //0101 0101 1111 1111
		short b = (short)0x00ff; //0000 0000 1111 1111

		// ��Ʈ �� ����
		System.out.println("[��Ʈ ���� ���]");
		System.out.printf("%04x\n", (short)(a & b)); // ��Ʈ AND
		System.out.printf("%04x\n", (short)(a | b)); // ��Ʈ OR
		System.out.printf("%04x\n", (short)(a ^ b)); // ��Ʈ XOR
		System.out.printf("%04x\n", (short)(~a)); // ��Ʈ NOT

		byte c = 20; // 0x14 0001 0100
		byte d = -8; // 0xf8 1111 1000

		// ��Ʈ ����Ʈ ����
		System.out.println("[����Ʈ ���� ���]");
		System.out.println(c <<2); // c�� 2��Ʈ ���� ����Ʈ
		System.out.println(c >>2); // c�� 2��Ʈ ������ ����Ʈ. 0 ����
		System.out.println(d >>2); // d�� 2��Ʈ ������ ����Ʈ. 1 ����
		System.out.printf("%x\n", (d >>>2)); // d�� 2��Ʈ ������ ����Ʈ. 0 ����

	
	}

}
