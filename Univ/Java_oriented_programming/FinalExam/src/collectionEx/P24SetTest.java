package collectionEx;

import java.util.HashSet;
import java.util.Set;

public class P24SetTest {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		s1.add("A");
		s1.add("B");
		s1.add("C");
		
		Set<String> s2 = new HashSet<>();
		s2.add("A");
		s2.add("D");
		
		Set<String> union = new HashSet<>(s1);
		Set<String> intersection = new HashSet<>(s1);
		
		union.addAll(s2);
		intersection.retainAll(s2);
		
		System.out.println("합집합: " + union);
		System.out.println("교집합: " + intersection);
	}

}
