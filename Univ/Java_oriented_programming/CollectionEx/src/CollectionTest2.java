import java.util.HashSet;
import java.util.Set;

public class CollectionTest2 {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		s1.add("A");
		s1.add("B");
		s1.add("C");

		Set<String> s2 = new HashSet<String>();
		s2.add("A");
		s2.add("D");
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		
		Set<String> union = new HashSet<String>(s1);
		union.addAll(s2);

		Set<String> intersection = new HashSet<String>(s1);
		intersection.retainAll(s2);

		Set<String> difference = new HashSet<String>(s1);
		difference.removeAll(s2);
		System.out.println("합집합 " + union);
		System.out.println("교집합 " + intersection);
		System.out.println("차집합 " + difference);

	}

}
