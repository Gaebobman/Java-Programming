package collectionEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDictionary {

	public static void main(String[] args) {
		Map <String, String> dic = new HashMap<>();
		dic.put("map", "����");
		dic.put("java", "�ڹ�");
		dic.put("school", "�б�");
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("���� �ܾ �Է��ϼ���");
			String key = scanner.next();
			if(key.equals("quit")) break;
			
			System.out.println("�ܾ��� �ǹ̴�: " + dic.get(key));
		}while(true);
		scanner.close();
	}

}
