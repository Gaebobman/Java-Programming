package streamTest;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class StreamWriteTest {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout2 = new FileOutputStream("test2.txt");
		fout2.write('사');
		fout2.close();
		
		FileWriter fout = new FileWriter("test1.txt");
		fout.write('사');
		String str = "사과 apple 삼성 samsung";
		fout.write(str.toCharArray(), 3,str.length() -3);
		fout.close();
	}

}
