import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		ArrayList<String> names = new ArrayList<String>();
		for(int i = 0 ; i <4 ;i++) {
			System.out.println("�̸��� �Է��ϼ��� >>");
			String name = sc.next();
			names.add(name);
		}
		
		for(int i =0 ; i < 4; i++) {
			System.out.print(names.get(i)+ " ");
		}
		System.out.println();
	}

}
