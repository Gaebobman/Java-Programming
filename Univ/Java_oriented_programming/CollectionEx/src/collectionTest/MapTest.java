package collectionTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
//		HashMap<String, String> map = new HashMap<>(); //���ľȵ� Map
		Map<String, String> map = new TreeMap<>();	//���ĵ� Map
		map.put("A", "A");
		map.put("P", "P");
//		map.put("P2", "P");
		map.put("L", "L");
		map.put("E", "E");
		System.out.println(map); 	//�ߺ�����, ���� �����Ұ�
		
//		Iterator<String> it = map.keySet().iterator(); 	//Iterator Ÿ���� ���
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
