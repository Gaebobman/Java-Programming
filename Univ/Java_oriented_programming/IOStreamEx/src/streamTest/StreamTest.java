package streamTest;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamTest {
	public static void main(String[] args)throws IOException {
		// ���ڽ�Ʈ��: �ؽ�Ʈ ������ �о(FileReader) ����� ���(System.out)
		// c:\windows\system.ini
		FileInputStream fin1 = new FileInputStream("test.txt");	//����Ʈ ��Ʈ��
		FileReader fin2 = new FileReader("test.txt"); //���� ��Ʈ��
		
		FileInputStream fin3 =new FileInputStream("test.txt");
		InputStreamReader in = new InputStreamReader(fin3);
		
		System.out.println((char)fin1.read()); //2����Ʈ¥�� �����ڵ带 1����Ʈ�� �о�ͼ� ����ġ���� ���� ���� (����� ���� ����)
		System.out.println((char)fin2.read());
		System.out.println((char)in.read());
		fin1.close(); //��ü ����
		fin2.close(); //��ü ����
		in.close();
	}

}
