package collectionTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryEx {

	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		String command = "";
		dic.put("java", "�ڹ�");
		dic.put("map", "����");
		dic.put("school", "�б�");
		
		do {
			System.out.println("�ܾ �Է��Ͻÿ�");
			command = scanner.next();
			if(command.equals("quit"))
				break;
			System.out.println(dic.get(command));
			
			
		}while(true);
		
		
	}

}
