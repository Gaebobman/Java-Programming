package collectionTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryEx {

	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		String command = "";
		dic.put("java", "자바");
		dic.put("map", "지도");
		dic.put("school", "학교");
		
		do {
			System.out.println("단어를 입력하시오");
			command = scanner.next();
			if(command.equals("quit"))
				break;
			System.out.println(dic.get(command));
			
			
		}while(true);
		
		
	}

}
