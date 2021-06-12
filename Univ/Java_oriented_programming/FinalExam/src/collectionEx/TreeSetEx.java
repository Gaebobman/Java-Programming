package collectionEx;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		//RED-BLACK TREE에 원소를 저장
		set.add("A");
		set.add("P");
		set.add("P");
		set.add("L");
		set.add("E");
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

	}

}
