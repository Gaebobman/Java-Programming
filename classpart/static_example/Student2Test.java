package classpart.static_example;

public class Student2Test {

	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("����ǥ");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentLee.getStudentName() + " �й� " + studentLee.studentID);
	
		Student2 studentSon = new Student2();
		studentSon.setStudentName("�����");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.getStudentName() + " �й� " + studentSon.studentID);
	}

}
