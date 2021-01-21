package arrayList;

public class Student {
	public static int number = 1000;
	private int studentID;
	private String name;
	
	Student(String StudentName){
		this.name = StudentName;
		number++;
		this.studentID = number;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID +","+ name);
	}
}
