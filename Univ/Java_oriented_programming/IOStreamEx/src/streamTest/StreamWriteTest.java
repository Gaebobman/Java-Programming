package streamTest;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class StreamWriteTest {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout2 = new FileOutputStream("test2.txt");
		fout2.write('��');
		fout2.close();
		
		FileWriter fout = new FileWriter("test1.txt");
		fout.write('��');
		String str = "��� apple �Ｚ samsung";
		fout.write(str.toCharArray(), 3,str.length() -3);
		fout.close();
	}

}
