package exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex1ReadWithLineNum {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new FileReader("c:\\windows\\system.ini"));
			String s = null;
			int lineNumber = 1;
			while (sc.hasNext()) {
				s = sc.nextLine();
				System.out.printf("%4d: ", lineNumber++);
				System.out.println(s);

			}
			sc.close();
			
		} catch (IOException e) {
			System.out.println("오류발생");
		}

	}
	
}
