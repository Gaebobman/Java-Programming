package streamTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopyEx {

	public static void main(String[] args) throws IOException{
		String src = "c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg";
		String des = "copyimg.jpg";
		
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(des);
		
		int c;
		while((c = fis.read())!= -1) {
			fos.write((byte)c );
		}
		
		fis.close();
		fos.close();
	}

}
