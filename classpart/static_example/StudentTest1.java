package classpart.static_example;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.SetStudentName("����ǥ");
		//System.out.println("����ǥ Serial Number " +studentLee.serialNum);
		System.out.println("����ǥ Serial Number " +Student.serialNum);
		studentLee.serialNum++;					
		
		Student studentSon = new Student();
		studentSon.SetStudentName("�����");
		System.out.println("����� Serial Number " + studentSon.serialNum);
	
	
	}

}
