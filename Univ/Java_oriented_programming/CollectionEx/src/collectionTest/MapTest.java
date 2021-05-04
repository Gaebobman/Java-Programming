package collectionTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
//		HashMap<String, String> map = new HashMap<>(); //정렬안된 Map
		Map<String, String> map = new TreeMap<>();	//정렬된 Map
		map.put("A", "A");
		map.put("P", "P");
//		map.put("P2", "P");
		map.put("L", "L");
		map.put("E", "E");
		System.out.println(map); 	//중복제거, 순서 예측불가
		
//		Iterator<String> it = map.keySet().iterator(); 	//Iterator 타입을 명시
//		while(it.hasNext()) {
//			String key = it.next();
//			System.out.println(map.get(key));
//		}
//		
//		for(String e : map.keySet()) {
//			System.out.println(map.get(e));
//		}
		
		for(Map.Entry<String , String> e : map.entrySet()) {
			String key = e.getKey();
			String value = e.getValue();
			System.out.println(value);
		}
	}

}
