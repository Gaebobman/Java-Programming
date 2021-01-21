package classpart.static_example;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.SetStudentName("¿Ã¡ÿ«•");
		//System.out.println("¿Ã¡ÿ«• Serial Number " +studentLee.serialNum);
		System.out.println("¿Ã¡ÿ«• Serial Number " +Student.serialNum);
		studentLee.serialNum++;					
		
		Student studentSon = new Student();
		studentSon.SetStudentName("º’»ÔπŒ");
		System.out.println("º’»ÔπŒ Serial Number " + studentSon.serialNum);
	
	
	}

}
