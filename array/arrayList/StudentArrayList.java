package arrayList;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student1> school = new ArrayList<Student1>();
		
		school.add(new Student1("James"));
		school.add(new Student1("Tomas"));
		school.add(new Student1("Edward"));
		
		for(Student1 student : school){
			student.showStudentInfo();
		}

	}

}
