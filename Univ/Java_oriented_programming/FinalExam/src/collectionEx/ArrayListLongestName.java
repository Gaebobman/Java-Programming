package collectionEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLongestName {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 4 ; i++) {
			System.out.println("�̸��� �Է��ϼ���>>");
			String s = scanner.next();
			list.add(s);
		}
		

		for(int i = 0 ; list.size() < 4 ; i++) {
			System.out.print(list.get(i));
		}
		
		int longestIdx =  0 ;
		
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(longestIdx).length() < list.get(i).length()) {
				longestIdx =  i;
			}
		}
		System.out.println("���� �� �̸��� " + list.get(longestIdx));

	}

}
