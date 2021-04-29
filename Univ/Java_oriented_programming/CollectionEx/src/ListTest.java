import java.util.ArrayList;
import java.util.List;


public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//list.ensureCapacity(4);
		list.add("milk");
		list.add("bread");
		list.add("butter");
		list.add(1, "apple");
		System.out.println(list);
		
		list.set(2, "grape");
		list.remove(3);
		
		System.out.println(list);
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
