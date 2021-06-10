package streamTest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c ;
		try {
			fout = new FileWriter("FileWriteTest.txt");
			while(true) {
				String line = scanner.nextLine();
				if(line.length() == 0)
					break;
				fout.write(line, 0,line.length());
				fout.write("\n",0,1);
			}
			fout.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}

}
