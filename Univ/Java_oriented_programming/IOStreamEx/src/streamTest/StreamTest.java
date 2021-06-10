package streamTest;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamTest {
	public static void main(String[] args)throws IOException {
		// 문자스트림: 텍스트 파일을 읽어서(FileReader) 모니터 출력(System.out)
		// c:\windows\system.ini
		FileInputStream fin1 = new FileInputStream("test.txt");	//바이트 스트림
		FileReader fin2 = new FileReader("test.txt"); //문자 스트림
		
		FileInputStream fin3 =new FileInputStream("test.txt");
		InputStreamReader in = new InputStreamReader(fin3);
		
		System.out.println((char)fin1.read()); //2바이트짜리 유니코드를 1바이트로 읽어와서 예상치못한 값이 나옴 (영어는 오류 없음)
		System.out.println((char)fin2.read());
		System.out.println((char)in.read());
		fin1.close(); //객체 해제
		fin2.close(); //객체 해제
		in.close();
	}

}
