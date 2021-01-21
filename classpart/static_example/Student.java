package classpart.static_example;

public class Student {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void SetStudentName(String name) {
		this.studentName= name;
	}
}
