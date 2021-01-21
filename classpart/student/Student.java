package classpart.student;

public class Student {
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	//자동으로 Getter Setter 생성 / 우클릭 -> source -> generate getters and setters
	

	int studentId;
	String studentName;
	int grade;
	String address;
	
	Subject korean;
	Subject math;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
