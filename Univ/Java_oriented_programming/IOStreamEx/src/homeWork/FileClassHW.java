package homeWork;

import java.io.File;
import java.util.Scanner;
	
public class FileClassHW {
	
	public static int listDirectory(File dir) {
		File[] subFiles = dir.listFiles(); 
		if(subFiles == null) {
			//존재하지 않는 디렉토리거나 파일일 경우
			return -1;
		}
		if((subFiles != null)) {
			for(int i=0; i<subFiles.length; i++) {
				File f = subFiles[i];
				//long t = f.lastModified();
				if(f.isFile()) {
					System.out.println("[F] " +f.getName());
				}else if (f.isDirectory()) {
					System.out.println("[D] " +f.getName());
				}
			}	
		}
		System.out.print(dir.getPath()+ ">>");
		return 0;

	}
	
	public static void main(String[] args) {
		File f1 = new File("c:\\");		
		listDirectory(f1); 
		Scanner scanner = new Scanner(System.in);
		String command = null;
		String path = null;
		int flag = 0;
		while(!(command = scanner.nextLine()).equals("exit")) {
			if(command.equals("..")) {
				path = f1.getParent();
				f1 = new File(path);
				listDirectory(f1); 
			}else {
				path = f1.getPath() +"\\"+ command;
				//System.out.println(path);
				f1 = new File(path);
				flag = listDirectory(f1);
				if(flag == -1) {
					path = path.substring(0, (path.length() - command.length()));
					f1 = new File(path);
					listDirectory(f1);
				}
			}
		}
		scanner.close();
	}

}
