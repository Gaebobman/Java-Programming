package collectionEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("A");
		set.add("P");
		set.add("P");
		set.add("L");
		set.add("E");
		
		set.remove("P");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String e= it.next();
			System.out.println(e);
		}
		
	}

}
