package collectionEx;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		LinkedHashSet <String> set = new LinkedHashSet<>();	//�ڷ��� �߷�
		// ���Լ������ ���
		set.add("A");
		set.add("P");
		set.add("P");
		set.add("L");
		set.add("E");
		
		//set.remove("P");
		//System.out.println(set); //toString() Method 
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}


	}

}
