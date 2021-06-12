package collectionEx;

import java.util.*;

public class CollectionsEx {
	
	public static void main(String[] args) {
		String [] sample = {"I", "walk", "the", "line"};
		List<String> list = Arrays.asList(sample);
		Collections.sort(list);
		System.out.println(list);
		
		
	}
}
