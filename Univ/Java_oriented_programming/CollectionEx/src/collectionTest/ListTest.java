package collectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("P");
		list.add("P");
		list.add("L");
		list.add("E");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	
		int idx = Collections.binarySearch(list, "L");
		System.out.println(idx);
		
	}

}
