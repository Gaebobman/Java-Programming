package classpart.static_example;

public class Student2Test {

	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("ÀÌÁØÇ¥");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentLee.getStudentName() + " ÇĞ¹ø " + studentLee.studentID);
	
		Student2 studentSon = new Student2();
		studentSon.setStudentName("¼ÕÈï¹Î");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.getStudentName() + " ÇĞ¹ø " + studentSon.studentID);
	}

}
