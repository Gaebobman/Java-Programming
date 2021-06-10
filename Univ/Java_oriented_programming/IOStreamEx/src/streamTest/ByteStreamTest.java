package streamTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest {
	//바이너리 파일 쓰기
	public static void main(String[] args) throws IOException {
		byte [] buf = {1,2,3,5,6,7};
		FileOutputStream fout = new FileOutputStream("test.txt");
		for(int i = 0 ; i < buf.length;i++) {
			fout.write(buf[i]);
		}
		//or  fout.write(buf);
		fout.close();
		
		byte [] copyBuf = new byte[256];
		FileInputStream fin = new FileInputStream("test.txt");
		int c;
		int cnt = 0;
		while ((c= fin.read())!= -1) {
			copyBuf[cnt++] = (byte)c;
		}
		for(int i =0  ; i < cnt ; i++)
			System.out.print(buf[i] + " ");
		fin.close();
	}

}
