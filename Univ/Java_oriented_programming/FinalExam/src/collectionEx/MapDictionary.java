package collectionEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDictionary {

	public static void main(String[] args) {
		Map <String, String> dic = new HashMap<>();
		dic.put("map", "지도");
		dic.put("java", "자바");
		dic.put("school", "학교");
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("영어 단어를 입력하세요");
			String key = scanner.next();
			if(key.equals("quit")) break;
			
			System.out.println("단어의 의미는: " + dic.get(key));
		}while(true);
		scanner.close();
	}

}
