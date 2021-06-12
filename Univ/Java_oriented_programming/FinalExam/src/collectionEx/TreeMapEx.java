package collectionEx;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();
		map.put("A", "A");
		map.put("P", "P");
		map.put("P2", "P");	//���� �ߺ��� �����ϳ� Ű�� �ߺ��� �Ұ��� ���� ���δ�.
		map.put("L", "L");
		map.put("E", "E");
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println("Key[" + key + "] value [" + value + "]");
		}
		// ũ���� ��µ�
	}

}
