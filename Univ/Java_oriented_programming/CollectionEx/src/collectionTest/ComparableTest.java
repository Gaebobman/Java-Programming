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
		list.add(new Student(2017001, "ȫ�浿"));
		list.add(new Student(2017002, "�������"));
		list.add(new Student(2017003, "������"));
		list.add(new Student(2017004, "��������"));
		list.add(new Student(2017005, "��������"));
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);


	}

}
