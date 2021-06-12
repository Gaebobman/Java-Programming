package collectionEx;

import java.util.HashMap;
import java.util.Map;

class Student{
	
	int number;
	String name;
	public Student(int number, String name) {
		this.name = name;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return name;
	}
}


public class MapEx {

	public static void main(String[] args) {
		Map <String, Student> st = new HashMap<String, Student>();
		st.put("20090001", new Student(20090001, "나"));
		st.put("20090002", new Student(20090002, "너"));
		st.put("20090003", new Student(20090003, "우리"));	
		System.out.println(st);
		
		st.remove("20090002");
		st.put("20090003", new Student(20090003, "전학"));
		
		System.out.println(st.get("20090003"));
		
		for(Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("Key[" + key + "] value [" + value + "]");
		}
	}

}
