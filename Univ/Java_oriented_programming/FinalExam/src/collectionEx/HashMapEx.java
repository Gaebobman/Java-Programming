package collectionEx;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("A", "A");
		map.put("P", "P");
		map.put("P2", "P");	//값의 중복은 가능하나 키의 중복은 불가능 함을 보인다.
		map.put("L", "L");
		map.put("E", "E");
		
		Iterator <String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			String value = map.get(key);
			
			System.out.println("Key[" + key + "] value [" + value + "]");
			
			
		}
		
		
	}

}
