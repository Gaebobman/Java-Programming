import java.util.HashSet;
import java.util.Iterator;

public class SetEx {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("A");
		set.add("P");
		set.add("P");
		set.add("L");
		set.add("E");
	
		System.out.println(set);
		
		//set.remove("P");
		//System.out.println(set);
		
		System.out.println("Iterator를 사용한 순회 \n");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
		
		System.out.println("\nfor each 문을 사용한 순회");
		for( String e : set ) {
			System.out.println(e);
		}
	}

}
