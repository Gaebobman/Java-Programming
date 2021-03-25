package java2021.Week_2nd;

import java.util.Scanner;
public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		
		String name = scanner.next();
		String city = scanner.next();
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean marry= scanner.nextBoolean();
		scanner.close();
		System.out.println("이름은 " + name + ", " + "도시는 " + city + ", "+
		"나이는 " + age + "살, " +"체중은 "+ weight + " 독신여부는 "+ marry +"입니다."); 
		
	}

}
