package java2021.Week_2nd;

import java.util.Scanner;
public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		
		String name = scanner.next();
		String city = scanner.next();
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean marry= scanner.nextBoolean();
		scanner.close();
		System.out.println("�̸��� " + name + ", " + "���ô� " + city + ", "+
		"���̴� " + age + "��, " +"ü���� "+ weight + " ���ſ��δ� "+ marry +"�Դϴ�."); 
		
	}

}
