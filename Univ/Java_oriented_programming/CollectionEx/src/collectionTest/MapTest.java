package collectionTest;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("A", "A");
		map.put("P", "P");
		map.put("P2", "P");
		map.put("L", "L");
		map.put("E", "E");
		System.out.println(map); 	//중복제거, 순서 예측불가
		
	}

}
