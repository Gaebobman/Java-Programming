package classpart.student;

public class Student {
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	//�ڵ����� Getter Setter ���� / ��Ŭ�� -> source -> generate getters and setters
	

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
