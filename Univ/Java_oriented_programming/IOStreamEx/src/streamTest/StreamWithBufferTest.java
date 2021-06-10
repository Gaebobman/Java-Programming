package streamTest;

import java.io.FileReader;
import java.io.IOException;

public class StreamWithBufferTest {
	public static void main(String[] args) throws IOException {
		
		char [] buf = new char[256];
		FileReader fin = new FileReader("test.txt");
		fin.read(buf);
		System.out.println(buf);
		fin.close();
				
	}

}
