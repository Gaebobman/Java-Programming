package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	int number;
	String name;
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {		
		return this.number - o.number;
	}	
}

public class ComparableTest {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(2017001, "È«±æµ¿"));
		list.add(new Student(2017002, "¼¼Á¾´ë¿Õ"));
		list.add(new Student(2017003, "±èÀ¯½Å"));
		list.add(new Student(2017004, "À»Áö¹®´ö"));
		list.add(new Student(2017005, "±¤°³Åä´ë¿Õ"));
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);


	}

}
